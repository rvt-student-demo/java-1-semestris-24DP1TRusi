package rvt;

public class Teacher extends Person{
    public int salary;

    public Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;

    }

    @Override
    public String toString() {
        return name + "\n\t" + address + "\n\tsalary " + salary + " euro/month";
    }
}
