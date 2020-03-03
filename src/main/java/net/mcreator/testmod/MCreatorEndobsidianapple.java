package net.mcreator.testmod;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@Elementstestmod.ModElement.Tag
public class MCreatorEndobsidianapple extends Elementstestmod.ModElement {
	@ObjectHolder("testmod:endobsidianapple")
	public static final Item block = null;

	public MCreatorEndobsidianapple(Elementstestmod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MCreatorEndore.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(25).saturation(1f).setAlwaysEdible().meat().build()));
			setRegistryName("endobsidianapple");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 40;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
