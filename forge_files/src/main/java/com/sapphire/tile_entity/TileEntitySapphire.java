package com.sapphire.tile_entity;

import com.sapphire.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntitySapphire {
	
	public static void mainRegistry(){
		registerTileEntities();
	}
	
	private static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntitySapphireChest.class, Strings.MODID);
	}

}
