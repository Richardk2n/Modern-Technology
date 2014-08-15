package com.richard.modernTechnology.block;

import com.richard.modernTechnology.creativeTabs.CreativeTabsModernTechnology;
import com.richard.modernTechnology.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockModernTechnology extends Block{

	public BlockModernTechnology(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	public BlockModernTechnology(){
		this(Material.rock);
		this.setCreativeTab(CreativeTabsModernTechnology.MODERNTECHNOLOGY_TAB);
	}

	@Override
	public String getUnlocalizedName(){
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
