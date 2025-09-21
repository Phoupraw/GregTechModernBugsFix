package phoupraw.mcmod.gregtechmodernbugsfix.registries;

import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.ApiStatus;
import phoupraw.mcmod.gregtechmodernbugsfix.GregTechModernBugsFix;

@ApiStatus.NonExtendable
public interface GTMBFIDs {
    static ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(GregTechModernBugsFix.ID, path);
    }
}
