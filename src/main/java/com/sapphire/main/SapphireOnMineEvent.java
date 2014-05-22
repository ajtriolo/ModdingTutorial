package com.sapphire.main;

import net.minecraft.item.ItemStack;

import com.sapphire.items.SapphireItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class SapphireOnMineEvent {
	
	@SubscribeEvent
	public void whenIGetASapphireIngot(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(SapphireItems.sapphireIngot))){
			e.player.addStat(mainRegistry.achievementSapphire, 1);
		}
	}

}
