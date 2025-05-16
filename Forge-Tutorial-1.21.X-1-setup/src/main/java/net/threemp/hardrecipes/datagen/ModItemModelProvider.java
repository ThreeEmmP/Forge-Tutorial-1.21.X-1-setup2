package net.threemp.hardrecipes.datagen;

import net.threemp.hardrecipes.HardRecipes;
import net.threemp.hardrecipes.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HardRecipes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.WAXEDTHREAD.get());
        basicItem(ModItems.TWINE.get());

        basicItem(ModItems.PLACEMAT.get());
        basicItem(ModItems.FIBER.get());
        basicItem(ModItems.WOODEN_SHEARS.get());
    }
}
