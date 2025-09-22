package phoupraw.mcmod.gregtechmodernbugsfix.mixin.ldlib;

import com.lowdragmc.lowdraglib.gui.widget.SlotWidget;
import net.minecraft.world.inventory.Slot;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@OnlyIn(Dist.CLIENT)
@Mixin(SlotWidget.class)
public interface ASlotWidget {
    @Accessor
    @Nullable Slot getSlotReference();
}