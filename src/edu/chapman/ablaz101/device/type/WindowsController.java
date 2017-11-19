package edu.chapman.ablaz101.device.type;

import edu.chapman.ablaz101.device.*;
import edu.chapman.ablaz101.reading.*;

/**
 * Created by Xavi on 11/18/2017.
 */
public class WindowsController implements BD_Impl {
    WindowsUI view = new WindowsUI();
    private Reading lastReading;
    @Override
    public Reading getReading(BiometricDevice device) {
        // TODO: Implementation for getting data from a Windows device is written here
        // This could be written to interface with a WinForms app

        if (device instanceof DiabetesDevice) {

            // Implementation for getting data from diabetes device
            lastReading = new GlucoseReading("5.0","mmol/L");
            return lastReading;

        } else if (device instanceof CholesterolDevice) {

            // Implementation for getting data from cholesterol device
            lastReading = new CholesterolReading(new LDLReading("500","mL"),new VLDLReading("500","mL"));
            return lastReading;

        } else if (device instanceof BloodPressureDevice) {

            // Implementation for getting data from a blood pressure device
            lastReading = new BloodPressureReading(new DiastolicReading("400","mL"),new SystolicReading("500","mL"));
            return lastReading;
        }
        return null;
    }

    @Override
    public void updateView() {
        view.printReading(lastReading);
    }
}
