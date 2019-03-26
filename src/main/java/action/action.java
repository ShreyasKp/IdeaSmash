package action;

public class action {
    private String actionMessage;
    private double currentFood;
    private double predictedFood;
    private double currentTransport;
    private double predictedTransport;
    tag food = new tag(currentFood, predictedFood);
    tag transport = new tag(currentTransport, predictedTransport);

    public action(String actionMessage, double currentFood, double predictedFood, double currentTransport,
                  double predictedTransport) {
        this.actionMessage = actionMessage;
        this.currentFood = currentFood;
        this.predictedFood = predictedFood;
        this.currentTransport = currentTransport;
        this.predictedTransport = predictedTransport;
    }
}
