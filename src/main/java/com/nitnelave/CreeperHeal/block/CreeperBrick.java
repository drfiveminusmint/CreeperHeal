package com.nitnelave.CreeperHeal.block;

import org.bukkit.block.BlockState;

import com.nitnelave.CreeperHeal.config.CfgVal;
import com.nitnelave.CreeperHeal.config.CreeperConfig;

class CreeperBrick extends CreeperBlock
{

    CreeperBrick(BlockState blockState)
    {
        super(blockState);

        if (CreeperConfig.getBool(CfgVal.CRACK_DESTROYED_BRICKS) && blockState.getRawData() == (byte) 0)
            blockState.setRawData((byte) 2);
    }

}
