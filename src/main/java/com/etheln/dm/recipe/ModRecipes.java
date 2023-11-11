package com.etheln.dm.recipe;

import com.etheln.dm.DeeZmobZ;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, DeeZmobZ.MODID);

    public static final RegistryObject<RecipeSerializer<MobGrinderRecipe>> MOB_GRINDER_SERIALIZER =
            SERIALIZERS.register("mobgrinder", () -> MobGrinderRecipe.Serializer.INSTANCE);

    public static void register(IEventBus bus) {
        SERIALIZERS.register(bus);
    }
}
