package fiskfille.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelEmitterVaid extends ModelBase
{
    public ModelRenderer ring1_1;
    public ModelRenderer ring2_1;
    public ModelRenderer ring3_1;
    public ModelRenderer shell1;
    public ModelRenderer innerRing1;
    public ModelRenderer ring1_2;
    public ModelRenderer ring1_3;
    public ModelRenderer ring1_4;
    public ModelRenderer ring1_5;
    public ModelRenderer ring1_6;
    public ModelRenderer ring1_7;
    public ModelRenderer ring1_8;
    public ModelRenderer ring2_2;
    public ModelRenderer ring2_3;
    public ModelRenderer ring2_4;
    public ModelRenderer ring2_5;
    public ModelRenderer ring2_6;
    public ModelRenderer ring2_7;
    public ModelRenderer ring2_8;
    public ModelRenderer ring3_2;
    public ModelRenderer ring3_3;
    public ModelRenderer ring3_4;
    public ModelRenderer ring3_5;
    public ModelRenderer ring3_6;
    public ModelRenderer ring3_7;
    public ModelRenderer ring3_8;
    public ModelRenderer shell2;
    public ModelRenderer shell9;
    public ModelRenderer shell10;
    public ModelRenderer shell17;
    public ModelRenderer shell18;
    public ModelRenderer shell23;
    public ModelRenderer shell24;
    public ModelRenderer shell3;
    public ModelRenderer shell4;
    public ModelRenderer shell6;
    public ModelRenderer shell8;
    public ModelRenderer shell5;
    public ModelRenderer shell7;
    public ModelRenderer shell11;
    public ModelRenderer shell12;
    public ModelRenderer shell14;
    public ModelRenderer shell16;
    public ModelRenderer shell13;
    public ModelRenderer shell15;
    public ModelRenderer shell19;
    public ModelRenderer shell20;
    public ModelRenderer shell21;
    public ModelRenderer shell22;
    public ModelRenderer shell25;
    public ModelRenderer shell26;
    public ModelRenderer shell27;
    public ModelRenderer shell28;
    public ModelRenderer innerRing2;
    public ModelRenderer innerRing3;
    public ModelRenderer innerRing4;
    public ModelRenderer innerRing5;
    public ModelRenderer innerRing6;
    public ModelRenderer innerRing7;
    public ModelRenderer innerRing8;

    public ModelEmitterVaid()
    {
        textureWidth = 64;
        textureHeight = 32;
        ring2_5 = new ModelRenderer(this, 0, 15);
        ring2_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_5, 0.0F, 3.141592653589793F, 0.0F);
        innerRing7 = new ModelRenderer(this, 0, 0);
        innerRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing7.addBox(-1.5F, -11.0F, 2.62F, 3, 11, 1, 0.0F);
        setRotateAngle(innerRing7, 0.0F, -1.5707963267948966F, 0.0F);
        ring1_7 = new ModelRenderer(this, 0, 12);
        ring1_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_7, 0.0F, -1.5707963267948966F, 0.0F);
        shell5 = new ModelRenderer(this, 21, 18);
        shell5.mirror = true;
        shell5.setRotationPoint(1.3F, 0.0F, 0.0F);
        shell5.addBox(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        shell20 = new ModelRenderer(this, 16, 16);
        shell20.setRotationPoint(-1.0F, -5.0F, 0.0F);
        shell20.addBox(0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        setRotateAngle(shell20, 0.0F, 0.0F, -0.5235987755982988F);
        ring3_6 = new ModelRenderer(this, 0, 18);
        ring3_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_6, 0.0F, -2.356194490192345F, 0.0F);
        shell11 = new ModelRenderer(this, 24, 0);
        shell11.setRotationPoint(-0.5F, -3.0F, 3.12F);
        shell11.addBox(-1.0F, -9.0F, -0.5F, 2, 9, 1, 0.0F);
        innerRing4 = new ModelRenderer(this, 0, 0);
        innerRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing4.addBox(-1.5F, -11.0F, 2.62F, 3, 11, 1, 0.0F);
        setRotateAngle(innerRing4, 0.0F, 2.356194490192345F, 0.0F);
        ring2_7 = new ModelRenderer(this, 0, 15);
        ring2_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_7, 0.0F, -1.5707963267948966F, 0.0F);
        ring1_2 = new ModelRenderer(this, 0, 12);
        ring1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_2, 0.0F, 0.7853981633974483F, 0.0F);
        shell28 = new ModelRenderer(this, 22, 13);
        shell28.mirror = true;
        shell28.setRotationPoint(0.0F, 2.0F, 0.0F);
        shell28.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        setRotateAngle(shell28, 0.0F, 0.0F, 0.17453292519943295F);
        ring3_8 = new ModelRenderer(this, 0, 18);
        ring3_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_8, 0.0F, -0.7853981633974483F, 0.0F);
        innerRing1 = new ModelRenderer(this, 0, 0);
        innerRing1.setRotationPoint(0.0F, -8.3F, 0.0F);
        innerRing1.addBox(-1.5F, -11.0F, 2.62F, 3, 11, 1, 0.0F);
        shell9 = new ModelRenderer(this, 8, 0);
        shell9.setRotationPoint(0.0F, 0.0F, 0.0F);
        shell9.addBox(-1.5F, -14.0F, 2.62F, 3, 14, 1, 0.0F);
        setRotateAngle(shell9, 0.0F, 1.5707963267948966F, 0.0F);
        ring3_1 = new ModelRenderer(this, 0, 18);
        ring3_1.setRotationPoint(0.0F, -4.0F, 0.0F);
        ring3_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        innerRing5 = new ModelRenderer(this, 0, 0);
        innerRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing5.addBox(-1.5F, -11.0F, 2.62F, 3, 11, 1, 0.0F);
        setRotateAngle(innerRing5, 0.0F, 3.141592653589793F, 0.0F);
        ring2_1 = new ModelRenderer(this, 0, 15);
        ring2_1.setRotationPoint(0.0F, -2.0F, 0.0F);
        ring2_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        shell17 = new ModelRenderer(this, 8, 15);
        shell17.setRotationPoint(0.0F, 0.0F, 0.0F);
        shell17.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        setRotateAngle(shell17, 0.0F, 3.141592653589793F, 0.0F);
        shell4 = new ModelRenderer(this, 15, 18);
        shell4.mirror = true;
        shell4.setRotationPoint(-1.0F, -9.0F, 0.0F);
        shell4.addBox(0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        setRotateAngle(shell4, 0.0F, 0.0F, -0.9075712110370513F);
        ring2_4 = new ModelRenderer(this, 0, 15);
        ring2_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_4, 0.0F, 2.356194490192345F, 0.0F);
        ring1_1 = new ModelRenderer(this, 0, 12);
        ring1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        shell21 = new ModelRenderer(this, 22, 10);
        shell21.setRotationPoint(-1.0F, -5.0F, 0.0F);
        shell21.addBox(0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(shell21, 0.0F, 0.0F, 0.2792526803190927F);
        innerRing3 = new ModelRenderer(this, 0, 0);
        innerRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing3.addBox(-1.5F, -11.0F, 2.62F, 3, 11, 1, 0.0F);
        setRotateAngle(innerRing3, 0.0F, 1.5707963267948966F, 0.0F);
        ring1_4 = new ModelRenderer(this, 0, 12);
        ring1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_4, 0.0F, 2.356194490192345F, 0.0F);
        ring3_3 = new ModelRenderer(this, 0, 18);
        ring3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_3, 0.0F, 1.5707963267948966F, 0.0F);
        ring3_2 = new ModelRenderer(this, 0, 18);
        ring3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_2, 0.0F, 0.7853981633974483F, 0.0F);
        innerRing2 = new ModelRenderer(this, 0, 0);
        innerRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing2.addBox(-1.5F, -11.0F, 2.62F, 3, 11, 1, 0.0F);
        setRotateAngle(innerRing2, 0.0F, 0.7853981633974483F, 0.0F);
        shell26 = new ModelRenderer(this, 16, 16);
        shell26.mirror = true;
        shell26.setRotationPoint(1.0F, -5.0F, 0.0F);
        shell26.addBox(-2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        setRotateAngle(shell26, 0.0F, 0.0F, 0.5235987755982988F);
        shell27 = new ModelRenderer(this, 22, 10);
        shell27.mirror = true;
        shell27.setRotationPoint(1.0F, -5.0F, 0.0F);
        shell27.addBox(-1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(shell27, 0.0F, 0.0F, -0.2792526803190927F);
        shell13 = new ModelRenderer(this, 21, 18);
        shell13.setRotationPoint(-1.3F, 0.0F, 0.0F);
        shell13.addBox(-1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        shell6 = new ModelRenderer(this, 30, 0);
        shell6.mirror = true;
        shell6.setRotationPoint(-1.0F, -9.0F, 0.0F);
        shell6.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        setRotateAngle(shell6, 0.0F, 0.0F, 0.17453292519943295F);
        shell23 = new ModelRenderer(this, 16, 0);
        shell23.setRotationPoint(0.0F, 0.0F, 0.0F);
        shell23.addBox(-1.5F, -9.0F, 2.62F, 3, 9, 1, 0.0F);
        setRotateAngle(shell23, 0.0F, -1.5707963267948966F, 0.0F);
        ring1_3 = new ModelRenderer(this, 0, 12);
        ring1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_3, 0.0F, 1.5707963267948966F, 0.0F);
        shell14 = new ModelRenderer(this, 30, 0);
        shell14.setRotationPoint(1.0F, -9.0F, 0.0F);
        shell14.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        setRotateAngle(shell14, 0.0F, 0.0F, -0.17453292519943295F);
        ring2_6 = new ModelRenderer(this, 0, 15);
        ring2_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_6, 0.0F, -2.356194490192345F, 0.0F);
        ring2_2 = new ModelRenderer(this, 0, 15);
        ring2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_2, 0.0F, 0.7853981633974483F, 0.0F);
        shell1 = new ModelRenderer(this, 8, 15);
        shell1.setRotationPoint(0.0F, -5.0F, 0.0F);
        shell1.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        shell18 = new ModelRenderer(this, 8, 15);
        shell18.setRotationPoint(0.0F, 0.0F, 0.0F);
        shell18.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        setRotateAngle(shell18, 0.0F, -2.356194490192345F, 0.0F);
        ring3_5 = new ModelRenderer(this, 0, 18);
        ring3_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_5.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_5, 0.0F, 3.141592653589793F, 0.0F);
        ring1_5 = new ModelRenderer(this, 0, 12);
        ring1_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_5, 0.0F, 3.141592653589793F, 0.0F);
        innerRing8 = new ModelRenderer(this, 0, 0);
        innerRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing8.addBox(-1.5F, -11.0F, 2.62F, 3, 11, 1, 0.0F);
        setRotateAngle(innerRing8, 0.0F, -0.7853981633974483F, 0.0F);
        shell12 = new ModelRenderer(this, 15, 18);
        shell12.setRotationPoint(1.0F, -9.0F, 0.0F);
        shell12.addBox(-2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        setRotateAngle(shell12, 0.0F, 0.0F, 0.9075712110370513F);
        ring3_4 = new ModelRenderer(this, 0, 18);
        ring3_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_4, 0.0F, 2.356194490192345F, 0.0F);
        ring1_8 = new ModelRenderer(this, 0, 12);
        ring1_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_8, 0.0F, -0.7853981633974483F, 0.0F);
        ring3_7 = new ModelRenderer(this, 0, 18);
        ring3_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_7.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_7, 0.0F, -1.5707963267948966F, 0.0F);
        shell10 = new ModelRenderer(this, 8, 15);
        shell10.setRotationPoint(0.0F, 0.0F, 0.0F);
        shell10.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        setRotateAngle(shell10, 0.0F, 2.356194490192345F, 0.0F);
        shell3 = new ModelRenderer(this, 24, 0);
        shell3.mirror = true;
        shell3.setRotationPoint(0.5F, -3.0F, 3.12F);
        shell3.addBox(-1.0F, -9.0F, -0.5F, 2, 9, 1, 0.0F);
        shell19 = new ModelRenderer(this, 16, 10);
        shell19.setRotationPoint(0.5F, -3.0F, 3.12F);
        shell19.addBox(-1.0F, -5.0F, -0.5F, 2, 5, 1, 0.0F);
        ring2_8 = new ModelRenderer(this, 0, 15);
        ring2_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_8, 0.0F, -0.7853981633974483F, 0.0F);
        ring2_3 = new ModelRenderer(this, 0, 15);
        ring2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_3, 0.0F, 1.5707963267948966F, 0.0F);
        innerRing6 = new ModelRenderer(this, 0, 0);
        innerRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing6.addBox(-1.5F, -11.0F, 2.62F, 3, 11, 1, 0.0F);
        setRotateAngle(innerRing6, 0.0F, -2.356194490192345F, 0.0F);
        shell7 = new ModelRenderer(this, 30, 5);
        shell7.mirror = true;
        shell7.setRotationPoint(0.0F, 4.0F, 0.0F);
        shell7.addBox(0.0F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        setRotateAngle(shell7, 0.0F, 0.0F, -0.1308996938995747F);
        shell15 = new ModelRenderer(this, 30, 5);
        shell15.setRotationPoint(0.0F, 4.0F, 0.0F);
        shell15.addBox(-1.0F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        setRotateAngle(shell15, 0.0F, 0.0F, 0.1308996938995747F);
        shell16 = new ModelRenderer(this, 26, 10);
        shell16.setRotationPoint(-0.5F, -9.0F, 0.0F);
        shell16.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        shell22 = new ModelRenderer(this, 22, 13);
        shell22.setRotationPoint(0.0F, 2.0F, 0.0F);
        shell22.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        setRotateAngle(shell22, 0.0F, 0.0F, -0.17453292519943295F);
        shell2 = new ModelRenderer(this, 8, 15);
        shell2.setRotationPoint(0.0F, 0.0F, 0.0F);
        shell2.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        setRotateAngle(shell2, 0.0F, 0.7853981633974483F, 0.0F);
        ring1_6 = new ModelRenderer(this, 0, 12);
        ring1_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_6, 0.0F, -2.356194490192345F, 0.0F);
        shell24 = new ModelRenderer(this, 8, 15);
        shell24.setRotationPoint(0.0F, 0.0F, 0.0F);
        shell24.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        setRotateAngle(shell24, 0.0F, -0.7853981633974483F, 0.0F);
        shell8 = new ModelRenderer(this, 26, 10);
        shell8.mirror = true;
        shell8.setRotationPoint(0.5F, -9.0F, 0.0F);
        shell8.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        shell25 = new ModelRenderer(this, 16, 10);
        shell25.mirror = true;
        shell25.setRotationPoint(-0.5F, -3.0F, 3.12F);
        shell25.addBox(-1.0F, -5.0F, -0.5F, 2, 5, 1, 0.0F);
        ring2_1.addChild(ring2_5);
        innerRing1.addChild(innerRing7);
        ring1_1.addChild(ring1_7);
        shell4.addChild(shell5);
        shell19.addChild(shell20);
        ring3_1.addChild(ring3_6);
        shell10.addChild(shell11);
        innerRing1.addChild(innerRing4);
        ring2_1.addChild(ring2_7);
        ring1_1.addChild(ring1_2);
        shell27.addChild(shell28);
        ring3_1.addChild(ring3_8);
        shell1.addChild(shell9);
        innerRing1.addChild(innerRing5);
        shell1.addChild(shell17);
        shell3.addChild(shell4);
        ring2_1.addChild(ring2_4);
        shell19.addChild(shell21);
        innerRing1.addChild(innerRing3);
        ring1_1.addChild(ring1_4);
        ring3_1.addChild(ring3_3);
        ring3_1.addChild(ring3_2);
        innerRing1.addChild(innerRing2);
        shell25.addChild(shell26);
        shell25.addChild(shell27);
        shell12.addChild(shell13);
        shell3.addChild(shell6);
        shell1.addChild(shell23);
        ring1_1.addChild(ring1_3);
        shell11.addChild(shell14);
        ring2_1.addChild(ring2_6);
        ring2_1.addChild(ring2_2);
        shell1.addChild(shell18);
        ring3_1.addChild(ring3_5);
        ring1_1.addChild(ring1_5);
        innerRing1.addChild(innerRing8);
        shell11.addChild(shell12);
        ring3_1.addChild(ring3_4);
        ring1_1.addChild(ring1_8);
        ring3_1.addChild(ring3_7);
        shell1.addChild(shell10);
        shell2.addChild(shell3);
        shell18.addChild(shell19);
        ring2_1.addChild(ring2_8);
        ring2_1.addChild(ring2_3);
        innerRing1.addChild(innerRing6);
        shell6.addChild(shell7);
        shell14.addChild(shell15);
        shell11.addChild(shell16);
        shell21.addChild(shell22);
        shell1.addChild(shell2);
        ring1_1.addChild(ring1_6);
        shell1.addChild(shell24);
        shell3.addChild(shell8);
        shell24.addChild(shell25);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef(innerRing1.offsetX, innerRing1.offsetY, innerRing1.offsetZ);
        GL11.glTranslatef(innerRing1.rotationPointX * f5, innerRing1.rotationPointY * f5, innerRing1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-innerRing1.offsetX, -innerRing1.offsetY, -innerRing1.offsetZ);
        GL11.glTranslatef(-innerRing1.rotationPointX * f5, -innerRing1.rotationPointY * f5, -innerRing1.rotationPointZ * f5);
        innerRing1.render(f5);
        GL11.glPopMatrix();
        ring3_1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(ring2_1.offsetX, ring2_1.offsetY, ring2_1.offsetZ);
        GL11.glTranslatef(ring2_1.rotationPointX * f5, ring2_1.rotationPointY * f5, ring2_1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.0D, 0.9D);
        GL11.glTranslatef(-ring2_1.offsetX, -ring2_1.offsetY, -ring2_1.offsetZ);
        GL11.glTranslatef(-ring2_1.rotationPointX * f5, -ring2_1.rotationPointY * f5, -ring2_1.rotationPointZ * f5);
        ring2_1.render(f5);
        GL11.glPopMatrix();
        ring1_1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(shell1.offsetX, shell1.offsetY, shell1.offsetZ);
        GL11.glTranslatef(shell1.rotationPointX * f5, shell1.rotationPointY * f5, shell1.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-shell1.offsetX, -shell1.offsetY, -shell1.offsetZ);
        GL11.glTranslatef(-shell1.rotationPointX * f5, -shell1.rotationPointY * f5, -shell1.rotationPointZ * f5);
        shell1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
