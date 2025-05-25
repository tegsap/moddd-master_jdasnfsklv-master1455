//package net.nikita.minemod.item;
//
//import net.minecraft.world.item.CreativeModeTab;
//import net.minecraft.world.item.Item;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//import net.nikita.minemod.MineMod;
//
//public class ModItems1 {
//    public static final DeferredRegister<Item> ITEMS =
//            DeferredRegister.create(ForgeRegistries.ITEMS, MineMod.MOD_ID);
//
//    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
//
//    public static final RegistryObject<Item> MANDARINTREE_SPLING = ITEMS.register("mandarintree_spling",
//            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
//}
