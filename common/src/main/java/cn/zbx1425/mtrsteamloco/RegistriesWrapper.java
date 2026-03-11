package cn.zbx1425.mtrsteamloco;

import cn.zbx1425.mtrsteamloco.registries.RegistryObject;
import net.minecraft.client.KeyMapping;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import java.util.List;
import java.util.function.Supplier;

public interface RegistriesWrapper {

#if MC_VERSION >= "12000"
    void registerCreativeModeTab(String id, CreativeModeTab creativeModeTab);
#endif
    void registerBlock(String id, RegistryObject<Block> block);

    void registerItem(String id, RegistryObject<ItemWithCreativeTabBase> item);

    void registerItem(String id, RegistryObject<Item> item, CreativeModeTabs.Wrapper creativeTab);

    void registerItem(String id, RegistryObject<Item> item, CreativeModeTab creativeTab);

    void registerBlockAndItem(String id, RegistryObject<Block> block, CreativeModeTabs.Wrapper tab);

    void registerBlockEntityType(String id, RegistryObject<? extends BlockEntityType<? extends BlockEntity>> blockEntityType);

    void registerEntityType(String id, RegistryObject<? extends EntityType<? extends Entity>> entityType);

    void registerSoundEvent(String id, SoundEvent soundEvent);

    void registerParticleType(String id, ParticleType<?> particleType);

    void sendPacketToServer(ResourceLocation location, FriendlyByteBuf pkt);

    void sendPacketToClient(ServerPlayer player, ResourceLocation location, FriendlyByteBuf pkt);

    SimpleParticleType createParticleType(boolean overrideLimiter);

}
