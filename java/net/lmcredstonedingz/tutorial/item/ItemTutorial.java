package net.lmcredstonedingz.tutorial.item;

import net.lmcredstonedingz.tutorial.Items;
import net.lmcredstonedingz.tutorial.Tutorial;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemTutorial extends Item {
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

		playerIn.sendMessage(new TextComponentString("Item unlocked!!1"));
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "item." + Tutorial.RESOURCE_PREFIX + Items.itemTutorialName;
	}
}
