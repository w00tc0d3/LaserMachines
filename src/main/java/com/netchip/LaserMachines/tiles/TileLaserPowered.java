package com.netchip.LaserMachines.tiles;

import cofh.api.energy.EnergyStorage;
import com.netchip.LaserMachines.api.ILaserTile;
import net.minecraft.item.ItemStack;

public class TileLaserPowered extends TileBase implements ILaserTile {
    EnergyStorage es = null;

    public TileLaserPowered(String invName, int slots, int maxRFStorage) {
        super(invName, slots);
        es = new EnergyStorage(maxRFStorage);
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
        return new int[0];
    }

    @Override
    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return false;
    }

    @Override
    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        return false;
    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }

    @Override
    public boolean needsPower() {
        return es.getEnergyStored() != es.getMaxEnergyStored();
    }

    @Override
    public float transferPower(int amountPower) {
        return amountPower - es.receiveEnergy(amountPower, false);
    }
}
