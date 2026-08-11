package maxhyper.dtterralith.registry;

import com.dtteam.dynamictrees.api.cell.CellKit;
import com.dtteam.dynamictrees.systems.genfeature.GenFeature;
import com.dtteam.dynamictrees.systems.growthlogic.GrowthLogicKit;
import com.dtteam.dynamictrees.tree.species.Species;
import maxhyper.dtterralith.DynamicTreesTerralith;
import maxhyper.dtterralith.cellkits.DTTerralithCellKits;
import maxhyper.dtterralith.genfeatures.DTTerralithGenFeatures;
import maxhyper.dtterralith.growthlogic.DTTGrowthLogicKits;
import maxhyper.dtterralith.trees.PoplarSpecies;

/** Registers the add-on's custom Dynamic Trees types before tree-pack loading begins. */
public final class DTTRegistries {

    private DTTRegistries() {
    }

    public static void setup() {
        Species.REGISTRY.registerType(DynamicTreesTerralith.location("poplar"), PoplarSpecies.TYPE);
        DTTerralithCellKits.register(CellKit.REGISTRY);
        DTTGrowthLogicKits.register(GrowthLogicKit.REGISTRY);
        DTTerralithGenFeatures.register(GenFeature.REGISTRY);
    }
}
