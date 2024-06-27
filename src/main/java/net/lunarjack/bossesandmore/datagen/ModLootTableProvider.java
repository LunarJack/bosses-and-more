package net.lunarjack.bossesandmore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lunarjack.bossesandmore.block.ModBlocks;
import net.lunarjack.bossesandmore.item.ModItems;
import net.minecraft.block.Blocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PILLAR_SHELL);
        addDrop(ModBlocks.LAST_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_LAST_ROSE);

        addDrop(ModBlocks.ENDISITE, oreDrops(ModBlocks.ENDISITE, ModItems.ENDESITE_CLUMP));
    }
}
