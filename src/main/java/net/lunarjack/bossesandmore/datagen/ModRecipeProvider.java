package net.lunarjack.bossesandmore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lunarjack.bossesandmore.block.ModBlocks;
import net.lunarjack.bossesandmore.item.ModItems;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ULTIMATE_CRYSTAL)
                .pattern("DID")
                .pattern("IPI")
                .pattern("DED")
                .input('I', Items.IRON_INGOT)
                .input('D', Items.DIAMOND)
                .input('E', ModItems.ENDESITE_INGOT)
                .input('P', ModItems.PILLAR_CORE)
                .criterion(hasItem(ModItems.PILLAR_CORE), conditionsFromItem(ModItems.PILLAR_CORE))
                        .offerTo(exporter, new Identifier(getRecipeName(ModItems.ULTIMATE_CRYSTAL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.ULTIMATE_CRYSTAL, 1)
                .pattern("OOO")
                .pattern("OPO")
                .pattern("OOO")
                .input('O', Items.OBSIDIAN)
                .input('P', ModItems.PILLAR_CORE)
                .criterion(hasItem(ModItems.PILLAR_CORE), conditionsFromItem(ModItems.PILLAR_CORE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PILLAR_SHELL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.FULL_GRASS_BLOCK, 1)
                .pattern("GG")
                .pattern("GG")
                .input('G', Items.GRASS)
                .criterion(hasItem(Items.GRASS), conditionsFromItem(Items.GRASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FULL_GRASS_BLOCK)));
    }
}
