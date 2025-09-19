package Unit3;

import java.util.ArrayList;
import java.util.Collections;
public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(20,"Abhi",100));
        al.add(new Student(21,"Rahul",101));
        al.add(new Student(22,"Ravi",102));
        al.add(new Student(23,"Raju",103));
        al.add(new Student(19,"Alakh",104));
        al.add(new Student(30,"Nikhil",105));
        Collections.sort(al);
        for(Student st: al)
        {
            System.out.println("NAme "+st.name+"Age "+st.age+"Roll "+st.roll_no);
        }
    }
}
