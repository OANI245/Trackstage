package cn.zbx1425.mtrsteamloco.fabric;

import cn.zbx1425.mtrsteamloco.registries.RegistryObject;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import mtr.item.ItemWithCreativeTabBase;
import cn.zbx1425.mtrsteamloco.Main;
import cn.zbx1425.mtrsteamloco.RegistriesWrapper;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.KeyMapping;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.mtr.mapping.registry.CreativeModeTabHolder;
import org.mtr.mod.CreativeModeTabs;

import java.util.List;
import java.util.function.Supplier;
#if MC_VERSION >= "11903"
import static net.minecraft.data.BuiltinRegistries.*;
#else
import static net.minecraft.core.Registry.*;
#endif

public class RegistriesWrapperImpl implements RegistriesWrapper {

#if MC_VERSION >= "12000"
    @Override
    public void registerCreativeModeTab(String id, CreativeModeTab creativeModeTab) {
        net.minecraft.core.Registry.register(net.minecraft.core.registries.BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Main.MOD_ID, id), creativeModeTab);
    }
#endif

    @Override
    public void registerBlock(String id, RegistryObject<Block> block) {
        Registry.register(BLOCK, new ResourceLocation(Main.MOD_ID, id), block.get());
    }

    @Override
    public void registerBlockAndItem(String id, RegistryObject<Block> block, CreativeModeTabHolder tab) {
        Registry.register(BLOCK, new ResourceLocation(Main.MOD_ID, id), block.get());
        final BlockItem blockItem = new BlockItem(block.get(), new Item.Properties()#if MC_VERSION < 11903 .tab(tab.creativeModeTab) #endif);
        Registry.register(ITEM, new ResourceLocation(Main.MOD_ID, id), blockItem);
        FabricRegistryUtilities.registerCreativeModeTab(tab.creativeModeTab, blockItem);
    }

    @Override
    public void registerItem(String id, RegistryObject<ItemWithCreativeTabBase> item) {
        Registry.register(ITEM, new ResourceLocation(Main.MOD_ID, id), item.get());
        FabricRegistryUtilities.registerCreativeModeTab(item.get().creativeModeTab.get(), item.get());
    }

    @Override
    public void registerItem(String id, RegistryObject<Item> item, CreativeModeTabs.Wrapper creativeModeTab) {
        Registry.register(ITEM, new ResourceLocation(Main.MOD_ID, id), item.get());
        FabricRegistryUtilities.registerCreativeModeTab(creativeModeTab.get(), item.get());
    }

    @Override
    public void registerItem(String id, RegistryObject<Item> item, CreativeModeTab creativeModeTab) {
        Registry.register(ITEM, new ResourceLocation(Main.MOD_ID, id), item.get());
        FabricRegistryUtilities.registerCreativeModeTab(creativeModeTab, item.get());
    }

    @Override
    public void registerBlockEntityType(String id, RegistryObject<? extends BlockEntityType<? extends BlockEntity>> blockEntityType) {
        Registry.register(BLOCK_ENTITY_TYPE, new ResourceLocation(Main.MOD_ID, id), blockEntityType.get());
    }

    @Override
    public void registerEntityType(String id, RegistryObject<? extends EntityType<? extends Entity>> entityType) {
        Registry.register(ENTITY_TYPE, new ResourceLocation(Main.MOD_ID, id), entityType.get());
    }

    @Override
    public void registerSoundEvent(String id, SoundEvent soundEvent) {
        Registry.register(SOUND_EVENT, new ResourceLocation(Main.MOD_ID, id), soundEvent);
    }

    @Override
    public void registerParticleType(String id, ParticleType<?> particleType) {
        Registry.register(PARTICLE_TYPE, new ResourceLocation(Main.MOD_ID, id), particleType);
    }

    @Override
    public SimpleParticleType createParticleType(boolean overrideLimiter) {
        return FabricParticleTypes.simple(overrideLimiter);
    }
}