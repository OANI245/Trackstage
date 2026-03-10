package cn.zbx1425.mtrsteamloco.mixin;

import org.mtr.mod.client.DynamicTextureCache;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.awt.*;

@Mixin(value = DynamicTextureCache.class, remap = false)
public interface ClientCacheAccessor {

    @Accessor
    Font getFont();

    @Accessor
    void setFont(Font value);

    @Accessor
    Font getFontCjk();

    @Accessor
    void setFontCjk(Font value);
}
