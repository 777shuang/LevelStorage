package makmods.levelstorage.compat.nei;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import codechicken.nei.forge.GuiContainerManager;
import makmods.levelstorage.lib.Reference;

public class NEILSConfig implements IConfigureNEI {

    @Override
    public void loadConfig() {
        GuiContainerManager.addTooltipHandler(new XPRegistryHandler());
        GuiContainerManager.addTooltipHandler(new IVRegistryHandler());
        // API.registerRecipeHandler(new XPGeneratorHandler());
        API.registerUsageHandler(new DrillEnhancementHandler());
        API.registerRecipeHandler(new DrillEnhancementHandler());
    }

    @Override
    public String getName() {
        return Reference.MOD_ID;
    }

    @Override
    public String getVersion() {
        return Reference.VERSION;
    }
}
