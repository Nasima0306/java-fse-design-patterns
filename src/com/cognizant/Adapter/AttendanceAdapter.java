package com.cognizant.Adapter;

public class AttendanceAdapter implements AttendanceSystem{
    Biometric biometric;

    public AttendanceAdapter(Biometric biometric){
        this.biometric=biometric;
    }

    @Override
    public void markattendance() {
        biometric.scanfingerprint();
    }
}
