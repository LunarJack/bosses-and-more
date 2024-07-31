package net.lunarjack.bossesandmore.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lunarjack.bossesandmore.BossesAndMore;
import net.lunarjack.bossesandmore.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BAM_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(BossesAndMore.MOD_ID, "pillar_core"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.BAM"))
                    .icon(() -> new ItemStack(ModItems.PILLAR_CORE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PILLAR_CORE);
                        entries.add(ModBlocks.PILLAR_SHELL);
                        entries.add(ModItems.ENDESITE_INGOT);
                        entries.add(ModItems.ULTIMATE_CRYSTAL);
                        entries.add(ModItems.ENDER_ORANGE);
                        entries.add(ModItems.ENDESITE_CLUMP);
                        entries.add(ModItems.ENDESITE_HOE);
                        entries.add(ModItems.ENDESITE_SHOVEL);
                        entries.add(ModItems.ENDESITE_PICKAXE);
                        entries.add(ModItems.ENDESITE_SWORD);
                        entries.add(ModItems.ENDESITE_AXE);
                        entries.add(ModItems.ENDESITE_HELMET);
                        entries.add(ModItems.ENDESITE_CHESTPLATE);
                        entries.add(ModItems.ENDESITE_LEGGINGS);
                        entries.add(ModItems.ENDESITE_BOOTS);
                        entries.add(ModBlocks.LAST_ROSE);
                        entries.add(ModBlocks.GLOWING_OBSIDIAN);
                        entries.add(ModBlocks.BLUE_ROSE);
                        entries.add(ModBlocks.FULL_GRASS_BLOCK);
                        entries.add(ModBlocks.RED_CLOTH);
                        entries.add(ModBlocks.ANCIENT_OAK_PLANKS);
                        entries.add(ModBlocks.ORANGE_CLOTH);
                        entries.add(ModBlocks.ENDISITE);
                        entries.add(ModBlocks.GEM_REFINERY);

                    }).build());


    public static void registerItemGroups() {
        BossesAndMore.LOGGER.info("Registering Item Groups for " + BossesAndMore.MOD_ID);
    }
}
