package model;

public class Goal {

    private double amount;
    private int year;

    public Goal(){};

    public Goal(double amount, int year) {
        this.amount = amount;
        this.year = year;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Amount: " + amount + "\n Year: " + year;
    }
}
