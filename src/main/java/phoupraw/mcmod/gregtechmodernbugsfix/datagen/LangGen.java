package phoupraw.mcmod.gregtechmodernbugsfix.datagen;

import lombok.SneakyThrows;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import phoupraw.mcmod.gregtechmodernbugsfix.GregTechModernBugsFix;

import java.nio.file.Files;
import java.nio.file.Path;

abstract class LangGen extends LanguageProvider {
    public LangGen(PackOutput output, String locale) {
        super(output, GregTechModernBugsFix.ID, locale);
    }
    protected abstract String getDescPath();
    protected void add(ModConfigSpec.ConfigValue<?> configValue, String title, String tooltip) {
        var key = configValue.getSpec().getTranslationKey();
        if (key == null) return;
        add(key, title);
        add(key + ".tooltip", tooltip);
    }
    protected void addJade(ResourceLocation id, String translation) {
        add("config.jade.plugin_" + id.toLanguageKey(), translation);
    }
    @SneakyThrows
    @MustBeInvokedByOverriders
    @Override
    protected void addTranslations() {
        var url = getClass().getResource(getDescPath());
        if (url != null) {
            var path = Path.of(url.toURI());
            var desc = Files.readString(path).replace("\r", "");
            add("modmenu.descriptionTranslation." + GregTechModernBugsFix.ID, desc);
            add("fml.menu.mods.info.description." + GregTechModernBugsFix.ID, desc);
        } else {
            LOGGER.warn("没有找到{}！", getDescPath());
        }
    }
}