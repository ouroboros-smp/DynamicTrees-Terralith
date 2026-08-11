package maxhyper.dtterralith;

import com.dtteam.dynamictrees.api.DynamicTreesAddonEntrypoint;
import maxhyper.dtterralith.registry.DTTRegistries;
import net.minecraft.resources.Identifier;

/** Fabric entrypoint for the Terralith tree pack. */
public final class DynamicTreesTerralith implements DynamicTreesAddonEntrypoint {

    public static final String MOD_ID = "dtterralith";

    @Override
    public void onDynamicTreesPreSetup() {
        DynamicTreesAddonEntrypoint.setupAddon(MOD_ID);
        DTTRegistries.setup();
    }

    public static Identifier location(String name) {
        return Identifier.fromNamespaceAndPath(MOD_ID, name);
    }
}
