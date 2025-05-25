package net.nikita.minemod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class ExampleBlock extends Block {
    public ExampleBlock() {
        super(Properties.of(Material.WOOD)
                .color(MaterialColor.STONE)
                .strength(3.0f, 6.0f)
                .requiresCorrectToolForDrops()
        );
    }
}

