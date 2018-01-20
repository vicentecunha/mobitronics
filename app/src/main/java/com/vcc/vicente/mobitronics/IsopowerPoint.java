package com.vcc.vicente.mobitronics;

public class IsopowerPoint {
    int time;
    int intensity;

    public IsopowerPoint(int time, int intensity) {
        this.time = time;
        this.intensity = intensity;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
}
