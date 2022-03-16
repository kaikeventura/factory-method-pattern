package com.kaikeventura.inventory;

public class DesktopHardware implements Hardware {

    private final HardwareType hardwareType;

    public DesktopHardware(HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }

    @Override
    public HardwareType getHardwareType() {
        return hardwareType;
    }

    @Override
    public String toString() {
        return "DesktopHardware{" +
                "hardwareType=" + hardwareType +
                '}';
    }
}
