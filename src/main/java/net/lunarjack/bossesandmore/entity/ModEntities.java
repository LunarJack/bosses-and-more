package net.lunarjack.bossesandmore.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.lunarjack.bossesandmore.BossesAndMore;
import net.lunarjack.bossesandmore.entity.custom.PillarEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PillarEntity> PILLAR = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(BossesAndMore.MOD_ID, "pillar"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, PillarEntity::new).dimensions(EntityDimensions.fixed(1f, 3f)).build());
}
