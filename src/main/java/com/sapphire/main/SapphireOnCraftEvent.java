package com.sapphire.main;

import com.sapphire.items.SapphireItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class SapphireOnCraftEvent {
	
	@SubscribeEvent
	public void whenICraftAPickaxe(PlayerEvent.ItemCraftedEvent e){
		if(e.crafting.getItem().equals(SapphireItems.pickaxeSapphire)){
			e.player.addStat(mainRegistry.achievementSapphirePick, 1);
		}
	}

}
