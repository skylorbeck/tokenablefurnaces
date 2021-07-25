package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;

public class DiamondChestEntity extends ExtraChestEntity{
    protected DiamondChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public DiamondChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.DIAMONDCHESTENTITY,pos, state);
        this.inventory = DefaultedList.ofSize(12*15, ItemStack.EMPTY);
    }
    @Override
    public int size() {
        return 12*15;
    }
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new DiamondScreenHandler(syncId, playerInventory, this,12,15);
    }
}