package net.Chriss1056.minecraftHorrorMod.utility.customTags;

import net.Chriss1056.minecraftHorrorMod.minecraftHorrorMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class customTestTag {

    public static class Blocks {

        public static final TagKey<Block> CUSTOM_TEST_BLOCK_TAG = tag("custom_test_block_tag");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(minecraftHorrorMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(minecraftHorrorMod.MOD_ID, name));
        }
    }
}
