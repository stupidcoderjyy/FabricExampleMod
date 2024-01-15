package com.example.core;

import com.example.registry.ModBlocks;
import com.example.registry.ModCreativeTabs;
import com.stupidcoderx.modding.core.Mod;
import com.stupidcoderx.modding.element.item.ItemDef;

public class ExampleMod extends Mod {
    public static final String MOD_ID = "example";

    protected ExampleMod() {
        super(MOD_ID);
    }

    @Override
    protected void buildElements() {
        ItemDef.pushTab(ModCreativeTabs.MAIN);
        ModBlocks.build();
    }
}
