package net.lunarjack.bossesandmore;

import net.fabricmc.api.ModInitializer;


import net.lunarjack.bossesandmore.block.ModBlocks;
import net.lunarjack.bossesandmore.item.ModItemGroups;
import net.lunarjack.bossesandmore.item.ModItems;
import net.lunarjack.bossesandmore.item.util.ModCustomTrades;
import net.lunarjack.bossesandmore.item.util.ModLootTableModifiers;
import net.lunarjack.bossesandmore.sound.ModSounds;
import net.lunarjack.bossesandmore.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BossesAndMore implements ModInitializer {
public static final String MOD_ID = "bossesandmore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();
		ModSounds.RegisterSounds();

	}
}