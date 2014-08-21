package com.richard.modernTechnology.init;

import com.richard.modernTechnology.block.BlockModernTechnology;
import com.richard.modernTechnology.block.BlockStreet;
import com.richard.modernTechnology.block.BlockTorchStone;
import com.richard.modernTechnology.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockModernTechnology BlockStreet = new BlockStreet();
	public static final BlockModernTechnology BlockStoneTorch = new BlockTorchStone();
	
	public static void init(){
		GameRegistry.registerBlock(BlockStreet, "BlockStreet");
		GameRegistry.registerBlock(BlockStoneTorch, "BlockStoneTorch");
	}
}
