
package net.farpoproject.bilikova.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.farpoproject.bilikova.procedures.MegafonRightclickedProcedure;
import net.farpoproject.bilikova.init.BilikovaModTabs;

public class MegafonItem extends Item {
	public MegafonItem() {
		super(new Item.Properties().tab(BilikovaModTabs.TAB_BILIKOVAITEMY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MegafonRightclickedProcedure.execute(world, x, y, z);
		return ar;
	}
}
