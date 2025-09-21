package phoupraw.mcmod.gregtechmodernbugsfix.registries;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public interface GTMBFItems {
    
    static void initClass() {
    
    }
    private static <T extends Item> T r(ResourceLocation id, T value) {
        return Registry.register(BuiltInRegistries.ITEM, id, value);
    }
}