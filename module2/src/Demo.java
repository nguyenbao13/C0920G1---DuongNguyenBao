public class Demo {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    Demo(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }
    public static void main(String[] args) {
        Demo s1 = new Demo(111, "Thông");
        Demo s2 = new Demo(222, "Minh");

        s1.display();
        s2.display();
    }
}
