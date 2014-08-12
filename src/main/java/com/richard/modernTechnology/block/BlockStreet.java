package com.richard.modernTechnology.block;

public class BlockStreet extends BlockModernTechnology{

	public BlockStreet(){
		super();
		this.setBlockName("BlockStreet");
		this.setBlockTextureName("BlockStreet");
		this.setHardness(5F);
		this.setResistance(20F);
		this.setHarvestLevel("pickaxe", 0);
		this.setLightLevel(10);
	}
}
