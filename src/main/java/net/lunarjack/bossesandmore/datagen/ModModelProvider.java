package net.lunarjack.bossesandmore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lunarjack.bossesandmore.block.ModBlocks;
import net.lunarjack.bossesandmore.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDISITE);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LAST_ROSE, ModBlocks.POTTED_LAST_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOWING_OBSIDIAN);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_ROSE, ModBlocks.POTTED_BLUE_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.UPDATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ATEUPD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FULL_GRASS_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CLOTH);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CLOTH);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PILLAR_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDESITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ULTIMATE_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDESITE_CLUMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDESITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDESITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDESITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDESITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDESITE_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDESITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDESITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDESITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDESITE_BOOTS));

    }
}
