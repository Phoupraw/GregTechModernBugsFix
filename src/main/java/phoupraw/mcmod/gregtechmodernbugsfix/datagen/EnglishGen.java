package phoupraw.mcmod.gregtechmodernbugsfix.datagen;

import net.minecraft.data.PackOutput;
import phoupraw.mcmod.gregtechmodernbugsfix.GregTechModernBugsFix;

final class EnglishGen extends LangGen {
    EnglishGen(PackOutput output) {
        super(output, "en_us");
    }
    @Override
    protected String getDescPath() {
        return "/README-en.md";
    }
    @Override
    protected void addTranslations() {
        super.addTranslations();
        var modName = GregTechModernBugsFix.NAME_EN;
        add(GregTechModernBugsFix.NAME_KEY, modName);
        add(GregTechModernBugsFix.ID + ".configuration.title", modName);
        //b.add("modmenu.summaryTranslation." + ID, "");
        //var desc = """
        //
        //   """;
        //add("modmenu.descriptionTranslation." + GregTechModernBugsFix.ID, desc);
        //add("fml.menu.mods.info.description." + GregTechModernBugsFix.ID, desc);
    }
}