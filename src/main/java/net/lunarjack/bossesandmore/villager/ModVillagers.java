package net.lunarjack.bossesandmore.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.lunarjack.bossesandmore.BossesAndMore;
import net.lunarjack.bossesandmore.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
public static final RegistryKey<PointOfInterestType> GEM_R_POI_KEY = poiKey("gemrpoi");
public static final PointOfInterestType GEM_R_POI = registerPoi("gemrpoi", ModBlocks.PILLAR_SHELL);

public static final VillagerProfession GEM_REFINER = registerProfession("gem_refiner", GEM_R_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(BossesAndMore.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH));
    }

private static PointOfInterestType registerPoi(String name, Block block) {
    return PointOfInterestHelper.register(new Identifier(BossesAndMore.MOD_ID, name), 1, 1, block);
}
private static RegistryKey<PointOfInterestType> poiKey(String name) {
    return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(BossesAndMore.MOD_ID, name));
}

    public static void registerVillagers() {
        BossesAndMore.LOGGER.info("Registering Villagers " + BossesAndMore.MOD_ID);
    }
}
