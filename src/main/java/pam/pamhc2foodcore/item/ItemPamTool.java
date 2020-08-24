package pam.pamhc2foodcore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;



public class ItemPamTool extends Item {

	public ItemPamTool(Item.Properties builder) {
		super(builder);
	   }

	@Override
	public ItemStack getContainerItem(ItemStack stack) {
	    return stack.copy();
	}
	
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
	    return true;
	}
}
