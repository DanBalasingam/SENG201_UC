package labTestV2;

import java.lang.Math;

public class Vector3 {

    private double x;
    private double y;
    private double z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public Vector3 normalize() {
        double length = length();
        return new Vector3(x / length, y / length, z / length);
    }

    public String getDescription() {
        return String.format("Vector3(x: %s, y: %s, z: %s), length=%.2f", x, y, z, length());
    }
}
