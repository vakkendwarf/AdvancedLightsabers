package fiskfille.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelSwitchSectionJuggernaut extends ModelBase
{
    public ModelRenderer body1;
    public ModelRenderer top1;
    public ModelRenderer ring1;
    public ModelRenderer upperBody1;
    public ModelRenderer switchPlate;
    public ModelRenderer switchButton1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer top2;
    public ModelRenderer top4;
    public ModelRenderer top6;
    public ModelRenderer top8;
    public ModelRenderer top10;
    public ModelRenderer top12;
    public ModelRenderer top14;
    public ModelRenderer top16;
    public ModelRenderer top3;
    public ModelRenderer top5;
    public ModelRenderer top7;
    public ModelRenderer top9;
    public ModelRenderer top11;
    public ModelRenderer top13;
    public ModelRenderer top15;
    public ModelRenderer ring2;
    public ModelRenderer ring3;
    public ModelRenderer ring4;
    public ModelRenderer ring5;
    public ModelRenderer ring6;
    public ModelRenderer ring7;
    public ModelRenderer ring8;
    public ModelRenderer upperBody2;
    public ModelRenderer upperBody3;
    public ModelRenderer upperBody4;
    public ModelRenderer upperBody5;
    public ModelRenderer upperBody6;
    public ModelRenderer upperBody7;
    public ModelRenderer upperBody8;
    public ModelRenderer switchButton2;
    public ModelRenderer switchButton3;
    public ModelRenderer switchButton4;

    public ModelSwitchSectionJuggernaut()
    {
        textureWidth = 64;
        textureHeight = 32;
        top5 = new ModelRenderer(this, 0, 19);
        top5.setRotationPoint(0.0F, -2.0F, 3.62F);
        top5.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F);
        setRotateAngle(top5, 0.7853981633974483F, 0.0F, 0.0F);
        upperBody8 = new ModelRenderer(this, 0, 6);
        upperBody8.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperBody8.addBox(-1.5F, -5.0F, 2.62F, 3, 5, 1, 0.0F);
        setRotateAngle(upperBody8, 0.0F, -0.7853981633974483F, 0.0F);
        ring1 = new ModelRenderer(this, 0, 12);
        ring1.setRotationPoint(0.0F, -6.9F, 0.0F);
        ring1.addBox(-1.5F, -1.0F, 1.62F, 3, 1, 2, 0.0F);
        top6 = new ModelRenderer(this, 0, 15);
        top6.setRotationPoint(0.0F, 0.0F, 0.0F);
        top6.addBox(-1.5F, -4.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(top6, 0.0F, 2.356194490192345F, 0.0F);
        body7 = new ModelRenderer(this, 0, 0);
        body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7.addBox(-1.5F, -4.0F, 1.62F, 3, 4, 2, 0.0F);
        setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        body3 = new ModelRenderer(this, 0, 0);
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, -4.0F, 1.62F, 3, 4, 2, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        upperBody7 = new ModelRenderer(this, 0, 6);
        upperBody7.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperBody7.addBox(-1.5F, -5.0F, 2.62F, 3, 5, 1, 0.0F);
        setRotateAngle(upperBody7, 0.0F, -1.5707963267948966F, 0.0F);
        ring2 = new ModelRenderer(this, 0, 12);
        ring2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2.addBox(-1.5F, -1.0F, 1.62F, 3, 1, 2, 0.0F);
        setRotateAngle(ring2, 0.0F, 0.7853981633974483F, 0.0F);
        upperBody4 = new ModelRenderer(this, 0, 6);
        upperBody4.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperBody4.addBox(-1.5F, -5.0F, 2.62F, 3, 5, 1, 0.0F);
        setRotateAngle(upperBody4, 0.0F, 2.356194490192345F, 0.0F);
        ring8 = new ModelRenderer(this, 0, 12);
        ring8.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring8.addBox(-1.5F, -1.0F, 1.62F, 3, 1, 2, 0.0F);
        setRotateAngle(ring8, 0.0F, -0.7853981633974483F, 0.0F);
        top16 = new ModelRenderer(this, 0, 19);
        top16.setRotationPoint(0.0F, -2.0F, 3.62F);
        top16.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F);
        setRotateAngle(top16, 0.7853981633974483F, 0.0F, 0.0F);
        body8 = new ModelRenderer(this, 0, 0);
        body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8.addBox(-1.5F, -4.0F, 1.62F, 3, 4, 2, 0.0F);
        setRotateAngle(body8, 0.0F, -0.7853981633974483F, 0.0F);
        switchButton2 = new ModelRenderer(this, 9, 5);
        switchButton2.setRotationPoint(0.0F, 1.2F, 0.0F);
        switchButton2.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F);
        top8 = new ModelRenderer(this, 0, 15);
        top8.setRotationPoint(0.0F, 0.0F, 0.0F);
        top8.addBox(-1.5F, -4.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(top8, 0.0F, 3.141592653589793F, 0.0F);
        top10 = new ModelRenderer(this, 0, 15);
        top10.setRotationPoint(0.0F, 0.0F, 0.0F);
        top10.addBox(-1.5F, -4.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(top10, 0.0F, -2.356194490192345F, 0.0F);
        switchButton1 = new ModelRenderer(this, 9, 5);
        switchButton1.setRotationPoint(4.18F, -3.6F, 0.0F);
        switchButton1.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F);
        setRotateAngle(switchButton1, 0.0F, 1.5707963267948966F, 0.0F);
        ring4 = new ModelRenderer(this, 0, 12);
        ring4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring4.addBox(-1.5F, -1.0F, 1.62F, 3, 1, 2, 0.0F);
        setRotateAngle(ring4, 0.0F, 2.356194490192345F, 0.0F);
        top11 = new ModelRenderer(this, 0, 19);
        top11.setRotationPoint(0.0F, -2.0F, 3.62F);
        top11.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F);
        setRotateAngle(top11, 0.7853981633974483F, 0.0F, 0.0F);
        top14 = new ModelRenderer(this, 0, 15);
        top14.setRotationPoint(0.0F, 0.0F, 0.0F);
        top14.addBox(-1.5F, -4.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(top14, 0.0F, -0.7853981633974483F, 0.0F);
        upperBody5 = new ModelRenderer(this, 0, 6);
        upperBody5.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperBody5.addBox(-1.5F, -5.0F, 2.62F, 3, 5, 1, 0.0F);
        setRotateAngle(upperBody5, 0.0F, 3.141592653589793F, 0.0F);
        top7 = new ModelRenderer(this, 0, 19);
        top7.setRotationPoint(0.0F, -2.0F, 3.62F);
        top7.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F);
        setRotateAngle(top7, 0.7853981633974483F, 0.0F, 0.0F);
        upperBody1 = new ModelRenderer(this, 0, 6);
        upperBody1.setRotationPoint(0.0F, -4.4F, 0.0F);
        upperBody1.addBox(-1.5F, -5.0F, 2.62F, 3, 5, 1, 0.0F);
        ring7 = new ModelRenderer(this, 0, 12);
        ring7.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring7.addBox(-1.5F, -1.0F, 1.62F, 3, 1, 2, 0.0F);
        setRotateAngle(ring7, 0.0F, -1.5707963267948966F, 0.0F);
        body4 = new ModelRenderer(this, 0, 0);
        body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4.addBox(-1.5F, -4.0F, 1.62F, 3, 4, 2, 0.0F);
        setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        body6 = new ModelRenderer(this, 0, 0);
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, -4.0F, 1.62F, 3, 4, 2, 0.0F);
        setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        top9 = new ModelRenderer(this, 0, 19);
        top9.setRotationPoint(0.0F, -2.0F, 3.62F);
        top9.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F);
        setRotateAngle(top9, 0.7853981633974483F, 0.0F, 0.0F);
        switchPlate = new ModelRenderer(this, 10, 0);
        switchPlate.setRotationPoint(3.98F, -2.2F, 0.0F);
        switchPlate.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 1, 0.0F);
        setRotateAngle(switchPlate, 0.0F, 1.5707963267948966F, 0.0F);
        upperBody2 = new ModelRenderer(this, 0, 6);
        upperBody2.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperBody2.addBox(-1.5F, -5.0F, 2.62F, 3, 5, 1, 0.0F);
        setRotateAngle(upperBody2, 0.0F, 0.7853981633974483F, 0.0F);
        top12 = new ModelRenderer(this, 0, 15);
        top12.setRotationPoint(0.0F, 0.0F, 0.0F);
        top12.addBox(-1.5F, -4.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(top12, 0.0F, -1.5707963267948966F, 0.0F);
        upperBody6 = new ModelRenderer(this, 0, 6);
        upperBody6.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperBody6.addBox(-1.5F, -5.0F, 2.62F, 3, 5, 1, 0.0F);
        setRotateAngle(upperBody6, 0.0F, -2.356194490192345F, 0.0F);
        top1 = new ModelRenderer(this, 0, 15);
        top1.setRotationPoint(0.0F, -8.0F, 0.0F);
        top1.addBox(-1.5F, -4.0F, 1.62F, 3, 2, 2, 0.0F);
        top3 = new ModelRenderer(this, 0, 19);
        top3.setRotationPoint(0.0F, -2.0F, 3.62F);
        top3.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F);
        setRotateAngle(top3, 0.7853981633974483F, 0.0F, 0.0F);
        ring3 = new ModelRenderer(this, 0, 12);
        ring3.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3.addBox(-1.5F, -1.0F, 1.62F, 3, 1, 2, 0.0F);
        setRotateAngle(ring3, 0.0F, 1.5707963267948966F, 0.0F);
        switchButton3 = new ModelRenderer(this, 9, 5);
        switchButton3.setRotationPoint(0.0F, 1.2F, 0.0F);
        switchButton3.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F);
        top13 = new ModelRenderer(this, 0, 19);
        top13.setRotationPoint(0.0F, -2.0F, 3.62F);
        top13.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F);
        setRotateAngle(top13, 0.7853981633974483F, 0.0F, 0.0F);
        upperBody3 = new ModelRenderer(this, 0, 6);
        upperBody3.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperBody3.addBox(-1.5F, -5.0F, 2.62F, 3, 5, 1, 0.0F);
        setRotateAngle(upperBody3, 0.0F, 1.5707963267948966F, 0.0F);
        body5 = new ModelRenderer(this, 0, 0);
        body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5.addBox(-1.5F, -4.0F, 1.62F, 3, 4, 2, 0.0F);
        setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        top4 = new ModelRenderer(this, 0, 15);
        top4.setRotationPoint(0.0F, 0.0F, 0.0F);
        top4.addBox(-1.5F, -4.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(top4, 0.0F, 1.5707963267948966F, 0.0F);
        ring5 = new ModelRenderer(this, 0, 12);
        ring5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring5.addBox(-1.5F, -1.0F, 1.62F, 3, 1, 2, 0.0F);
        setRotateAngle(ring5, 0.0F, 3.141592653589793F, 0.0F);
        switchButton4 = new ModelRenderer(this, 9, 5);
        switchButton4.setRotationPoint(0.0F, 1.2F, 0.0F);
        switchButton4.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F);
        top15 = new ModelRenderer(this, 0, 19);
        top15.setRotationPoint(0.0F, -2.0F, 3.62F);
        top15.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F);
        setRotateAngle(top15, 0.7853981633974483F, 0.0F, 0.0F);
        top2 = new ModelRenderer(this, 0, 15);
        top2.setRotationPoint(0.0F, 0.0F, 0.0F);
        top2.addBox(-1.5F, -4.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(top2, 0.0F, 0.7853981633974483F, 0.0F);
        ring6 = new ModelRenderer(this, 0, 12);
        ring6.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring6.addBox(-1.5F, -1.0F, 1.62F, 3, 1, 2, 0.0F);
        setRotateAngle(ring6, 0.0F, -2.356194490192345F, 0.0F);
        body2 = new ModelRenderer(this, 0, 0);
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, -4.0F, 1.62F, 3, 4, 2, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        body1 = new ModelRenderer(this, 0, 0);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, -4.0F, 1.62F, 3, 4, 2, 0.0F);
        top4.addChild(top5);
        upperBody1.addChild(upperBody8);
        top1.addChild(top6);
        body1.addChild(body7);
        body1.addChild(body3);
        upperBody1.addChild(upperBody7);
        ring1.addChild(ring2);
        upperBody1.addChild(upperBody4);
        ring1.addChild(ring8);
        top1.addChild(top16);
        body1.addChild(body8);
        switchButton1.addChild(switchButton2);
        top1.addChild(top8);
        top1.addChild(top10);
        ring1.addChild(ring4);
        top10.addChild(top11);
        top1.addChild(top14);
        upperBody1.addChild(upperBody5);
        top6.addChild(top7);
        ring1.addChild(ring7);
        body1.addChild(body4);
        body1.addChild(body6);
        top8.addChild(top9);
        upperBody1.addChild(upperBody2);
        top1.addChild(top12);
        upperBody1.addChild(upperBody6);
        top2.addChild(top3);
        ring1.addChild(ring3);
        switchButton2.addChild(switchButton3);
        top12.addChild(top13);
        upperBody1.addChild(upperBody3);
        body1.addChild(body5);
        top1.addChild(top4);
        ring1.addChild(ring5);
        switchButton3.addChild(switchButton4);
        top14.addChild(top15);
        top1.addChild(top2);
        ring1.addChild(ring6);
        body1.addChild(body2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        GL11.glPushMatrix();
        GL11.glRotatef(90, 0, 1, 0);
        ring1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(switchButton1.offsetX, switchButton1.offsetY, switchButton1.offsetZ);
        GL11.glTranslatef(switchButton1.rotationPointX * f5, switchButton1.rotationPointY * f5, switchButton1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 0.9D, 0.8D);
        GL11.glTranslatef(-switchButton1.offsetX, -switchButton1.offsetY, -switchButton1.offsetZ);
        GL11.glTranslatef(-switchButton1.rotationPointX * f5, -switchButton1.rotationPointY * f5, -switchButton1.rotationPointZ * f5);
        switchButton1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(upperBody1.offsetX, upperBody1.offsetY, upperBody1.offsetZ);
        GL11.glTranslatef(upperBody1.rotationPointX * f5, upperBody1.rotationPointY * f5, upperBody1.rotationPointZ * f5);
        GL11.glScaled(0.6D, 0.6D, 0.6D);
        GL11.glTranslatef(-upperBody1.offsetX, -upperBody1.offsetY, -upperBody1.offsetZ);
        GL11.glTranslatef(-upperBody1.rotationPointX * f5, -upperBody1.rotationPointY * f5, -upperBody1.rotationPointZ * f5);
        upperBody1.render(f5);
        GL11.glPopMatrix();
        switchPlate.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(top1.offsetX, top1.offsetY, top1.offsetZ);
        GL11.glTranslatef(top1.rotationPointX * f5, top1.rotationPointY * f5, top1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 1.1D, 1.1D);
        GL11.glTranslatef(-top1.offsetX, -top1.offsetY, -top1.offsetZ);
        GL11.glTranslatef(-top1.rotationPointX * f5, -top1.rotationPointY * f5, -top1.rotationPointZ * f5);
        top1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(body1.offsetX, body1.offsetY, body1.offsetZ);
        GL11.glTranslatef(body1.rotationPointX * f5, body1.rotationPointY * f5, body1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 1.1D, 1.1D);
        GL11.glTranslatef(-body1.offsetX, -body1.offsetY, -body1.offsetZ);
        GL11.glTranslatef(-body1.rotationPointX * f5, -body1.rotationPointY * f5, -body1.rotationPointZ * f5);
        body1.render(f5);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
