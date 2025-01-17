package charlsen.charlsens.ideas.Generators;


import charlsen.charlsens.ideas.Charlsensideas;
import charlsen.charlsens.ideas.CharlsensideasConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class PineTreeGenerator extends SaplingGenerator {
public PineTreeGenerator() {

}

    @Nullable
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
        return (ConfiguredFeature<TreeFeatureConfig, ?>) CharlsensideasConfiguredFeatures.PINE_TREE;
    }
}
