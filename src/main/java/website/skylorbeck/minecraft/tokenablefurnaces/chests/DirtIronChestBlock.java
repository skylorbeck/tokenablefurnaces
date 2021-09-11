package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestBlock;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestEntity;

import java.util.function.Supplier;

public class DirtIronChestBlock extends ExtraChestBlock {
    public DirtIronChestBlock(Settings settings, Supplier<BlockEntityType<? extends ExtraChestEntity>> supplier) {
        super(settings, supplier);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DirtIronChestEntity(pos, state);
    }
}