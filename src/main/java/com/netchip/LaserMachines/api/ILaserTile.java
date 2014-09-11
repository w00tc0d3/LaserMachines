package com.netchip.LaserMachines.api;

public interface ILaserTile {
    public boolean needsPower();
    public float transferPower(int amountPower);
}
