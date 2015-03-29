package com.sapphire.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import com.sapphire.biome.BiomeRegistry;

public class WorldProviderSapphire extends WorldProvider{

	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeSapphire, 1.2F);
		this.dimensionId = dimensionRegistry.dimensionId;
	}
	
	public IChunkProvider createChunkGeneration(){
		return null;
	}
	
	@Override
	public String getDimensionName() {
		
		return "Sapphire";
	}

}
