package edu.chapman.ablaz101.factory;

import edu.chapman.ablaz101.device.BiometricDevice;
import edu.chapman.ablaz101.device.type.DeviceType;

/**
 * Created by Xavi on 11/18/2017.
 */
public abstract class AbstractFactory {
    private static final USBDeviceFactory USB_DEVICE_FACTORY = new USBDeviceFactory();
    private static final WindowsDeviceFactory WINDOWS_DEVICE_FACTORY = new WindowsDeviceFactory();

    public static AbstractFactory getFactory(DeviceType deviceType) {
        AbstractFactory factory = null;
        switch (deviceType) {
            case USB:
                factory = USB_DEVICE_FACTORY;
                break;
            case WINDOWS:
                factory = WINDOWS_DEVICE_FACTORY;
                break;
        }
        return factory;
    }

    public abstract BiometricDevice makeDiabetesDevice();
    public abstract BiometricDevice makeCholesterolDevice();
    public abstract BiometricDevice makeBloodPressureDevice();
}
