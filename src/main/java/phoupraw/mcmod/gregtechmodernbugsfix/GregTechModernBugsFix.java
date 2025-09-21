package phoupraw.mcmod.gregtechmodernbugsfix;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Mod(GregTechModernBugsFix.ID)
public final class GregTechModernBugsFix {
    public static final String ID = "gregtechmodernbugsfix";
    public static final Logger LOGGER = LogManager.getLogger(ID);
    public static final String NAME_KEY = "modmenu.nameTranslation." + ID;
    public static final String NAME_EN = "GregTech Modern Bugs Fix";
    public static @NotNull MutableComponent name() {
        return Component.translatableWithFallback(NAME_KEY, NAME_EN);
    }
    public static @NotNull MutableComponent prefixed(String format, Object... args) {
        return Component.translatableWithFallback("TODO", "[%s] " + format, ArrayUtils.addFirst(args, name()));
    }
    public GregTechModernBugsFix(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, GTMBFConfigs.COMMON_SPEC);
        modContainer.registerConfig(ModConfig.Type.SERVER, GTMBFConfigs.SERVER_SPEC);
        modContainer.registerConfig(ModConfig.Type.CLIENT, GTMBFConfigs.CLIENT_SPEC);
    }
}