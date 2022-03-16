package com.kaikeventura.inventory.domain;

import com.kaikeventura.inventory.base.Hardware;

public class SmartphoneHardware implements Hardware {

    private final HardwareType hardwareType;

    public SmartphoneHardware(HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }

    @Override
    public HardwareType getHardwareType() {
        return hardwareType;
    }

    @Override
    public String toString() {
        return "SmartphoneHardware{" +
                "hardwareType=" + hardwareType +
                '}';
    }
}
