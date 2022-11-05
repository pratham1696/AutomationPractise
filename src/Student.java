public class Student {
    int age;
    int rollno;

    public void Display1()
    {
        System.out.println("Welcome");

    }

    public void Display2()
    {
        System.out.println("Automation");

    }

    public static void main(String[] args) {

        Student std = new Student();
        std.age = 23;
        std.rollno = 100;
        std.Display1();
        std.Display2();
        System.out.println(std.age);
        System.out.println(std.rollno);


    }
}