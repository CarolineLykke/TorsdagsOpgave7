package Opgave2;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class Cirkel {
    private double radius;

    public void cirkel(float radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if  (radius > 0) {
            this.radius = Math.PI * (radius * radius);
        }
         else {
             throw new IllegalArgumentException("Det en ommer, radius kan ikke være negativ");
        }
    }

    public double getRadius() {
        return radius;
    }
}
