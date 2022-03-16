package com.kaikeventura.inventory.base;

import com.kaikeventura.inventory.domain.HardwareType;

public interface Inventory {
    Hardware getHardware(HardwareType hardwareType);
}
