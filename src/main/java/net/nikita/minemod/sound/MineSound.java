//package net.nikita.minemod.sound;
//
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.sounds.SoundEvent;
//import net.minecraft.world.entity.npc.VillagerTrades;
//import net.minecraftforge.event.server.ServerStartingEvent;
//import net.minecraftforge.event.village.VillagerTradesEvent;
//import net.minecraftforge.event.entity.EntityEvent;
//import net.minecraftforge.entity.PartEntity;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
//import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
//import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//import net.nikita.minemod.MineMod;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//
//@Mod.EventBusSubscriber(modid = "minemod")
//public class MineSound {
//    @SubscribeEvent
//    public static void onEntityJoinWorld(EntityJoinWorldEvent event) {
//        if (event.getEntity() instanceof  villager) {
//            // Воспроизводим звук, когда житель появляется в мире
//            villager.playSound(new ResourceLocation("yourmodid:custom_sound"), 1.0F, 1.0F);
//        }
//    }
//}

