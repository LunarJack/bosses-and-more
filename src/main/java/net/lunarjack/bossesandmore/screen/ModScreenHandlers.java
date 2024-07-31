package net.lunarjack.bossesandmore.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.lunarjack.bossesandmore.BossesAndMore;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<GemRefiningScreenHandler> GEM_REFINING_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER, new Identifier(BossesAndMore.MOD_ID, "gem_refining"),new ExtendedScreenHandlerType<>(GemRefiningScreenHandler::new));

    public static void registerScreenHandlers() {
        BossesAndMore.LOGGER.info("Registering Screen Handlers for " + BossesAndMore.MOD_ID);
    }
}
