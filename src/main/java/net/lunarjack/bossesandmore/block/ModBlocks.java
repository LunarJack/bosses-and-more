package net.lunarjack.bossesandmore.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lunarjack.bossesandmore.BossesAndMore;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block PILLAR_SHELL = registerBlock("pillar_shell",
            new Block(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN)));
    public static final Block ENDISITE = registerBlock("endisite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(7.0F, 8.0F), UniformIntProvider.create(5, 9)));
    public static final Block LAST_ROSE = registerBlock("last_rose", new FlowerBlock(StatusEffects.LUCK, 10,FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_LAST_ROSE = Registry.register(Registries.BLOCK, new Identifier(BossesAndMore.MOD_ID, "potted_last_rose"), new FlowerPotBlock(LAST_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BossesAndMore.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BossesAndMore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BossesAndMore.LOGGER.info("Registering ModBlocks for " + BossesAndMore.MOD_ID);
    }
}