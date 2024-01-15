package com.example.registry;

import com.stupidcoderx.modding.element.block.BlockDef;

public class ModBlocks {
    public static final BlockDef<?> EXAMPLE_BLOCK;

    static {
        EXAMPLE_BLOCK = BlockDef.cubeAll("example_block", "示例方块");
    }

    public static void build() {
    }
}
