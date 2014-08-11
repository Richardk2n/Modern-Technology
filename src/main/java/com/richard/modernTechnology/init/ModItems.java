package com.richard.modernTechnology.init;

import com.richard.modernTechnology.item.ItemModernTechnology;
import com.richard.modernTechnology.item.ItemStickStone;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static final ItemModernTechnology stickStone = new ItemStickStone();
	
	public static void init(){
		GameRegistry.registerItem(stickStone, "Stone Stick");
	}
}
