package com.kaikeventura.inventory.implementation;

import com.kaikeventura.inventory.base.Hardware;
import com.kaikeventura.inventory.base.Inventory;
import com.kaikeventura.inventory.domain.HardwareType;
import com.kaikeventura.inventory.domain.NotebookHardware;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class NotebookInventory implements Inventory {

    private static final Map<HardwareType, Hardware> HARDWARE;

    static {
        HARDWARE = new EnumMap<>(HardwareType.class);
        Arrays.stream(HardwareType.values()).forEach(hardwareType -> HARDWARE.put(hardwareType, new NotebookHardware(hardwareType)));
    }

    @Override
    public Hardware getHardware(HardwareType hardwareType) {
        return HARDWARE.get(hardwareType);
    }
}
