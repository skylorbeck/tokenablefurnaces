package website.skylorbeck.minecraft.tokenablefurnaces.furnaces.amethyst;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.BlastFurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import website.skylorbeck.minecraft.skylorlib.furnaces.AbstractExtraFurnaceBlockEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.Ref;

public class AmethystExtraBlastEntity extends AbstractExtraFurnaceBlockEntity {
    public AmethystExtraBlastEntity(BlockPos pos, BlockState state) {
        super(Declarer.AMETHYSTBLASTENTITY,pos,state,RecipeType.BLASTING,0.2f);
    }
    public static <T extends BlockEntity> void tick(World world, BlockPos blockPos, BlockState state, T t) {
        AbstractExtraFurnaceBlockEntity.tick(world,blockPos,state, (AbstractExtraFurnaceBlockEntity) t);
    }
    protected int getFuelTime(ItemStack fuel) {
        if (Ref.furnaceEfficiency) {
            return super.getFuelTime(fuel) / 2;
        } else {
            return (int) (super.getFuelTime(fuel) * this.getMultiplier()) / 2;
        }
    }
    @Override
    public Text getContainerName() {
        return Text.translatable("container.blast_furnace");
    }
    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new BlastFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
