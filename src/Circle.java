public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getAria(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Ban kinh la: " + getRadius() + " mau sac la: " + getColor();
    }

    public static void main(String[] args) {
        Circle a = new Circle(5.0, "red");
        System.out.println(a.getAria());
        System.out.println(a.toString());
    }
}
