package website.skylorbeck.minecraft.tokenablefurnaces.chests.trapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

public class ChristmasTrappedChestEntity extends ExtraChestEntity {
    protected ChristmasTrappedChestEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState,27,"christmas",true, Ref.MODID);
    }

    public ChristmasTrappedChestEntity(BlockPos pos, BlockState state) {
        super(Declarer.CHRISTMASTRAPPEDCHESTENTITY,pos, state,27,"christmas",true, Ref.MODID);
    }

    protected Text getContainerName() {
        return new TranslatableText("container.festivechest");
    }
    protected Text getDoubleContainerName(){
        return new TranslatableText("container.festivechestdouble");
    }
}
