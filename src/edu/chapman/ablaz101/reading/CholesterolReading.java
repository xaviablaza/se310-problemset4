package edu.chapman.ablaz101.reading;

/**
 * Created by Xavi on 11/18/2017.
 */
public class CholesterolReading extends Reading {
    private LDLReading ldl;
    private VLDLReading vldl;
    public CholesterolReading(LDLReading ldl, VLDLReading vldl) {
        this.ldl = ldl;
        this.vldl = vldl;
    }
}
