package com.example.registry;

import com.stupidcoderx.modding.element.block.BlockDef;
import com.stupidcoderx.modding.element.item.ItemDef;

public class ModBlocks {
    public static final BlockDef<?> EXAMPLE_BLOCK;

    static {
        ItemDef.pushTab(ModCreativeTabs.MAIN);
        EXAMPLE_BLOCK = BlockDef.cubeAll("example_block", "示例方块");
        ItemDef.popTab();
    }

    public static void build() {
    }
}
