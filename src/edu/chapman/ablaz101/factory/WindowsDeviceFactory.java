package edu.chapman.ablaz101.factory;

import edu.chapman.ablaz101.device.BloodPressureDevice;
import edu.chapman.ablaz101.device.CholesterolDevice;
import edu.chapman.ablaz101.device.DiabetesDevice;
import edu.chapman.ablaz101.device.type.WindowsController;

/**
 * Created by Xavi on 11/18/2017.
 */
public class WindowsDeviceFactory extends AbstractFactory {

    @Override
    public DiabetesDevice makeDiabetesDevice() {
        return new DiabetesDevice(new WindowsController());
    }

    @Override
    public CholesterolDevice makeCholesterolDevice() {
        return new CholesterolDevice(new WindowsController());
    }

    @Override
    public BloodPressureDevice makeBloodPressureDevice() {
        return new BloodPressureDevice(new WindowsController());
    }
}
