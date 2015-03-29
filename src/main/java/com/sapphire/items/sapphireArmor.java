package com.sapphire.items;

import com.sapphire.main.mainRegistry;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		if(player.getCurrentArmor(0) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(3) != null){
			ItemStack boots = player.getCurrentArmor(0);
			ItemStack legs = player.getCurrentArmor(1);
			ItemStack chest = player.getCurrentArmor(2);
			ItemStack helmet = player.getCurrentArmor(3);
			
			if(boots.getItem() == SapphireItems.bootsSapphire && legs.getItem() == SapphireItems.legsSapphire && chest.getItem() == SapphireItems.chestplateSapphire && helmet.getItem() == SapphireItems.helmetSapphire){
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100, 1));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 100, 0));
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 100, 0));
			}
			
		}
	}
	
}
