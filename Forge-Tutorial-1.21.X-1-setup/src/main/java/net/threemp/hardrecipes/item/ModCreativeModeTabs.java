package net.threemp.hardrecipes.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.threemp.hardrecipes.HardRecipes;

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

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
