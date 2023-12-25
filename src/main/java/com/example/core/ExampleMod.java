package com.example.core;

import com.example.registry.ModBlocks;
import com.stupidcoderx.modding.core.Mod;

public class ExampleMod extends Mod {
    public static final String MOD_ID = "example";

    protected ExampleMod() {
        super(MOD_ID);
    }

    @Override
    protected void buildElements() {
        ModBlocks.build();
    }
}
