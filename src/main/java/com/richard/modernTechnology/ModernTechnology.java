package com.richard.modernTechnology;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "ModernTechnology", name = "Modern Technology", version="1.7.10-1.0")

public class ModernTechnology {
	
	@Instance("ModernTechnology")
	public static ModernTechnology instance;
	
	
	//Items + Blocks
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	//Guis + TileEntitys + Crafting
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	//Wrap up + after other mods
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
