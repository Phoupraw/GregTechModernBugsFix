package phoupraw.mcmod.gregtechmodernbugsfix.mixins.gtceu;

import com.gregtechceu.gtceu.api.gui.widget.SlotWidget;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.stack.EmiStackInteraction;
import dev.emi.emi.screen.EmiScreenManager;
import dev.emi.emi.screen.RecipeScreen;
import lombok.experimental.UtilityClass;
import net.minecraft.client.Minecraft;
import net.minecraft.world.inventory.Slot;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.fml.ModList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import phoupraw.mcmod.gregtechmodernbugsfix.mixin.ldlib.ASlotWidget;

@OnlyIn(Dist.CLIENT)
@ApiStatus.Internal
@UtilityClass
public class MMSlotWidget {
    public static @Nullable SlotWidget hovered;
    public static @Nullable Boolean mouseClicked(SlotWidget self, double mouseX, double mouseY, int button) {
        var slotReference = ((ASlotWidget) self).getSlotReference();
        if (slotReference != null && self.isMouseOverElement(mouseX, mouseY) && self.getGui() != null) {
            if (ModList.get().isLoaded("emi")) {
                return mouseClickedInEMI(self, mouseX, mouseY, button, slotReference);
            }
        }
        return null;
    }
    public static @Nullable Boolean mouseClickedInEMI(SlotWidget self, double mouseX, double mouseY, int button, Slot slotReference) {
        if (Minecraft.getInstance().screen instanceof RecipeScreen) {
            return EmiScreenManager.stackInteraction(new EmiStackInteraction(EmiStack.of(slotReference.getItem()), null, true),
              bind -> bind.matchesMouse(button));
        }
        return null;
    }
    //TODO 整理一下与这个方法相关的代码，删除无用代码
    public static @Nullable Boolean keyPressed(SlotWidget self, int keyCode, int scanCode, int modifiers) {
        var slotReference = ((ASlotWidget) self).getSlotReference();
        if (slotReference != null && self.getGui() != null) {
            if (Minecraft.getInstance().screen instanceof RecipeScreen) {
                return EmiScreenManager.stackInteraction(new EmiStackInteraction(EmiStack.of(slotReference.getItem()), null, true),
                  bind -> bind.matchesKey(keyCode, scanCode));
            }
        }
        return null;
    }
    public static void onFrame(SlotWidget self, double mouseX, double mouseY, float partialTicks) {
        if (hovered == self) {
            if (!self.isMouseOverElement(mouseX, mouseY)) {
                hovered = null;
            }
        } else {
            if (self.isMouseOverElement(mouseX, mouseY)) {
                hovered = self;
            }
        }
    }
}