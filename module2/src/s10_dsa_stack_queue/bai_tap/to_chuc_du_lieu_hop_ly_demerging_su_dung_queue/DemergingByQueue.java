package s10_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;

import java.util.*;

public class DemergingByQueue {
    public static void main(String[] args) {
        //        THêm đối tượng vào ArrayList
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("Duong","Male","21/11/1999");
        Student student2 = new Student("Nguyen","Female","11/02/2000");
        Student student4 = new Student("Bao","Female","21/01/2000");
        Student student3 = new Student("Bao","Male","01/12/1998");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s.getDateOfBirth());
        }
//        Tạo 2 Queue nam nữ rồi kiểm tra, Male thì thêm vào queue male, female thêm vào female
//        Lấy từ 2 queue male và female rồi thêm vào queue Output rồi show ra
        Queue<Student> queueMale = new LinkedList<>();
        Queue<Student> queueFemale = new LinkedList<>();
        Queue<Student> queueOutput = new LinkedList<>();
        for (Student s : list){
            if (s.getGender().equals("Female")){
                queueFemale.add(s);
            } else {
                queueMale.add(s);
            }
        }
        for (Student s : queueFemale){
            queueOutput.add(s);
        }
        for (Student s : queueMale){
            queueOutput.add(s);
        }
        System.out.println("Sau khi sắp xếp");
        for (Student s : queueOutput){
            System.out.println(s.getName()+ " " + s.getGender()+" "+s.getDateOfBirth());
        }
    }
}
