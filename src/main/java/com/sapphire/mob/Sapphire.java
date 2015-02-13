package com.sapphire.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Sapphire extends ModelBase
{
  //fields
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer body;
    ModelRenderer arm1;
    ModelRenderer arm2;
  
  public Sapphire()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      leg1 = new ModelRenderer(this, 0, 28);
      leg1.addBox(0F, 0F, 2F, 1, 3, 1);
      leg1.setRotationPoint(-3F, 21F, 0F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 4, 28);
      leg2.addBox(0F, 0F, 0F, 1, 3, 1);
      leg2.setRotationPoint(0F, 21F, 2F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 1F, 0F, 4, 4, 4);
      body.setRotationPoint(-3F, 17F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      arm1 = new ModelRenderer(this, 0, 14);
      arm1.addBox(0F, 0F, 0F, 3, 1, 1);
      arm1.setRotationPoint(0F, 20F, 1F);
      arm1.setTextureSize(64, 32);
      arm1.mirror = true;
      setRotation(arm1, 0F, 0F, -0.2443461F);
      arm2 = new ModelRenderer(this, 8, 14);
      arm2.addBox(0F, 0F, 0F, 3, 1, 1);
      arm2.setRotationPoint(-5F, 19F, 1F);
      arm2.setTextureSize(64, 32);
      arm2.mirror = true;
      setRotation(arm2, 0F, 0F, 0.2443461F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    leg1.render(f5);
    leg2.render(f5);
    body.render(f5);
    arm1.render(f5);
    arm2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
	  super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    float f6 = (180F / (float)Math.PI);
	    this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;  
	    this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;  
	    		}

}
