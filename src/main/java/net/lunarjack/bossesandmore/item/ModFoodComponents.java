package net.lunarjack.bossesandmore.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ENDER_ORANGE = new FoodComponent.Builder().hunger(4).saturationModifier(0.50f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1000), 1.00f).build();
}
