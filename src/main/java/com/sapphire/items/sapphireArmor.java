package com.sapphire.items;

import com.sapphire.blocksitems.SapphireBlocks;
import com.sapphire.main.mainRegistry;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class sapphireArmor extends ItemArmor{
	private String [] armourTypes = new String [] {"helmetSapphire", "chestplateSapphire", "legsSapphire", "bootsSapphire"};

	public sapphireArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		super(armorMaterial, renderIndex, armourType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if(stack.getItem().equals(SapphireItems.helmetSapphire)|| stack.getItem().equals(SapphireItems.chestplateSapphire)|| stack.getItem().equals(SapphireItems.bootsSapphire)){
			return "sapphire:textures/armor/sapphire_1.png";
		}
		
		if(stack.getItem().equals(SapphireItems.legsSapphire)){
			return "sapphire:textures/armor/sapphire_2.png";
		}
		
		else return null;
	}
	
	@Override
	public void registerIcons(IIconRegister reg){
		if(this == SapphireItems.helmetSapphire)
			this.itemIcon = reg.registerIcon("sapphire:helmetSapphire");
		if(this == SapphireItems.chestplateSapphire)
			this.itemIcon = reg.registerIcon("sapphire:chestplateSapphire");
		if(this == SapphireItems.legsSapphire)
			this.itemIcon = reg.registerIcon("sapphire:legsSapphire");
		if(this == SapphireItems.bootsSapphire)
			this.itemIcon = reg.registerIcon("sapphire:bootsSapphire");
	}
	
}
