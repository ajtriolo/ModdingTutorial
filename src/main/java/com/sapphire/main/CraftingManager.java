package com.sapphire.main;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.sapphire.blocksitems.SapphireBlocks;
import com.sapphire.items.SapphireItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void MainClass(){
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	
	public static void addCraftingRecipes(){
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.pickaxeSapphire), "III", " S ", " S ", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.swordSapphire), "I", "I", "S", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.shovelSapphire), "I", "S", "S", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.axeSapphire), "II ", "IS ", " S ", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.hoeSapphire), "II ", " S ", " S ", 'I', SapphireItems.sapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.chestplateSapphire), "I I", "III", "III", 'I', SapphireItems.sapphireIngot);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.helmetSapphire), "III", "I I", 'I', SapphireItems.sapphireIngot);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.bootsSapphire), "I I", "I I", 'I', SapphireItems.sapphireIngot);
		GameRegistry.addShapedRecipe(new ItemStack(SapphireItems.legsSapphire), "III", "I I", "I I", 'I', SapphireItems.sapphireIngot);
	}
	
	public static void addSmeltingRecipes(){
		GameRegistry.addSmelting(SapphireBlocks.sapphireOre, new ItemStack(SapphireItems.sapphireIngot, 1), 10.0F);
	}

}
