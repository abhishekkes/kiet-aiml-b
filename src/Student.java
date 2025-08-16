public class Student {
    int roll_no;
    String name;
    Student()
    {
        System.out.println("I am default Const");
    }
    Student(int r,String n)
    {
        roll_no=r;
        name=n;
    }
    public void display()
    {
        System.out.println("Roll No"+roll_no);
        System.out.println("Name is "+name);
    }
}
