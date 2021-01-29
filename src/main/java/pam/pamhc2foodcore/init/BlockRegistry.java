package pam.pamhc2foodcore.init;

import javax.annotation.Nullable;

import pam.pamhc2foodcore.Pamhc2foodcore;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pam.pamhc2foodcore.block.PamCakeBlock;

public class BlockRegistry {

    //cakes
    public static Block chocolatecakeblock;
    public static Block cheesecakeblock;
    public static Block pumpkincheesecakeblock;
    public static Block carrotcakeblock;

    public static void registerAll(RegistryEvent.Register<Block> event) {
        if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName()))
            return;

        chocolatecakeblock = register("chocolatecakeblock", new PamCakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
        cheesecakeblock = register("cheesecakeblock", new PamCakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
        pumpkincheesecakeblock = register("pumpkincheesecakeblock", new PamCakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
        carrotcakeblock = register("carrotcakeblock", new PamCakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));

    }



    private static <T extends Block> T register(String name, T block) {
        BlockItem item = new BlockItem(block, new Item.Properties().group(Pamhc2foodcore.ITEM_GROUP));
        return register(name, block, item);
    }


    private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
        ResourceLocation id = Pamhc2foodcore.getId(name);
        block.setRegistryName(id);
        ForgeRegistries.BLOCKS.register(block);
        return block;
    }


}