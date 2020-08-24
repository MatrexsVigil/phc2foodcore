package pam.pamhc2foodcore;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import pam.pamhc2foodcore.init.ItemRegistry;

@Mod("pamhc2foodcore")
public class Pamhc2foodcore {
	public static final String MOD_ID = "pamhc2foodcore";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup ITEM_GROUP = new ItemGroup("pamhc2foodcore") {
		public ItemStack createIcon() {
			return new ItemStack(ItemRegistry.flouritem);
		}

	};

	public Pamhc2foodcore() {
		DistExecutor.runForDist(() -> () -> new SideProxy.Client(), () -> () -> new SideProxy.Server());
	}

	@Nonnull
	public static ResourceLocation getId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

}
