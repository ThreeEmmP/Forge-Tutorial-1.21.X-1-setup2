package net.threemp.hardrecipes.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.threemp.hardrecipes.HardRecipes;
import net.threemp.hardrecipes.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HardRecipes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HARD_RECIPES_ITEMS_TAB = CREATIVE_MODE_TABS.register("hard_recipes_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WAXEDTHREAD.get()))
                    .title(Component.translatable("creativetab.hardrecipes.hard_recipes_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WAXEDTHREAD.get());
                        output.accept(ModItems.PLACEMAT.get());
                        output.accept(ModItems.FIBER.get());
                        output.accept(ModItems.TWINE.get());
                        output.accept(ModItems.WOODEN_SHEARS.get());
                        output.accept(ModBlocks.BLOCK_OF_DOOM.get());

                        output.accept(ModBlocks.CANDELILLA_PLANT.get());
                        output.accept(ModItems.CANDELILLA.get());
                        output.accept(ModItems.CANDELILLA_WAX.get());

                        output.accept(ModItems.WEAK_TOOL_ROD.get());
                        output.accept(ModItems.WEAK_HILT.get());
                        output.accept(ModItems.WOODEN_BINDING.get());
                        output.accept(ModItems.WOODEN_PICKEND.get());
                        output.accept(ModItems.WOODEN_AXE_HEAD.get());
                        output.accept(ModItems.WOODEN_BLADE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
