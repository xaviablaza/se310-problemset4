package edu.chapman.ablaz101.device;

import edu.chapman.ablaz101.device.BiometricDevice;
import edu.chapman.ablaz101.reading.Reading;

/**
 * Created by Xavi on 11/18/2017.
 */
public interface BD_Impl {
    public Reading getReading(BiometricDevice device);
    public void updateView();
}
