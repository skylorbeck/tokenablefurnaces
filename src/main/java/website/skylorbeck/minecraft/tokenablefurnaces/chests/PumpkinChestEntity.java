package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

public class PumpkinChestEntity extends ExtraChestEntity {
    protected PumpkinChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,27,"pumpkin",false, Ref.MODID);
    }

    public PumpkinChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.PUMPKINCHESTENTITY,pos, state,27,"pumpkin",false, Ref.MODID);
    }
    protected Text getContainerName() {
        return new TranslatableText("container.pumpkinchest");
    }
    protected Text getDoubleContainerName(){
        return new TranslatableText("container.pumpkinchestdouble");
    }
}
