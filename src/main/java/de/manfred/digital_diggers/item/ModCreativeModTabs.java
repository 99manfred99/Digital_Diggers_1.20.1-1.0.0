package de.manfred.digital_diggers.item;

import de.manfred.digital_diggers.DigitalDiggers;
import de.manfred.digital_diggers.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DigitalDiggers.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () ->  CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MONERO.get()))
                    .title(Component.translatable("creativetab.digital_diggers_tab"))
                    .displayItems((pParameters, pOutput) -> {  //Hier Items für Creative Tab registrieren

                        pOutput.accept(ModItems.BITCOIN.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_BITCOIN.get());
                        pOutput.accept(ModBlocks.BITCOIN_ORE.get());

                        pOutput.accept(ModItems.ETHEREUM.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_ETHEREUM.get());

                        pOutput.accept(ModItems.LITECOIN.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_LITECOIN.get());

                        pOutput.accept(ModItems.MONERO.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_MONERO.get());

                        pOutput.accept(ModItems.RAVENCOIN.get());
                        pOutput.accept(ModBlocks.BLOCK_OF_RAVENCOIN.get());

                        pOutput.accept(ModBlocks.MINER.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
