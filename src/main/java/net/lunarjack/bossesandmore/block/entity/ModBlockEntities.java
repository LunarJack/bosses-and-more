package net.lunarjack.bossesandmore.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.lunarjack.bossesandmore.BossesAndMore;
import net.lunarjack.bossesandmore.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<GemRefineryBlockEntity> GEM_REFINERY_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BossesAndMore.MOD_ID, "gem_refinery_be"),
                FabricBlockEntityTypeBuilder.create(GemRefineryBlockEntity::new,
                    ModBlocks.GEM_REFINERY).build());

    public static void registerBlockEntities() {
        BossesAndMore.LOGGER.info("Registering Block Entities for " + BossesAndMore.MOD_ID);
    }
}
