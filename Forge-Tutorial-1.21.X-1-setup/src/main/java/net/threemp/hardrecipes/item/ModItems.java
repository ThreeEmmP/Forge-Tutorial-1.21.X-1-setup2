package net.threemp.hardrecipes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.threemp.hardrecipes.HardRecipes;
import net.threemp.hardrecipes.customitem.ScraperItem;

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

    public static final RegistryObject<Item> CANDELILLA = ITEMS.register("candelilla",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CANDELILLA_WAX = ITEMS.register("candelilla_wax",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears",
            () -> new ScraperItem(new Item.Properties().durability(16)));

    public static final RegistryObject<Item> WEAK_TOOL_ROD = ITEMS.register("weak_tool_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEAK_HILT = ITEMS.register("weak_hilt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_BINDING = ITEMS.register("wooden_binding",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_PICKEND = ITEMS.register("wooden_pickend",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_AXE_HEAD = ITEMS.register("wooden_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_BLADE = ITEMS.register("wooden_blade",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
