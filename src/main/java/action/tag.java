package action;

public class tag {
    private double currentExpenditure;
    private double predictedExpenditure;

    public tag(double currentExpenditure, double predictedExpenditure) {
        this.currentExpenditure = currentExpenditure;
        this.predictedExpenditure = predictedExpenditure;
    }

    public double getCurrentExpenditure() {
        return currentExpenditure;
    }

    public double getPredictedExpenditure() {
        return predictedExpenditure;
    }
}
