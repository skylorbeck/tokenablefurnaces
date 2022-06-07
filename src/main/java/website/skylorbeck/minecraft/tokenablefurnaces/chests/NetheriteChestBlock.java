package website.skylorbeck.minecraft.tokenablefurnaces.chests;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
import website.skylorbeck.minecraft.skylorlib.storage.ExtraChestBlock;

import java.util.List;
import java.util.function.Supplier;

public class NetheriteChestBlock extends ExtraChestBlock {
    public NetheriteChestBlock(Settings settings, Supplier<BlockEntityType<? extends ChestBlockEntity>> supplier) {
        super(settings, supplier);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new NetheriteChestEntity(pos, state);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.of("4 Double Chests"));
        tooltip.add(Text.of("Blast Resistant"));
        tooltip.add(Text.of("Lava/fireproof"));
        super.appendTooltip(stack, world, tooltip, options);
    }
}
