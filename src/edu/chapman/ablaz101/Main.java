package edu.chapman.ablaz101;

import edu.chapman.ablaz101.device.BiometricDevice;
import edu.chapman.ablaz101.device.type.DeviceType;
import edu.chapman.ablaz101.factory.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        // This is where the client would make new USB or Windows devices for Diabetes, Blood Pressure or Cholesterol

        // Create a factory for Windows devices
        AbstractFactory winDeviceFactory = AbstractFactory.getFactory(DeviceType.WINDOWS);

        // Create a factory for USB devices
        AbstractFactory usbDeviceFactory = AbstractFactory.getFactory(DeviceType.USB);

        // Create a diabetes device for Windows
        BiometricDevice device = winDeviceFactory.makeDiabetesDevice();

        // Ask the device to get a reading
        device.getReading();

        // Ask the device to display the reading
        device.updateView();

        // Create a cholesterol device for USB
        BiometricDevice device2 = usbDeviceFactory.makeCholesterolDevice();

        // Ask the device to get a reading
        device2.getReading();

        // Ask the device to display the reading
        device2.updateView();
    }
}
