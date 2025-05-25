package net.nikita.minemod.blocks;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.nikita.minemod.MineMod;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MineMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineMod.MOD_ID);

    // Регистрация тестового блока (деревянный тип)
    public static final RegistryObject<Block> NEW_WOOD = BLOCKS.register("newwood",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)));

    // Регистрация предмета для блока
    public static final RegistryObject<Item> NEW_WOOD_ITEM = ITEMS.register("newwood1",
            () -> new BlockItem(NEW_WOOD.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static void reg(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus); // Не забываем зарегистрировать предметы
    }
}