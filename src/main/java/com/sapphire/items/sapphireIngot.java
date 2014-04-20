package com.sapphire.items;

import com.sapphire.blocksitems.SapphireBlocks;
import com.sapphire.main.mainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class sapphireIngot extends Item{
	
	public sapphireIngot(){
		super();
		this.setCreativeTab(SapphireBlocks.sapphireTab);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("sapphire:sapphire");
	}

}
