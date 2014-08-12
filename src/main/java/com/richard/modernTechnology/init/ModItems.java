package com.richard.modernTechnology.init;

import com.richard.modernTechnology.item.ItemModernTechnology;
import com.richard.modernTechnology.item.ItemStickStone;
import com.richard.modernTechnology.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemModernTechnology stickStone = new ItemStickStone();
	
	public static void init(){
		GameRegistry.registerItem(stickStone, "StickStone");
	}
}
