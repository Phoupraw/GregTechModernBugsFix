package phoupraw.mcmod.gregtechmodernbugsfix.mixin.gtceu;

import com.gregtechceu.gtceu.api.machine.trait.NotifiableItemStackHandler;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(NotifiableItemStackHandler.class)
abstract class MNotifiableItemStackHandler {
    @WrapOperation(method = "handleRecipe", at = @At(value = "INVOKE", target = "Lnet/neoforged/neoforge/common/crafting/SizedIngredient;test(Lnet/minecraft/world/item/ItemStack;)Z"))
    private static boolean testWithoutCount(SizedIngredient instance, ItemStack stack, Operation<Boolean> original) {
        return instance.ingredient().test(stack);
    }
}