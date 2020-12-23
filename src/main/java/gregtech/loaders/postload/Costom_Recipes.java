package gregtech.loaders.postload;

import cpw.mods.fml.common.Loader;
import gregtech.api.enums.GT_Values;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.enums.GT_Values.MOD_ID_FR;

public class Costom_Recipes {
    public static void run()
    {
        if (Loader.isModLoaded(MOD_ID_FR) && Loader.isModLoaded("ExtraBees"))
        {
            GT_Values.RA.addSifterRecipe(GT_ModHandler.getModItem("ExtraBees","honeyComb",1,2),new ItemStack[]{new ItemStack(Items.bone,4)},new int[10000],320,30720);
            FluidStack tMoltenEnderium = new FluidStack(FluidRegistry.getFluid("molten.enderium"),1);
            GT_Values.RA.addAutoclaveRecipe(GT_ModHandler.getModItem("Forestry","craftingMaterial",1,1),tMoltenEnderium,new ItemStack(Items.ender_pearl,1),10000,60,61440);
        }
        FluidStack tMoltenEnderium = new FluidStack(FluidRegistry.getFluid("molten.enderium"),18);
        GT_Values.RA.addAutoclaveRecipe(GT_ModHandler.getModItem("Forestry","craftingMaterial",1,1),tMoltenEnderium,new ItemStack(Items.ender_pearl,1),10000,1200,61440);
    }
}
