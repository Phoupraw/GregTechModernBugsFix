package phoupraw.mcmod.gregtechmodernbugsfix.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import phoupraw.mcmod.gregtechmodernbugsfix.GregTechModernBugsFix;

@EventBusSubscriber(modid = GregTechModernBugsFix.ID, bus = EventBusSubscriber.Bus.MOD)
public final class GregTechModernBugsFixDataGen {
    @SubscribeEvent
    private static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        generator.addProvider(event.includeClient(), new ChineseGen(output));
        generator.addProvider(event.includeClient(), new EnglishGen(output));
        generator.addProvider(event.includeServer(), new RecipeGen(output, event.getLookupProvider()));
    }
}