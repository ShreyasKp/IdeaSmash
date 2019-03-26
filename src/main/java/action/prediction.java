package action;

public class prediction {
    private double averageSavings;

    public prediction (double amount, int years) {
        this.amount = amount;
        this.years = years;
    }

    public String getMessage ()

    public String getPrediction (double amountFromUser, int yearsFromUser, String userName) {
        int timePeriod = yearsFromUser*12;
        double monthlySavings = amountFromUser/timePeriod;
        String message =
    }
}
