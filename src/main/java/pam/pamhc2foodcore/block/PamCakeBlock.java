package pam.pamhc2foodcore.block;

import net.minecraft.block.Block;
import net.minecraft.block.CakeBlock;

public class PamCakeBlock extends CakeBlock {

    public PamCakeBlock(Block.Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(BITES, 0));
    }
}