package de.manfred.digital_diggers.block;

import de.manfred.digital_diggers.DigitalDiggers;
import de.manfred.digital_diggers.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DigitalDiggers.MOD_ID);

    public static final RegistryObject<Block> MINER = registerBlock("miner",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANVIL)));

    public static final RegistryObject<Block> MINER_V2 = registerBlock("miner_v2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANVIL)));

    //lustige Blöcke
    public static final RegistryObject<Block> BLOCK_OF_BITCOIN = registerBlock("block_of_bitcoin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHER_GOLD_ORE)));

    public static final RegistryObject<Block> BITCOIN_ORE = registerBlock("bitcoin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> BLOCK_OF_DOGECOIN = registerBlock("block_of_dogecoin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHER_GOLD_ORE)));

    public static final RegistryObject<Block> BLOCK_OF_LITECOIN = registerBlock("block_of_litecoin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHER_GOLD_ORE)));

    public static final RegistryObject<Block> BLOCK_OF_MONERO = registerBlock("block_of_monero",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHER_GOLD_ORE)));

    public static final RegistryObject<Block> BLOCK_OF_ETHEREUM = registerBlock("block_of_ethereum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHER_GOLD_ORE)));

    public static final RegistryObject<Block> BLOCK_OF_RAVENCOIN = registerBlock("block_of_ravencoin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHER_GOLD_ORE)));

    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return  ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
