package com.sapphire.items;

import com.sapphire.blocks.SapphireBlocks;
import com.sapphire.lib.Strings;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SapphireItems {
	
	public static ToolMaterial enumToolMaterialSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 3, 3000, 11.0F, 5.0F, 30);
    public static ArmorMaterial enumArmorMaterialSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 50, new int[] {5, 10, 8, 3}, 30);
	
	public static void mainRegistry(){
    	initItems();
    	registerItems();
    }
	
	public static Item sapphireIngot;
    public static Item swordSapphire;
    public static Item pickaxeSapphire;
    public static Item axeSapphire;
    public static Item hoeSapphire;
    public static Item shovelSapphire;
    public static Item helmetSapphire;
    public static Item chestplateSapphire;
    public static Item legsSapphire;    
    public static Item bootsSapphire; 
    public static Item Strawberry = new ItemFood(32, 10, false);
	
	public static void initItems(){
		
		RenderingRegistry.addNewArmourRendererPrefix("5");
		
		sapphireIngot = new sapphireIngot().setUnlocalizedName("sapphireIngot");
    	swordSapphire = new swordSapphire(enumToolMaterialSapphire, 6).setUnlocalizedName("swordSapphire").setCreativeTab(SapphireBlocks.sapphireTab);
    	pickaxeSapphire = new pickaxeSapphire(enumToolMaterialSapphire).setUnlocalizedName("pickSapphire").setCreativeTab(SapphireBlocks.sapphireTab);
    	shovelSapphire = new shovelSapphire(enumToolMaterialSapphire).setUnlocalizedName("shovelSapphire").setCreativeTab(SapphireBlocks.sapphireTab);
    	hoeSapphire = new hoeSapphire(enumToolMaterialSapphire).setUnlocalizedName("hoeSapphire").setCreativeTab(SapphireBlocks.sapphireTab);
    	axeSapphire = new axeSapphire(enumToolMaterialSapphire).setUnlocalizedName("axeSapphire").setCreativeTab(SapphireBlocks.sapphireTab);
    	helmetSapphire = new sapphireArmor(enumArmorMaterialSapphire, 5, 0).setUnlocalizedName("helmetSapphire").setCreativeTab(SapphireBlocks.sapphireTab);
    	chestplateSapphire = new sapphireArmor(enumArmorMaterialSapphire, 5, 1).setUnlocalizedName("chestplateSapphire").setCreativeTab(SapphireBlocks.sapphireTab);
    	legsSapphire = new sapphireArmor(enumArmorMaterialSapphire, 5, 2).setUnlocalizedName("legsSapphire").setCreativeTab(SapphireBlocks.sapphireTab);
    	bootsSapphire = new sapphireArmor(enumArmorMaterialSapphire, 5, 3).setUnlocalizedName("bootsSapphire").setCreativeTab(SapphireBlocks.sapphireTab);
    	Strawberry = new foodStrawberry(10, false).setUnlocalizedName("strawberry");
	}
	
	public static void registerItems(){
		
		GameRegistry.registerItem(sapphireIngot, "sapphireIngot");
    	GameRegistry.registerItem(swordSapphire, "swordSapphire");
    	GameRegistry.registerItem(pickaxeSapphire, "pickaxeSapphire");
    	GameRegistry.registerItem(axeSapphire, "axeSapphire");
    	GameRegistry.registerItem(hoeSapphire, "hoeSapphire");
    	GameRegistry.registerItem(shovelSapphire, "shovelSapphire");
    	GameRegistry.registerItem(helmetSapphire, "helmetSapphire");
    	GameRegistry.registerItem(chestplateSapphire, "chestplateSapphire");
    	GameRegistry.registerItem(legsSapphire, "legsSapphire");
    	GameRegistry.registerItem(bootsSapphire, "bootsSapphire");
    	GameRegistry.registerItem(Strawberry, "Strawberry");
	}
	

}
