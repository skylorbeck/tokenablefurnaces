package website.skylorbeck.minecraft.tokenablefurnaces;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold.GoldExtraBlastEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold.GoldExtraFurnaceEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.gold.GoldExtraSmokerEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraBlastEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraFurnaceEntity;
import website.skylorbeck.minecraft.tokenablefurnaces.furnaces.iron.IronExtraSmokerEntity;

public class Registrar {
    public static void register() {
        Declarer.IRONBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironblast",
                FabricBlockEntityTypeBuilder.create(IronExtraBlastEntity::new,
                        Declarer.ironBlastBlock
                ).build(null));
        Declarer.IRONSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironsmoker",
                FabricBlockEntityTypeBuilder.create(IronExtraSmokerEntity::new,
                        Declarer.ironSmokerBlock
                ).build(null));

        Declarer.IRONFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":ironfurnace",
                FabricBlockEntityTypeBuilder.create(IronExtraFurnaceEntity::new,
                        Declarer.ironFurnaceBlock
                ).build(null));

        Declarer.GOLDBLASTENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldblast",
                FabricBlockEntityTypeBuilder.create(GoldExtraBlastEntity::new,
                        Declarer.goldBlastBlock
                ).build(null));
        Declarer.GOLDSMOKERENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldsmoker",
                FabricBlockEntityTypeBuilder.create(GoldExtraSmokerEntity::new,
                        Declarer.goldSmokerBlock
                ).build(null));

        Declarer.GOLDFURNACEENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                Ref.MODID + ":goldfurnace",
                FabricBlockEntityTypeBuilder.create(GoldExtraFurnaceEntity::new,
                        Declarer.goldFurnaceBlock
                ).build(null));

        regBlock("ironfurnace", Declarer.ironFurnaceBlock);
        regItem("ironfurnaceitem", Declarer.ironFurnace);
        regBlock("ironblast", Declarer.ironBlastBlock);
        regItem("ironblastitem", Declarer.ironBlast);
        regBlock("ironsmoker", Declarer.ironSmokerBlock);
        regItem("ironsmokeritem", Declarer.ironSmoker);

        regBlock("goldfurnace", Declarer.goldFurnaceBlock);
        regItem("goldfurnaceitem", Declarer.goldFurnace);
        regBlock("goldblast", Declarer.goldBlastBlock);
        regItem("goldblastitem", Declarer.goldBlast);
        regBlock("goldsmoker", Declarer.goldSmokerBlock);
        regItem("goldsmokeritem", Declarer.goldSmoker);
    }

    public static void regItem(String name, Item itemid) {
        Registry.register(Registry.ITEM, new Identifier(Ref.MODID, name), itemid);
    }

    public static void regBlock(String name, Block blockid) {
        Registry.register(Registry.BLOCK, new Identifier(Ref.MODID, name), blockid);
    }
}
