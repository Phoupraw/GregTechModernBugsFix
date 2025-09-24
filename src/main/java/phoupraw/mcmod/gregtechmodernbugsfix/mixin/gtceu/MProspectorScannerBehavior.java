package phoupraw.mcmod.gregtechmodernbugsfix.mixin.gtceu;

import com.gregtechceu.gtceu.common.item.behavior.ProspectorScannerBehavior;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.lowdragmc.lowdraglib.gui.factory.HeldItemUIFactory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ProspectorScannerBehavior.class)
abstract class MProspectorScannerBehavior {
    @ModifyExpressionValue(method = "createUI", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;getItemInHand(Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/item/ItemStack;"))
    private ItemStack correctHand(ItemStack original, HeldItemUIFactory.HeldItemHolder holder, Player entityPlayer) {
        return holder.getHeld();
    }
}