package com.richard.modernTechnology;

import com.richard.modernTechnology.proxy.IProxy;
import com.richard.modernTechnology.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_Name, version= Reference.VERSION)

public class ModernTechnology {
	
	@Instance(Reference.MOD_ID)
	public static ModernTechnology instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
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
