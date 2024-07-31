package net.lunarjack.bossesandmore.recipe;

import net.lunarjack.bossesandmore.BossesAndMore;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(BossesAndMore.MOD_ID, GemRefiningRecipe.Serializer.ID),
                GemRefiningRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(BossesAndMore.MOD_ID, GemRefiningRecipe.Type.ID),
                GemRefiningRecipe.Type .INSTANCE);
    }
}
