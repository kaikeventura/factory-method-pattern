package com.kaikeventura.inventory.domain;

import com.kaikeventura.inventory.base.Hardware;

public class NotebookHardware implements Hardware {

    private final HardwareType hardwareType;

    public NotebookHardware(HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }

    @Override
    public HardwareType getHardwareType() {
        return hardwareType;
    }

    @Override
    public String toString() {
        return "NotebookHardware{" +
                "hardwareType=" + hardwareType +
                '}';
    }
}
