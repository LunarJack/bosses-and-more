package net.lunarjack.bossesandmore.sound;

import net.lunarjack.bossesandmore.BossesAndMore;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(BossesAndMore.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void RegisterSounds() {
        BossesAndMore.LOGGER.info("Registering Sounds for " + BossesAndMore.MOD_ID);
    }
}
