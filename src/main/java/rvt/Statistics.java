package rvt;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        count++;
        sum = sum + number;
    }

    public int getCount() {
        return count;
    }
    public int sum() {
        return sum;
    }

    public double average() {
        double ave = (double) sum / count;
        return ave;
    }
}
