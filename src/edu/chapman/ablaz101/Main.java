package edu.chapman.ablaz101;

import edu.chapman.ablaz101.device.BiometricDevice;
import edu.chapman.ablaz101.device.type.DeviceType;
import edu.chapman.ablaz101.factory.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        // This is where the client would make new USB or Windows devices for Diabetes, Blood Pressure or Cholesterol

        // Create a factory for Windows devices
        AbstractFactory factory = AbstractFactory.getFactory(DeviceType.WINDOWS);

        // Create a diabetes device
        BiometricDevice device = factory.makeDiabetesDevice();

        // Ask the device to get a reading
        device.getReading();

        // Ask the device to display the reading
        device.updateView();
    }
}
