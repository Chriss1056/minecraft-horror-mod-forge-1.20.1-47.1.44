package net.Chriss1056.minecraftHorrorMod.items.custom_items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class customTestFoodItem
{
    public static final FoodProperties CUSTOM_TEST_FOOD_ITEM_1 = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();
}
