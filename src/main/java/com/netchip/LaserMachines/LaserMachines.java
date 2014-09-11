package com.netchip.LaserMachines;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import com.netchip.LaserMachines.utils.Constants;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = Constants.MODID, version = Constants.VERSION)
public class LaserMachines {
    public static final SimpleNetworkWrapper networkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Constants.MODID);
    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
