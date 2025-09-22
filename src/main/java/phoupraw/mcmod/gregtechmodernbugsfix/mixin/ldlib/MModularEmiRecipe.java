package phoupraw.mcmod.gregtechmodernbugsfix.mixin.ldlib;

import com.lowdragmc.lowdraglib.emi.ModularEmiRecipe;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;

@OnlyIn(Dist.CLIENT)
@Mixin(ModularEmiRecipe.class)
abstract class MModularEmiRecipe {
    //@ModifyExpressionValue(method = "addWidgets", at = @At(value = "INVOKE", target = "Lcom/lowdragmc/lowdraglib/gui/widget/Widget;getParent()Lcom/lowdragmc/lowdraglib/gui/widget/WidgetGroup;"))
    //private @Nullable WidgetGroup alwaysAddSlot(WidgetGroup original) {
    //    return null;
    //}
}