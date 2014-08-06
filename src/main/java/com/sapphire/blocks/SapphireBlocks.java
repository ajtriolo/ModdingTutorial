package com.sapphire.blocks;

import com.sapphire.items.SapphireItems;
import com.sapphire.items.axeSapphire;
import com.sapphire.items.foodStrawberry;
import com.sapphire.items.hoeSapphire;
import com.sapphire.items.pickaxeSapphire;
import com.sapphire.items.sapphireArmor;
import com.sapphire.items.sapphireIngot;
import com.sapphire.items.shovelSapphire;
import com.sapphire.items.swordSapphire;
import com.sapphire.main.mainRegistry;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
    
    public static void initBlocks(){
    	sapphireOre = new sapphireOre(Material.rock).setHardness(1.5F).setBlockName("sapphireOre");
    	sapphireChest = new sapphireChest(0).setBlockName("Sapphire Chest").setCreativeTab(sapphireTab);
    }
    
    public static void registerBlocks(){
    	
    	GameRegistry.registerBlock(sapphireOre, "sapphireOre");
    	GameRegistry.registerBlock(sapphireChest, "sapphireChest");
    	
    }
}
