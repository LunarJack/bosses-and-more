package net.lunarjack.bossesandmore.item.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.lunarjack.bossesandmore.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier ABANDONED_MINESHAFT_ID = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier SUSPICIOUS_SAND_ID = new Identifier("minecraft", "archeology/desert_pyramid");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.RUBY_CLUMP))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
                }
            });
        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
        //if(SUSPICIOUS_SAND_ID.equals(id)) {
            //List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
            //entries.add(ItemEntry.builder(ModItems.TOPAZ_CLUMP).build());
//
            //LootPool.Builder pool = LootPool.builder().with(entries);
            //return LootTable.builder().pool(pool).build();
        //}


            return null;
        });
        }
    }
