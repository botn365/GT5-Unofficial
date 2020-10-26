package gregtech.loaders.postload;

import cpw.mods.fml.common.Loader;
import gregtech.api.enums.GT_Values;
import gregtech.api.util.GT_ModHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.GT_Values.MOD_ID_FR;

public class Costom_Recipes {
    public static void run()
    {
        if (Loader.isModLoaded(MOD_ID_FR) && Loader.isModLoaded("ExtraBees"))
        {
            GT_Values.RA.addSifterRecipe(GT_ModHandler.getModItem("ExtraBees","honeyComb",1,2),new ItemStack[]{new ItemStack(Items.bone,4)},new int[10000],320,30720);
        }
    }
}
