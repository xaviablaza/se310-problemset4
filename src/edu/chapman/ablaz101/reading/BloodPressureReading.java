package edu.chapman.ablaz101.reading;

/**
 * Created by Xavi on 11/18/2017.
 */
public class BloodPressureReading extends Reading {
    DiastolicReading diastolic;
    SystolicReading systolic;
    public BloodPressureReading(DiastolicReading diastolic, SystolicReading systolic) {
        this.diastolic = diastolic;
        this.systolic = systolic;
    }
}
