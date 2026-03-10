package cn.zbx1425.mtrsteamloco.mvapi;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;

public interface MVComponent {
    Component EMPTY = #if MC_VERSION >= 11900 Component.empty().copy() #else new TextComponent("").copy() #endif;

    static Component text(String v) {
        return #if MC_VERSION >= 11900 Component.literal(v) #else new TextComponent(v) #endif;
    }

    static Component translatable(String d) {
        return #if MC_VERSION >= 11900 Component.translatable(d) #else new TranslatableComponent(d) #endif;
    }

    static Component translatable(String d, Object... f) {
        return #if MC_VERSION >= 11900 Component.translatable(d, f) #else new TranslatableComponent(d, f) #endif;
    }
}
