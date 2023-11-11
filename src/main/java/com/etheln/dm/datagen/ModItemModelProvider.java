package com.etheln.dm.datagen;

import com.etheln.dm.DeeZmobZ;
import com.etheln.dm.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DeeZmobZ.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Items
        simpleItem(ModItems.LIGHTER);
        simpleItem(ModItems.CUTTER);
        //Ingots
        simpleItem(ModItems.CREEPER_INGOT);
        simpleItem(ModItems.ZOMBIE_INGOT);
        simpleItem(ModItems.SPIDER_INGOT);
        simpleItem(ModItems.SKELETON_INGOT);
        //Raw Ingots
        simpleItem(ModItems.RAW_CREEPER_INGOT);
        simpleItem(ModItems.RAW_SKELETON);
        simpleItem(ModItems.RAW_ZOMBIE);
        simpleItem(ModItems.RAW_SPIDER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DeeZmobZ.MODID, "item/" + item.getId().getPath()));
    }
}
