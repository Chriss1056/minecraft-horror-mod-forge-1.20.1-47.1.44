package net.Chriss1056.minecraftHorrorMod.items;

import net.Chriss1056.minecraftHorrorMod.items.custom_items.customTestFoodItem;
import net.Chriss1056.minecraftHorrorMod.items.custom_items.customTestFuelItem;
import net.Chriss1056.minecraftHorrorMod.items.custom_items.customTestItem;
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

    public static final RegistryObject<Item> CUSTOM_TEST_ITEM_1 = TEST_ITEMS.register("custom_test_item_1",
            () -> new customTestItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> CUSTOM_TEST_FOOD_ITEM_1 = TEST_ITEMS.register("custom_test_food_item_1",
            () -> new Item(new Item.Properties().food(customTestFoodItem.CUSTOM_TEST_FOOD_ITEM_1)));

    public static final RegistryObject<Item> CUSTOM_TEST_FUEL_ITEM_1 = TEST_ITEMS.register("custom_test_fuel_item_1",
            () -> new customTestFuelItem(new Item.Properties(), 400));

    public static void register(IEventBus eventBus)
    {
        TEST_ITEMS.register(eventBus);
    }
}
