package phoupraw.mcmod.gregtechmodernbugsfix;

import com.gregtechceu.gtceu.api.gui.widget.SlotWidget;
import dev.emi.emi.screen.RecipeScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ScreenEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.NeoForge;
import phoupraw.mcmod.gregtechmodernbugsfix.mixins.gtceu.MMSlotWidget;

@OnlyIn(Dist.CLIENT)
@Mod(value = GregTechModernBugsFix.ID, dist = Dist.CLIENT)
public final class GregTechModernBugsFixClient {
    private static void afterKeyPressed(ScreenEvent.KeyPressed.Post event) {
        var hovered = MMSlotWidget.hovered;
        if (hovered != null) {
            if (ModList.get().isLoaded("emi")) {
                afterKeyPressedInSlotInEMI(event, hovered);
            }
        }
    }
    private static void afterKeyPressedInSlotInEMI(ScreenEvent.KeyPressed.Post event, SlotWidget hovered) {
        if (event.getScreen() instanceof RecipeScreen) {
            MMSlotWidget.keyPressed(hovered, event.getKeyCode(), event.getScanCode(), event.getModifiers());
        }
    }
    public GregTechModernBugsFixClient(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        NeoForge.EVENT_BUS.addListener(GregTechModernBugsFixClient::afterKeyPressed);
    }
}