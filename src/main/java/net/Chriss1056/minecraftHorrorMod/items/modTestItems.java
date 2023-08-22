package net.Chriss1056.minecraftHorrorMod.items;

import net.Chriss1056.minecraftHorrorMod.minecraftHorrorMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modTestItems
{
    public static final DeferredRegister<Item> TEST_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, minecraftHorrorMod.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM_1 = TEST_ITEMS.register("test_item_1",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TEST_ITEM_2 = TEST_ITEMS.register("test_item_2",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        TEST_ITEMS.register(eventBus);
    }
}
