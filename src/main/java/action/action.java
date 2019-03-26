package action;

public class action {
    private String actionMessage;
    private double currentFood;
    private double predictedFood;
    private double currentTransport;
    private double predictedTransport;

    public String getActionMessageFood(double currentFood, double predictedFood) {
        actionMessage = "You need to save " + (predictedFood - currentFood) + " on Food and Beverages monthly\n" + "Eating out less and cooking more at home can help you achieve your future goals!\n";
        return actionMessage;
    }

    public String getActionMessageTransport(double currentTransport, double predictedTransport) {
        actionMessage = "You need to save " + (predictedTransport - currentTransport) + " on Transport monthly\n" + "Using public transport like MRT and buses can help you achieve your future goals!\n";
        return actionMessage;
    }

}
