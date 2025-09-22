package phoupraw.mcmod.gregtechmodernbugsfix.mixin.gtceu;

import com.gregtechceu.gtceu.api.gui.widget.SlotWidget;
import net.minecraft.client.gui.GuiGraphics;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import phoupraw.mcmod.gregtechmodernbugsfix.mixins.gtceu.MMSlotWidget;

@OnlyIn(Dist.CLIENT)
@Mixin(SlotWidget.class)
abstract class MSlotWidget extends com.lowdragmc.lowdraglib.gui.widget.SlotWidget {
    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        var r = MMSlotWidget.mouseClicked((SlotWidget) (Object) this, mouseX, mouseY, button);
        return r != null ? r : super.mouseClicked(mouseX, mouseY, button);
    }
    /**
     这个方法根本不会被调用！
     */
    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        var r = MMSlotWidget.keyPressed((SlotWidget) (Object) this, keyCode, scanCode, modifiers);
        return r != null ? r : super.keyPressed(keyCode, scanCode, modifiers);
    }
    @Override
    public void drawInBackground(@NotNull GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        super.drawInBackground(graphics, mouseX, mouseY, partialTicks);
        MMSlotWidget.onFrame((SlotWidget) (Object) this, mouseX, mouseY, partialTicks);
    }
}