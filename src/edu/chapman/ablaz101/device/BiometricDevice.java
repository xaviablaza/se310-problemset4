package edu.chapman.ablaz101.device;

import edu.chapman.ablaz101.reading.Reading;

/**
 * Created by Xavi on 11/18/2017.
 */
public class BiometricDevice {
    BD_Impl impl;
    BiometricDevice(){}
    public Reading getReading() {
        return impl.getReading(this);
    }
    public void updateView() {
        impl.updateView();
    }
}
