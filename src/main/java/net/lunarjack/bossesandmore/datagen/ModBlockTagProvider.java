package net.lunarjack.bossesandmore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lunarjack.bossesandmore.block.ModBlocks;
import net.lunarjack.bossesandmore.item.util.ModTags;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.BOSS_DROPS)
                .add(ModBlocks.PILLAR_SHELL);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ANCIENT_OAK_PLANKS)
                .add(ModBlocks.ENDISITE)
                .add(ModBlocks.GLOWING_OBSIDIAN)
                .add(ModBlocks.PILLAR_SHELL);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.GLOWING_OBSIDIAN);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level-4")))
                .add(ModBlocks.ENDISITE);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level-6")))
                .add(ModBlocks.PILLAR_SHELL);

    }
}
