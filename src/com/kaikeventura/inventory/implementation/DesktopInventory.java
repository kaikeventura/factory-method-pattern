package com.kaikeventura.inventory.implementation;

import com.kaikeventura.inventory.base.Hardware;
import com.kaikeventura.inventory.base.Inventory;
import com.kaikeventura.inventory.domain.DesktopHardware;
import com.kaikeventura.inventory.domain.HardwareType;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class DesktopInventory implements Inventory {

    private static final Map<HardwareType, Hardware> HARDWARE;

    static {
        HARDWARE = new EnumMap<>(HardwareType.class);
        Arrays.stream(HardwareType.values()).forEach(hardwareType -> HARDWARE.put(hardwareType, new DesktopHardware(hardwareType)));
    }

    @Override
    public Hardware getHardware(HardwareType hardwareType) {
        return HARDWARE.get(hardwareType);
    }
}
