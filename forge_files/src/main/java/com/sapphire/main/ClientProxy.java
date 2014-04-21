package com.sapphire.main;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.sapphire.blocksitems.SapphireBlocks;
import com.sapphire.render.item.ItemRendererSapphireChest;
import com.sapphire.render.tile_entity.SapphireChestRenderer;
import com.sapphire.tile_entity.TileEntitySapphireChest;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySapphireChest.class, new SapphireChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SapphireBlocks.sapphireChest), new ItemRendererSapphireChest());
	}

}
