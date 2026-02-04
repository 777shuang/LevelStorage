package makmods.levelstorage.compat.nei;

import cpw.mods.fml.common.Loader;
import makmods.levelstorage.logic.util.LogHelper;

public class CompatibilityLoader {

    public static void load() {
        if (!Loader.isModLoaded("NotEnoughItems")) {
            LogHelper.severe("NEI is not installed, aborting.");
            return;
        }
        // Not much to do here otherwise
    }

}
