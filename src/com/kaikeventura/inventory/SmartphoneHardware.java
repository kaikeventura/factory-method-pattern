package com.kaikeventura.inventory;

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
