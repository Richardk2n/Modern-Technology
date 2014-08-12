package com.richard.modernTechnology.creativeTab;

import com.richard.modernTechnology.init.ModItems;
import com.richard.modernTechnology.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabModernTechnology {

	public static final CreativeTabs MODERNTECHNOLOGY_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		
		@Override
		public Item getTabIconItem() {
			return ModItems.stickStone;
		}
		
	};

}
