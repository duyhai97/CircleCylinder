public class Cylinder extends Circle{
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;
    public Cylinder(double radius, String color) {
        super(radius, color);
    }
    public double getV(){
        return getAria()*getHeight();
    }

    @Override
    public String toString() {
        return super.toString() + " chieu cao la: " + getHeight();
    }

    public static void main(String[] args) {
        Cylinder a = new Cylinder(10, "red", 10);
        System.out.println(a.toString());
        System.out.println(a.getV());
    }
}
