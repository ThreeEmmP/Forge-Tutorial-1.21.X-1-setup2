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
    public static final RegistryObject<Item> STURDY_TOOL_ROD = ITEMS.register("sturdy_tool_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRONG_TOOL_ROD = ITEMS.register("strong_tool_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WEAK_HILT = ITEMS.register("weak_hilt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STURDY_HILT = ITEMS.register("sturdy_hilt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRONG_HILT = ITEMS.register("strong_hilt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_BINDING = ITEMS.register("wooden_binding",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_PICKEND = ITEMS.register("wooden_pickend",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_AXE_HEAD = ITEMS.register("wooden_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_BLADE = ITEMS.register("wooden_blade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_SPADE = ITEMS.register("wooden_spade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STONE_BINDING = ITEMS.register("stone_binding",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_PICKEND = ITEMS.register("stone_pickend",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_AXE_HEAD = ITEMS.register("stone_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_BLADE = ITEMS.register("stone_blade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_SPADE = ITEMS.register("stone_spade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_BINDING = ITEMS.register("golden_binding",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_PICKEND = ITEMS.register("golden_pickend",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_AXE_HEAD = ITEMS.register("golden_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_BLADE = ITEMS.register("golden_blade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SPADE = ITEMS.register("golden_spade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_BINDING = ITEMS.register("iron_binding",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PICKEND = ITEMS.register("iron_pickend",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_AXE_HEAD = ITEMS.register("iron_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLADE = ITEMS.register("iron_blade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_SPADE = ITEMS.register("iron_spade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_BINDING = ITEMS.register("diamond_binding",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PICKEND = ITEMS.register("diamond_pickend",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_AXE_HEAD = ITEMS.register("diamond_axe_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BLADE = ITEMS.register("diamond_blade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SPADE = ITEMS.register("diamond_spade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_BOLT = ITEMS.register("iron_bolt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
