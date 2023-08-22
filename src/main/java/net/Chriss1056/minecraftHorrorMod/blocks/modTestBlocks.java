package net.Chriss1056.minecraftHorrorMod.blocks;

import net.Chriss1056.minecraftHorrorMod.items.modTestItems;
import net.Chriss1056.minecraftHorrorMod.minecraftHorrorMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class modTestBlocks
{
    public static final DeferredRegister<Block> TEST_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, minecraftHorrorMod.MOD_ID);

    public static final RegistryObject<Block> TEST_BLOCK_1 = registerTestBlock("test_block_1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> TEST_BLOCK_2 = registerTestBlock("test_block_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANCIENT_DEBRIS)));

    private static <T extends Block> RegistryObject<T> registerTestBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = TEST_BLOCKS.register(name, block);
        registerTestBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerTestBlockItem(String name, RegistryObject<T> block)
    {
        return modTestItems.TEST_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        TEST_BLOCKS.register(eventBus);
    }
}
