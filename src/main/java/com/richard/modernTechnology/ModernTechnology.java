package com.richard.modernTechnology;

import net.minecraftforge.oredict.OreDictionary;

import com.richard.modernTechnology.handler.ConfigurationHandler;
import com.richard.modernTechnology.init.ModBlocks;
import com.richard.modernTechnology.init.ModItems;
import com.richard.modernTechnology.init.Recipes;
import com.richard.modernTechnology.proxy.IProxy;
import com.richard.modernTechnology.reference.Reference;
import com.richard.modernTechnology.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_Name, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class ModernTechnology {
	
	@Instance(Reference.MOD_ID)
	public static ModernTechnology instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	//Items + Blocks + config
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		ModItems.init();
		ModBlocks.init();
		
		LogHelper.info("Pre Initialization Complete!");
	}
	
	//Guis + TileEntitys + Crafting
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		Recipes.init();
		
		LogHelper.info("Initialization Complete!");
		
	}
	
	//Wrap up + after other mods
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		for(String oreName: OreDictionary.getOreNames()){
			LogHelper.info(oreName);
			LogHelper.info(OreDictionary.getOres(oreName));
		}
		
		LogHelper.info("Post Initialization Complete!");
		
	}
}
