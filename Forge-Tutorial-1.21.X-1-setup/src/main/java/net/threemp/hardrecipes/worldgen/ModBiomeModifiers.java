package net.threemp.hardrecipes.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.threemp.hardrecipes.HardRecipes;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_CANDELILLA_PLANT = registerKey("add_candelilla_plant");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeature = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_CANDELILLA_PLANT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct((biomes.getOrThrow(Biomes.SAVANNA)), biomes.getOrThrow(Biomes.DESERT), biomes.getOrThrow(Biomes.WINDSWEPT_SAVANNA), biomes.getOrThrow(Biomes.BADLANDS), biomes.getOrThrow(Biomes.BEACH)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.CANDELILLA_PLANT_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(HardRecipes.MOD_ID, name));
    }
}
