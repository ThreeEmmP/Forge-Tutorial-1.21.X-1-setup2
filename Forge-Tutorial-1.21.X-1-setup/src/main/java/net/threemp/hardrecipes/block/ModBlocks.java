package net.threemp.hardrecipes.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.threemp.hardrecipes.HardRecipes;
import net.threemp.hardrecipes.customblock.CandelillaBlock;
import net.threemp.hardrecipes.item.ModItems;

import java.util.Properties;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HardRecipes.MOD_ID);

    public static final  RegistryObject<Block> BLOCK_OF_DOOM = registerBlock("block_of_doom",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL).noCollission()));

    public static final  RegistryObject<Block> CANDELILLA_PLANT = registerBlock("candelilla_plant",
            () -> new CandelillaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_BUSH)));

    private  static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
