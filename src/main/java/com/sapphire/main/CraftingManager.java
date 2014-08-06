package com.sapphire.main;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.sapphire.blocks.SapphireBlocks;
import com.sapphire.items.SapphireItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void mainRegistry(){
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	
	public static void addCraftingRecipes(){
		ItemStack enchantedBoots = new ItemStack(SapphireItems.bootsSapphire);
		enchantedBoots.addEnchantment(mainRegistry.speedBoost, 3);
		enchantedBoots.addEnchantment(Enchantment.featherFalling, 10);
		
		ItemStack enchantedChest = new ItemStack(SapphireItems.chestplateSapphire);
		enchantedChest.addEnchantment(Enchantment.protection, 10);
		enchantedChest.addEnchantment(Enchantment.thorns, 10);
		
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.pickaxeSapphire), "III", " S ", " S ", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.swordSapphire), "I", "I", "S", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.shovelSapphire), "I", "S", "S", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.axeSapphire), "II ", "IS ", " S ", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.hoeSapphire), "II ", " S ", " S ", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe((enchantedChest), "I I", "III", "III", 'I', SapphireItems.sapphireIngot);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.helmetSapphire), "III", "I I", 'I', SapphireItems.sapphireIngot);
		GameRegistry.addShapedRecipe((enchantedBoots), "I I", "I I", 'I', SapphireItems.sapphireIngot);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.legsSapphire), "III", "I I", "I I", 'I', SapphireItems.sapphireIngot);
	}
	
	public static void addSmeltingRecipes(){
		GameRegistry.addSmelting(SapphireBlocks.sapphireOre, new ItemStack(SapphireItems.sapphireIngot, 1), 10.0F);
	}

}
