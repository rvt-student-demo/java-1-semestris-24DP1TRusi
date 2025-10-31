package rvt;
//custom data type
//referende type
public class Student {
    //name fieldam ir piekļuva tikai pašai Student klasei
    //private String name;

    //default: publid
    String name;
    int age;
    public final String filename = "student.txt";

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void introduce() {
        System.out.println("Student: " + name + ", age: " + age);
    }
}
