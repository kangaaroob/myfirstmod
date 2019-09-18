package com.rob.myfirstmod.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
