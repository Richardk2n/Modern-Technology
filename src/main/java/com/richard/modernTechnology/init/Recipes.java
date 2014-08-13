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
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init(){
		
		ItemStack stick = new ItemStack(ModItems.stickStone);
		stick.stackSize = 4;
//		NBTHelper.setString(stick, "STRING", "Just a stick made out of Stone");
        GameRegistry.addRecipe(stick,"   "," s "," s ", 's', new ItemStack(Blocks.stone));
        
        
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockStreet), "ss ","ss ","   ",'s' ,new ItemStack(ModItems.stickStone));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BlockStreet), new ItemStack(ModItems.stickStone), new ItemStack(ModItems.stickStone), new ItemStack(ModItems.stickStone), new ItemStack(ModItems.stickStone));
	
		GameRegistry.addRecipe(new ShapelessOreRecipe(stick, "stone", "stone"));
	}
}
