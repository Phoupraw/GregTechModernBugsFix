package phoupraw.mcmod.gregtechmodernbugsfix.mixin.gtceu;

import com.gregtechceu.gtceu.integration.emi.recipe.GTEmiRecipe;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;

@OnlyIn(Dist.CLIENT)
@Mixin(GTEmiRecipe.class)
abstract class MGTEmiRecipe {

}