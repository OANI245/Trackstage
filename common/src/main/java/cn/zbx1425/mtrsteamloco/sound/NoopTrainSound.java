package cn.zbx1425.mtrsteamloco.sound;

import net.minecraft.world.level.Level;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mod.sound.VehicleSoundBase;

public class NoopTrainSound extends VehicleSoundBase {

    public static final NoopTrainSound INSTANCE = new NoopTrainSound();

    @Override
    public void playMotorSound(BlockPos blockPos, float v, float v1, float v2, boolean b) {
    }

    @Override
    public void dispose() {
    }

    @Override
    protected void playDoorSound(BlockPos blockPos, boolean b) {
    }

    @Override
    protected double getDoorCloseSoundTime() {
        return 0;
    }
}
