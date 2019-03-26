package action;

public class prediction {
    private String predictionMessage;
    MaryDetails mary = new MaryDetails();
    JohnDetails john = new JohnDetails();
    action newAction = new action();

    public String getPrediction (double amountFromUser, int yearsFromUser, String userName) {
        int timePeriod = yearsFromUser*12;
        double monthlySavings = amountFromUser/timePeriod;
        if(userName.equals("Mary") || userName.equals("mary")) {
            double savings = mary.getAvgMonthlyIncome() - mary.getAvgMonthlyExpenditure();
            if ((monthlySavings - savings) <= 0) {
                predictionMessage = "You are on track for reaching your goals!\n";
            }
            else if ((monthlySavings - savings - savings*0.2) <= 0) {
                double extra = (monthlySavings - savings);
                double currentFood = mary.getAvgMonthlyFood();
                double predictedFood = currentFood - (extra*0.7);
                double currentTransport = mary.getAvgMonthlyTransport();
                double predictedTransport = currentTransport - (extra*0.3);
                predictionMessage = newAction.getActionMessageFood(currentFood, predictedFood) + newAction.getActionMessageTransport(currentTransport, predictedTransport);
            }
            else {
                predictionMessage = "You might not be able to save enough to meet your goals. Try to reasses your financial goals\n";
            }
        }
        else if (userName.equals("John") || userName.equals("john")) {
            double savings = john.getAvgMonthlyIncome() - john.getAvgMonthlyExpenditure();
            if ((monthlySavings - savings) <= 0) {
                predictionMessage = "You are on track for reaching your goals!\n";
            }
            else if ((monthlySavings - savings - savings*0.2) <= 0) {
                double extra = (monthlySavings - savings);
                double currentFood = john.getAvgMonthlyFood();
                double predictedFood = currentFood - (extra*0.7);
                double currentTransport = john.getAvgMonthlyTransport();
                double predictedTransport = currentTransport - (extra*0.3);
                predictionMessage = newAction.getActionMessageFood(currentFood, predictedFood) + newAction.getActionMessageTransport(currentTransport, predictedTransport);
            }
            else {
                predictionMessage = "You might not be able to save enough to meet your goals. Try to reasses your financial goals\n";
            }
        }
        return predictionMessage;
    }
}
