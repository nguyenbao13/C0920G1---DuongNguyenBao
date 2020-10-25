package s4_lop_va_doi_tuong_trong_java.bai_tap.lop_fan;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public static int getSLOW() {
        return SLOW;
    }
    public static int getMEDIUM() {
        return MEDIUM;
    }
    public static int getFAST() {
        return FAST;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    Fan() {
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" +
                    "speed = " + speed +
                    ", color = " + color +
                    ", radius = " + radius +
                    ", fan is on}";
        } else {
            return "Fan{" +
                    "speed = " + speed +
                    ", color = " + color +
                    ", radius = " + radius +
                    ", fan is off}";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed = FAST;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.on = true;
        Fan fan2 = new Fan();
        fan2.speed = MEDIUM;
        fan2.radius = 5;
        fan2.color = "blue";
        fan2.on = false;
        System.out.printf("Fan1: " + fan1.toString() + "\n");
        System.out.printf("Fan2: " + fan2.toString());
    }
}
