public class Cylinder implements Shape3D {
    
    private double r, h;
    
    public Cylinder() {
        this.r = 0;
        this.h = 0;
    }
    
    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
    
    public double getSurfaceArea() {
        return 2 * (Math.PI * Math.pow(r, 2) + (Math.PI * r * h));
    }
    
    public double getVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }
}