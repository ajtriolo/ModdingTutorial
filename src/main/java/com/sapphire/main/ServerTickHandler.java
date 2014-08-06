package com.sapphire.main;

import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ServerTickHandler {
	
	private Minecraft mc;
	
	public ServerTickHandler(Minecraft mc){
		this.mc = mc;
	}
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event){
		if(event.player.getCurrentArmor(0)!= null){
			ItemStack boots = event.player.getCurrentArmor(0);
			
			if(boots.getItem() == Items.diamond_boots || boots.getItem() == Items.golden_boots || boots.getItem() == Items.iron_boots || boots.getItem() == Items.leather_boots || boots.getItem() == Items.chainmail_boots){
				int j = EnchantmentHelper.getEnchantmentLevel(mainRegistry.speedBoost.effectId, boots);
				if(j > 0){
					event.player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
				}	
			}
		}
	}
}
