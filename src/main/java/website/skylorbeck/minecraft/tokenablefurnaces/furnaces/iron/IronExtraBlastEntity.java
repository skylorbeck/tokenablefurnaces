package website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.BlastFurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import website.skylorbeck.minecraft.tokenablefurnaces.Declarer;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.core.AbstractExtraFurnaceBlockEntity;

public class IronExtraBlastEntity extends AbstractExtraFurnaceBlockEntity {
    public IronExtraBlastEntity(BlockPos pos, BlockState state) {
        super(Declarer.IRONBLASTENTITY,pos,state,RecipeType.BLASTING);
    }
    public static <T extends BlockEntity> void tick(World world, BlockPos blockPos, BlockState state, T t) {
        AbstractExtraFurnaceBlockEntity.tick(world,blockPos,state, (AbstractExtraFurnaceBlockEntity) t);
    }
    protected int getFuelTime(ItemStack fuel) {
        return (int) (super.getFuelTime(fuel)*0.8)/2;
    }

    @Override
    public Text getContainerName() {
        return new TranslatableText("container.blast_furnace");
    }
    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new BlastFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
