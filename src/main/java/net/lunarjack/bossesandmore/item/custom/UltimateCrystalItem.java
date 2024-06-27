package net.lunarjack.bossesandmore.item.custom;


import net.lunarjack.bossesandmore.sound.ModSounds;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.mob.ElderGuardianEntity;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


import java.util.List;


public class UltimateCrystalItem extends Item {
    public UltimateCrystalItem(Settings settings) {
        super(settings);


    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient && entity.isAlive()) {
            if (!(entity instanceof EnderDragonEntity || entity instanceof WitherEntity || entity instanceof ElderGuardianEntity || entity instanceof WardenEntity)) {
                entity.kill();
                user.sendMessage(Text.literal("Mob Successfully Destroyed!"));
            }
            return ActionResult.success(user.getWorld().isClient);
        } else {  return ActionResult.PASS;
        }
        }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.bossesandmore.ultimate_crystal.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}

