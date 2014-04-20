package com.sapphire.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class hoeSapphire extends ItemHoe{
	
	public hoeSapphire(Item.ToolMaterial mat){
		super(mat);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("sapphire:hoeSapphire");
	}

}
