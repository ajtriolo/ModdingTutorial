package com.sapphire.main;

import com.sapphire.blocksitems.SapphireBlocks;
import com.sapphire.blocksitems.sapphireOre;
import com.sapphire.items.SapphireItems;
import com.sapphire.items.axeSapphire;
import com.sapphire.items.foodStrawberry;
import com.sapphire.items.hoeSapphire;
import com.sapphire.items.pickaxeSapphire;
import com.sapphire.items.sapphireArmor;
import com.sapphire.items.sapphireIngot;
import com.sapphire.items.shovelSapphire;
import com.sapphire.items.swordSapphire;
import com.sapphire.lib.Strings;
import com.sapphire.tile_entity.TileEntitySapphire;
import com.sapphire.world.SapphireWorld;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)
public class mainRegistry
{
	
	@SidedProxy(clientSide = "com.sapphire.main.ClientProxy", serverSide = "com.sapphire.main.ServerProxy")
	public static ServerProxy proxy;

    @Metadata
    public static ModMetadata meta;
    
    @Instance(Strings.MODID)
    public static mainRegistry modInstance;
    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	
    	SapphireBlocks.mainRegistry();
    	SapphireItems.mainRegistry();
    	SapphireWorld.mainRegistry();
    	TileEntitySapphire.mainRegistry();
    	CraftingManager.MainClass();
    	
    	proxy.registerRenderThings();
    	
    	
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	
    	
    }
    
    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostEvent)
    {
    	
    	
    }
    
    
}
