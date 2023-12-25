package com.example.core;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ExampleClient extends ExampleMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
    }
}
