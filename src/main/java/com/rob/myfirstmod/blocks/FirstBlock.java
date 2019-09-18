package com.rob.myfirstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FirstBlock extends Block {
    public FirstBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.ANVIL)
                .hardnessAndResistance(2.0f)
                .lightValue(5));
        setRegistryName("firstblock");
    }
}
