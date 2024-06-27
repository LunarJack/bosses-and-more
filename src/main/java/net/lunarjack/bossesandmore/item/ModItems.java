package net.lunarjack.bossesandmore.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lunarjack.bossesandmore.BossesAndMore;
import net.lunarjack.bossesandmore.item.custom.ModArmorItem;
import net.lunarjack.bossesandmore.item.custom.UltimateCrystalItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.lunarjack.bossesandmore.block.ModBlocks.ENDISITE;
import static net.lunarjack.bossesandmore.block.ModBlocks.PILLAR_SHELL;

public class ModItems {
    public static final Item PILLAR_CORE = registerItem("pillar_core", new Item(new FabricItemSettings()));
    public static final Item ENDESITE_INGOT = registerItem("endesite_ingot", new Item(new FabricItemSettings()));
    public static final Item ENDESITE_CLUMP = registerItem("endesite_clump", new Item(new FabricItemSettings()));
    public static final Item ENDER_ORANGE = registerItem("ender_orange", new Item(new FabricItemSettings().food(ModFoodComponents.ENDER_ORANGE)));
    public static final Item ULTIMATE_CRYSTAL = registerItem("ultimate_crystal", new UltimateCrystalItem(new FabricItemSettings().maxCount(1)));
    public static final Item ENDESITE_HOE = registerItem("endesite_hoe", new HoeItem(ModToolMaterial.ENDESITE, 4, 2f, new FabricItemSettings()));
    public static final Item ENDESITE_SHOVEL = registerItem("endesite_shovel", new ShovelItem(ModToolMaterial.ENDESITE, 5, 1f, new FabricItemSettings()));
    public static final Item ENDESITE_PICKAXE = registerItem("endesite_pickaxe", new PickaxeItem(ModToolMaterial.ENDESITE, 6, 1f, new FabricItemSettings()));
    public static final Item ENDESITE_AXE = registerItem("endesite_axe", new AxeItem(ModToolMaterial.ENDESITE, 13, 1f, new FabricItemSettings()));
    public static final Item ENDESITE_SWORD = registerItem("endesite_sword", new SwordItem(ModToolMaterial.ENDESITE, 11, 1f, new FabricItemSettings()));
    public static final Item ENDESITE_HELMET = registerItem("endesite_helmet", new ArmorItem(ModArmorMaterials.ENDESITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDESITE_CHESTPLATE = registerItem("endesite_chestplate", new ModArmorItem(ModArmorMaterials.ENDESITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ENDESITE_LEGGINGS = registerItem("endesite_leggings", new ArmorItem(ModArmorMaterials.ENDESITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ENDESITE_BOOTS = registerItem("endesite_boots", new ArmorItem(ModArmorMaterials.ENDESITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item OPAL_CLUMP = registerItem("opal_clump", new Item(new FabricItemSettings()));
    public static final Item TOPAZ_CLUMP = registerItem("topaz_clump", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(PILLAR_CORE);
        entries.add(ENDESITE_INGOT);
        entries.add(ENDESITE_CLUMP);
    }
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDISITE);
    }
    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDER_ORANGE);
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(ULTIMATE_CRYSTAL);
        entries.add(ENDESITE_SWORD);
        entries.add(ENDESITE_AXE);
        entries.add(ENDESITE_HELMET);
        entries.add(ENDESITE_CHESTPLATE);
        entries.add(ENDESITE_LEGGINGS);
        entries.add(ENDESITE_BOOTS);
    }
    private static void addItemsToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(PILLAR_SHELL);
    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDESITE_HOE);
        entries.add(ENDESITE_SHOVEL);
        entries.add(ENDESITE_PICKAXE);
        entries.add(ENDESITE_SWORD);
        entries.add(ENDESITE_AXE);
        entries.add(ENDESITE_HELMET);
        entries.add(ENDESITE_CHESTPLATE);
        entries.add(ENDESITE_LEGGINGS);
        entries.add(ENDESITE_BOOTS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BossesAndMore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BossesAndMore.LOGGER.info("Registering Mod Items for " + BossesAndMore.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}
