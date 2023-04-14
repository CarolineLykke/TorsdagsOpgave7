package Opgave2;

public class Cirkel {
    private int radius;

    public void cirkel(int radius) {
        this.radius = radius;
    }

    public double areal(int radius) {
        if (radius < 0) {
            System.out.println("Det en ommer, radius kan ikke være negativ");
            return 0;
        } else if (radius > 0) {
            return 3.1415 * (radius * radius);
        }
        return 1;
    }
}
