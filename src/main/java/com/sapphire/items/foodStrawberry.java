package com.sapphire.items;

import com.sapphire.blocksitems.SapphireBlocks;
import com.sapphire.main.mainRegistry;

import net.minecraft.item.ItemFood;

public class foodStrawberry extends ItemFood{
	
	public foodStrawberry(int j, boolean b){
		super(j, b);
		this.setCreativeTab(SapphireBlocks.sapphireTab);
		this.setTextureName("sapphire:Strawberry");
	}

}
