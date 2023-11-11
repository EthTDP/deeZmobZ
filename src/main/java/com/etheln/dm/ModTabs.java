package com.etheln.dm;

import com.etheln.dm.blocks.ModBlocks;
import com.etheln.dm.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            DeeZmobZ.MODID);

    public static final RegistryObject<CreativeModeTab> DEEZMOBZ_TAB = TABS.register("deezmobz_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .title(Component.translatable("itemGroup.deezmobz"))
                    .icon(() -> Items.DIAMOND.getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        Iterable<Item> items = ModItems.ITEMS.getEntries().stream().map(RegistryObject::get)::iterator;
                        items.forEach(output::accept);
                        Iterable<Block> blocks = ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
                        blocks.forEach(output::accept);
                    })
                    .build());

    public static void register(IEventBus bus) {
        TABS.register(bus);
    }
}
