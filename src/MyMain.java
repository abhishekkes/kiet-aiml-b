public class MyMain {
    public static void main(String[] args) {
        Student s1=new Student(12,"Abhishek");
        Student s2=s1;
        s1.display();
        s1.name="Alok";
        s2.display();
    }
}
