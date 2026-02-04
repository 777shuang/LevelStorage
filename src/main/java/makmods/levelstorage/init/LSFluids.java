package makmods.levelstorage.init;

import net.minecraftforge.fluids.FluidRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import makmods.levelstorage.fluid.BlockFluidIV;
import makmods.levelstorage.fluid.FluidIV;

public class LSFluids {

    public static LSFluids instance = new LSFluids();
    public FluidIV fluidIV;
    public BlockFluidIV blockFluidIV;

    private LSFluids() {
        ;
    }

    public void init() {
        this.fluidIV = new FluidIV();
        FluidRegistry.registerFluid(this.fluidIV);
        this.blockFluidIV = new BlockFluidIV();
        GameRegistry.registerBlock(this.blockFluidIV, "fluidIV");
    }
}
