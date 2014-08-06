package com.sapphire.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void mainRegsitry(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeSapphire;
	
	public static void initializeBiome(){
		
		biomeSapphire = new BiomeGenSapphire(137).setBiomeName("Sapphire").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeSapphire, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeSapphire);
		
	}

}
