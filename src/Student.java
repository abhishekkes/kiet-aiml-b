public class Student
{
    private String grade;
    public int roll_no;
    public String name;
    public Student(String grade, int roll_no, String name) {
        this.grade = grade;
        this.roll_no = roll_no;
        this.name = name;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}