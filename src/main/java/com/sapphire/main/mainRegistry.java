package com.sapphire.main;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;

import com.sapphire.biome.BiomeRegistry;
import com.sapphire.biome.WorldTypeSapphire;
import com.sapphire.blocks.SapphireBlocks;
import com.sapphire.enchantments.EnchantmentSpeedBoost;
import com.sapphire.items.SapphireItems;
import com.sapphire.lib.Strings;
import com.sapphire.tile_entity.TileEntitySapphire;
import com.sapphire.world.SapphireWorld;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)
public class mainRegistry
{
	
	@SidedProxy(clientSide = "com.sapphire.main.ClientProxy", serverSide = "com.sapphire.main.ServerProxy")
	public static ServerProxy proxy;

    @Metadata
    public static ModMetadata meta;
    
    @Instance(Strings.MODID)
    public static mainRegistry modInstance;
    
    public static Achievement achievementSapphire;
    public static Achievement achievementSapphirePick; 
    
    public static final Enchantment speedBoost = new EnchantmentSpeedBoost(84, 5);
    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	
    	SapphireBlocks.mainRegistry();
    	SapphireItems.mainRegistry();
    	SapphireWorld.mainRegistry();
    	TileEntitySapphire.mainRegistry();
    	CraftingManager.mainRegistry();
    	BiomeRegistry.mainRegsitry();
    	
    	
    	
    	
    	proxy.registerRenderThings();
    	
    	
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	achievementSapphire = new Achievement("achievement.mineSapphire", "mineSapphire", 0, 0, new ItemStack(SapphireItems.sapphireIngot), (Achievement)null).initIndependentStat().registerStat();
    	achievementSapphirePick = new Achievement("achievement.craftPick", "craftPick", 2, 1, SapphireItems.pickaxeSapphire, achievementSapphire).registerStat();
    	
    	AchievementPage.registerAchievementPage(new AchievementPage("Sapphire Achievements", new Achievement[]{achievementSapphire, achievementSapphirePick}));
    	
    	
    	FMLCommonHandler.instance().bus().register(new SapphireOnMineEvent());
    	FMLCommonHandler.instance().bus().register(new SapphireOnCraftEvent());
    	
    
    	
    	
    	
    	
    }
    
    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostEvent)
    {
    	
    	WorldType SAPPHIRE = new WorldTypeSapphire(3, "sapphire");
    	
    	
    }
    
    
}
