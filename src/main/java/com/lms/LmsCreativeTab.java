package com.lms;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.lms.item.LmsItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LmsCreativeTab extends CreativeTabs {
 
    public LmsCreativeTab(int id, String unlocalizedName) {
 
        super(id, unlocalizedName);
    }
 
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
 
        //return Item.getItemFromBlock(Blocks.chest);
        return LmsItems.LightningStriker;
    }
}