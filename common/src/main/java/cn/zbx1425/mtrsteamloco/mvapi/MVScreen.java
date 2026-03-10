package cn.zbx1425.mtrsteamloco.mvapi;

#if MC_VERSION >= 12003
import net.minecraft.client.gui.GuiGraphics;
#else
import com.mojang.blaze3d.vertex.PoseStack;
#endif
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public abstract class MVScreen extends Screen {
    public MVScreen(Component title) {
        super(title);
    }

    public MVScreen() {
        this(MVComponent.EMPTY);
    }

    public abstract void initScreen();

    public void renderScreen(#if MC_VERSION >= 12003 GuiGraphics #else PoseStack #endif graphics, int mouseX, int mouseY, float f) {
        super.render(graphics, mouseX, mouseY, f);
    }

    @Override
    protected final void init() {
        initScreen();
    }

    @Override
    public final void render(#if MC_VERSION >= 12003 GuiGraphics #else PoseStack #endif guiGraphics, int mouseX, int mouseY, float partialTick) {
        renderScreen(guiGraphics, mouseX, mouseY, partialTick);
    }
}
