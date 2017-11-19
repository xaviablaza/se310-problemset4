package edu.chapman.ablaz101.device.type;

import edu.chapman.ablaz101.device.*;
import edu.chapman.ablaz101.reading.*;

/**
 * Created by Xavi on 11/18/2017.
 */
public class USB implements BD_Impl {

    @Override
    public Reading getReading(BiometricDevice device) {
        // TODO: Implementation for getting data from a USB device is written here
        // This could be written to interface with RS-232

        if (device instanceof DiabetesDevice) {

            // Implementation for getting data from diabetes device
            return new GlucoseReading("5.0","mmol/L");

        } else if (device instanceof CholesterolDevice) {

            // Implementation for getting data from cholesterol device
            return new CholesterolReading(new LDLReading("500","mL"),new VLDLReading("500","mL"));

        } else if (device instanceof BloodPressureDevice) {

            // Implementation for getting data from a blood pressure device
            return new BloodPressureReading(new DiastolicReading("400","mL"),new SystolicReading("500","mL"));

        }
        return null;
    }

    @Override
    public void updateView() {
        // Code would be written here to update the reading on the device's view
    }
}
