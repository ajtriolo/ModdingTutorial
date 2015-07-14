package com.sapphire.blocks;

import com.sapphire.items.*
import com.sapphire.main.mainRegistry;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*
import net.minecraftforge.common.util.EnumHelper;

public class SapphireBlocks {
	
	

    public static void mainRegistry(){
    	initBlocks();
    	registerBlocks();
    }
    
    public static Block sapphireOre;
    public static Block sapphireChest;
    public static CreativeTabs sapphireTab = new CreativeTabs("sapphire"){
    	public Item getTabIconItem(){
    		return Item.getItemFromBlock(sapphireOre);
    	}
    };
    public static Block sapphirePortal;
    
    public static void initBlocks(){
    	sapphireOre = new sapphireOre(Material.rock).setHardness(1.5F).setBlockName("sapphireOre");
    	sapphireChest = new sapphireChest(0).setBlockName("Sapphire Chest").setCreativeTab(sapphireTab);
    	sapphirePortal = new SapphirePortal();
    }
    
    public static void registerBlocks(){
    	
    	GameRegistry.registerBlock(sapphireOre, "sapphireOre");
    	GameRegistry.registerBlock(sapphireChest, "sapphireChest");
    	GameRegistry.registerBlock(sapphirePortal, "sapphirePortal");
    	
    }
}
