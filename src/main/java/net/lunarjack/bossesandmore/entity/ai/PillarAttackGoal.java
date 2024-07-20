package net.lunarjack.bossesandmore.entity.ai;

import net.lunarjack.bossesandmore.entity.custom.PillarEntity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.ai.goal.ProjectileAttackGoal;


public class PillarAttackGoal extends ProjectileAttackGoal {
    private final PillarEntity entity;
    public PillarAttackGoal(RangedAttackMob mob, double mobSpeed, int intervalTicks, float maxShootRange) {
        super(mob, mobSpeed, intervalTicks, maxShootRange);
        entity = ((PillarEntity) mob);
    }
}
