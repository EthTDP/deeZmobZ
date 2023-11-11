package com.etheln.dm.blocks.entity;

import com.etheln.dm.DeeZmobZ;
import com.etheln.dm.blocks.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DeeZmobZ.MODID);

    public static void register(IEventBus bus) {
        BLOCK_ENTITIES.register(bus);
    }

    public static final RegistryObject<BlockEntityType<MobGrinderBlockEntity>> MOB_GRINDER_BE =
            BLOCK_ENTITIES.register("mob_grinder_be",
                    () -> BlockEntityType.Builder.of(MobGrinderBlockEntity::new,
                            ModBlocks.MOB_GRINDER.get()).build(null));


}
