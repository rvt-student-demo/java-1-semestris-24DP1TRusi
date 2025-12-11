package rvt;

public class Students extends Person {
    public int credits;

    public Students(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int credits() {
        return credits;
    }
    public void study() {
        this.credits++;
    }
    @Override
    public String toString() {
        return name + "\n\t" + address + "\n\tStudy credits " + credits;
    }
}
