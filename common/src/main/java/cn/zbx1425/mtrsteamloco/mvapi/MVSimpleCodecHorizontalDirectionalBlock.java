package cn.zbx1425.mtrsteamloco.mvapi;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import org.jetbrains.annotations.NotNull;

public class MVSimpleCodecHorizontalDirectionalBlock extends HorizontalDirectionalBlock {
    #if MC_VERSION >= 12003
    //public static final MapCodec<MVSimpleCodecHorizontalDirectionalBlock> CODEC = simpleCodec(MVSimpleCodecHorizontalDirectionalBlock::new);

    /*@Override
    protected @NotNull MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }*/
    #endif

    protected MVSimpleCodecHorizontalDirectionalBlock(Properties properties) {
        super(properties);
    }
}
