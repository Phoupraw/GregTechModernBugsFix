package phoupraw.mcmod.gregtechmodernbugsfix.datagen;

import net.minecraft.data.PackOutput;
import phoupraw.mcmod.gregtechmodernbugsfix.GregTechModernBugsFix;

final class ChineseGen extends LangGen {
    ChineseGen(PackOutput output) {
        super(output, "zh_cn");
    }
    @Override
    protected String getDescPath() {
        return "/README.md";
    }
    @Override
    protected void addTranslations() {
        super.addTranslations();
        var modName = "格雷科技现代版漏洞修复";
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