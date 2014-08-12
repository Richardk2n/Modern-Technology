package com.richard.modernTechnology.block;

import com.richard.modernTechnology.creativeTab.CreativeTabModernTechnology;

import net.minecraft.creativetab.CreativeTabs;

public class BlockStreet extends BlockModernTechnology{

	public BlockStreet(){
		super();
		this.setBlockName("BlockStreet");
		this.setBlockTextureName("BlockStreet");
		this.setStepSound(soundTypeStone);
		this.setHardness(5F);
		this.setResistance(20F);
		this.setHarvestLevel("pickaxe", 0);
		this.setLightLevel(10);
	}
}
