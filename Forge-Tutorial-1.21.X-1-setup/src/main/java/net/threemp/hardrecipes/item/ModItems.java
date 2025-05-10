package net.threemp.hardrecipes.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.threemp.hardrecipes.HardRecipes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HardRecipes.MOD_ID);

    public static final RegistryObject<Item> WAXEDTHREAD = ITEMS.register("waxedthread",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEMAT = ITEMS.register("placemat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIBER = ITEMS.register("fiber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TWINE = ITEMS.register("twine",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
