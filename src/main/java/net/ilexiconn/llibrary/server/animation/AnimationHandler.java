package net.ilexiconn.llibrary.server.animation;

import net.ilexiconn.llibrary.server.event.AnimationEvent;
import net.ilexiconn.llibrary.server.network.AnimationMessage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;

import org.apache.commons.lang3.ArrayUtils;

import fiskfille.lightsabers.common.network.ALNetworkManager;

/**
 * @author iLexiconn
 * @since 1.0.0
 */
public enum AnimationHandler
{
    INSTANCE;

    /**
     * Sends an animation packet to all clients, notifying them of a changed animation
     * 
     * @param entity the entity with an animation to be updated
     * @param animation the animation to be updated
     * @param <T> the entity type
     */
    public <T extends Entity & IAnimatedEntity> void sendAnimationMessage(T entity, Animation animation)
    {
        if (entity.worldObj.isRemote)
        {
            return;
        }
        entity.setAnimation(animation);
        for (EntityPlayer trackingPlayer : ((WorldServer) entity.worldObj).getEntityTracker().getTrackingPlayers(entity))
        {
            ALNetworkManager.networkWrapper.sendTo(new AnimationMessage(entity.getEntityId(), ArrayUtils.indexOf(entity.getAnimations(), animation)), (EntityPlayerMP) trackingPlayer);
        }
    }

    /**
     * Updates all animations for a given entity
     * 
     * @param entity the entity with an animation to be updated
     * @param <T> the entity type
     */
    public <T extends Entity & IAnimatedEntity> void updateAnimations(T entity)
    {
        if (entity.getAnimation() == null)
        {
            entity.setAnimation(IAnimatedEntity.NO_ANIMATION);
        }
        else
        {
            if (entity.getAnimation() != IAnimatedEntity.NO_ANIMATION)
            {
                if (entity.getAnimationTick() == 0)
                {
                    AnimationEvent event = new AnimationEvent.Start<>(entity, entity.getAnimation());
                    if (!MinecraftForge.EVENT_BUS.post(event))
                    {
                        sendAnimationMessage(entity, event.getAnimation());
                    }
                }
                if (entity.getAnimationTick() < entity.getAnimation().getDuration())
                {
                    entity.setAnimationTick(entity.getAnimationTick() + 1);
                    MinecraftForge.EVENT_BUS.post(new AnimationEvent.Tick<>(entity, entity.getAnimation(), entity.getAnimationTick()));
                }
                if (entity.getAnimationTick() == entity.getAnimation().getDuration())
                {
                    entity.setAnimationTick(0);
                    entity.setAnimation(IAnimatedEntity.NO_ANIMATION);
                }
            }
        }
    }
}
