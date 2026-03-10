package cn.zbx1425.mtrsteamloco.data;

import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import org.mtr.core.data.Rail;
import org.mtr.mod.data.RailAction;

import java.util.List;
import java.util.Map;

public interface RailActionsModuleExtraSupplier {
    List<RailAction> getRailActions();
    Map<BlockPos, Map<BlockPos, Rail>> getRails();
    Level getWorld();
    void sendUpdateS2C();
}