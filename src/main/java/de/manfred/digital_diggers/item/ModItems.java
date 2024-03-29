package de.manfred.digital_diggers.item;

import de.manfred.digital_diggers.DigitalDiggers;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //add here Items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DigitalDiggers.MOD_ID);

    public static final RegistryObject<Item> MONERO = ITEMS.register("monero",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BITCOIN = ITEMS.register("bitcoin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DOGECOIN = ITEMS.register("dogecoin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ETHEREUM = ITEMS.register("ethereum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LITECOIN = ITEMS.register("litecoin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAVENCOIN = ITEMS.register("ravencoin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
