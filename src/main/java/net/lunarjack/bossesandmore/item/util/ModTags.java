package net.lunarjack.bossesandmore.item.util;

import net.lunarjack.bossesandmore.BossesAndMore;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BOSS_DROPS = createTag("block_boss_drops");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BossesAndMore.MOD_ID, name));
        }
}

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BossesAndMore.MOD_ID, name));
        }
    }
}
