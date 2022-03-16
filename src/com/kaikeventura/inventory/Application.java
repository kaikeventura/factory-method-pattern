package com.kaikeventura.inventory;

public class Application {

    public static void main(String[] args) {
        var desktopInventory = new DesktopInventory();
        var desktopCPU = desktopInventory.getHardware(HardwareType.CPU);
        var desktopRamMemory = desktopInventory.getHardware(HardwareType.RAM_MEMORY);
        System.out.println(desktopCPU);
        System.out.println(desktopRamMemory);

        var notebookInventory = new NotebookInventory();
        var notebookCPU = notebookInventory.getHardware(HardwareType.CPU);
        var notebookRamMemory = notebookInventory.getHardware(HardwareType.RAM_MEMORY);
        System.out.println(notebookCPU);
        System.out.println(notebookRamMemory);

        var smartphoneInventory = new SmartphoneInventory();
        var smartphoneCPU = smartphoneInventory.getHardware(HardwareType.CPU);
        var smartphoneRamMemory = smartphoneInventory.getHardware(HardwareType.RAM_MEMORY);
        System.out.println(smartphoneCPU);
        System.out.println(smartphoneRamMemory);
    }
}
