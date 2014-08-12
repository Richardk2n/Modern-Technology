package com.richard.modernTechnology.init;


import com.richard.modernTechnology.block.BlockStreet;
import com.richard.modernTechnology.utility.NBTHelper;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTUtil;
import net.minecraftforge.common.util.Constants.NBT;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init(){
		
		ItemStack stick = new ItemStack(ModItems.stickStone);
//		NBTHelper.setString(stick, "STRING", "Just a stick made out of Stone");
        
		GameRegistry.addRecipe(stick, "   "," s "," s ", 's', new ItemStack(Blocks.stone));
	}
}
