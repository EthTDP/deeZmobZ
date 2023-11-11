package com.etheln.dm.items;

import com.etheln.dm.DeeZmobZ;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            DeeZmobZ.MODID);


    //Ingots
    public static final RegistryObject<Item> CREEPER_INGOT = ITEMS.register("creeper_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPIDER_INGOT = ITEMS.register("spider_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZOMBIE_INGOT = ITEMS.register("zombie_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SKELETON_INGOT = ITEMS.register("skeleton_ingot",
            () -> new Item(new Item.Properties()));

    //Raw Ingots
    public static final RegistryObject<Item> RAW_CREEPER_INGOT = ITEMS.register("raw_creeper",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SPIDER = ITEMS.register("raw_spider",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ZOMBIE = ITEMS.register("raw_zombie",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SKELETON = ITEMS.register("raw_skeleton",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> LIGHTER = ITEMS.register("lighter",
            () -> new Item(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> CUTTER = ITEMS.register("cutter",
            () -> new Item(new Item.Properties().durability(100)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
