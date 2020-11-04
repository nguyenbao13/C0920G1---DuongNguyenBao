package s9_dsa_danh_sach.bai_tap.arraylist_theo_thu_vien_java_util_arraylist;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Duong");
        Student b = new Student(2, "Nguyen");
        Student c = new Student(3, "Bao");
        Student d = new Student(4, "Haha");
        Student e = new Student(5, "Hoho");
        Student f = new Student(6, "Hihi");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newStudentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        studentMyList.add(3, f);

        System.out.println(studentMyList.size());
        System.out.println(studentMyList.get(2).getName());
        System.out.println(studentMyList.indexOf(d));
        System.out.println(studentMyList.contains(b));
        System.out.println(studentMyList.remove(5));

        newStudentMyList = studentMyList.clone();
        for(int i = 0; i < newStudentMyList.size(); i++) {
            System.out.println(newStudentMyList.get(i).getName());
        }
    }
}
