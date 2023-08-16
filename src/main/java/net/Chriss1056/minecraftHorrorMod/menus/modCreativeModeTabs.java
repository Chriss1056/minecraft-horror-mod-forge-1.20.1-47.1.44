package net.Chriss1056.minecraftHorrorMod.menus;

import net.Chriss1056.minecraftHorrorMod.blocks.modBlocks;
import net.Chriss1056.minecraftHorrorMod.items.modItems;
import net.Chriss1056.minecraftHorrorMod.minecraftHorrorMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class modCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, minecraftHorrorMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEST_TAB = CREATIVE_MODE_TABS.register("test_tab_1",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(modItems.TEST_ITEM_1.get()))
                    .title(Component.translatable("creativeTab.test_tab_1"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(modItems.TEST_ITEM_1.get());
                        pOutput.accept(modItems.TEST_ITEM_2.get());

                        pOutput.accept(modBlocks.TEST_BLOCK_1.get());
                        pOutput.accept(modBlocks.TEST_BLOCK_2.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
