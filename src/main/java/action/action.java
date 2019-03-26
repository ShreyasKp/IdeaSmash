package action;

public class action {
    private String actionMessage;
    private double currentFood;
    private double predictedFood;
    private double currentTransport;
    private double predictedTransport;
    private double currentDining;
    private double predictedDining;
    private double currentShopping;
    private double predictedShopping;
    private double currentPublicTransport;
    private double predictedPublicTransport;
    private double currentPrivateTransport;
    private double predictedPrivateTransport;

    public action(String actionMessage, double currentFood, double predictedFood,
                  double currentTransport, double predictedTransport, double currentDining, double predictedDining,
                  double currentShopping, double predictedShopping, double currentPublicTransport, double predictedPublicTransport,
                  double currentPrivateTransport, double predictedPrivateTransport) {
        this.actionMessage = actionMessage;
        this.currentFood = currentFood;
        this.predictedFood = predictedFood;
        this.currentTransport = currentTransport;
        this.predictedTransport = predictedTransport;
        this.currentDining = currentDining;
        this.predictedDining = predictedDining;
        this.currentShopping = currentShopping;
        this.predictedShopping = predictedShopping;
        this.currentPublicTransport = currentPublicTransport;
        this.predictedPublicTransport = predictedPublicTransport;
        this.currentPrivateTransport = currentPrivateTransport;
        this.predictedPrivateTransport = predictedPrivateTransport;
    }

    public String getActionMessageFood(double currentFood, double predictedFood, double currentDining, double predictedDining,
                                       double currentShopping, double predictedShopping) {
        actionMessage = "You need to save " + (predictedFood - currentFood) + " on Food and Beverages monthly\n";
        actionMessage += getFoodMessage(currentDining, currentShopping, predictedDining, predictedShopping);
        return actionMessage;
    }

    public String getActionMessageTransport(double currentTransport, double predictedTransport, double currentPublicTransport, double predictedPublicTransport,
                                       double currentPrivateTransport, double predictedPrivateTransport) {
        actionMessage = "You need to save " + (predictedTransport - currentTransport) + " on Transport monthly\n";
        actionMessage += getTransportMessage(currentPublicTransport, currentPrivateTransport, predictedPublicTransport, predictedPrivateTransport);
        return actionMessage;
    }

    private String getFoodMessage(double currentDining, double currentShopping, double predictedDining, double predictedShopping) {
        String message = "You can spend " + predictedDining + " on eating out and " + predictedShopping + " for shopping\n";
        if (currentDining >= (1.25*currentShopping)) {
            message += "Eating out less and cooking more at home can help you achieve your future goals!\n";
        }
        return message;
    }

    private String getTransportMessage(double currentPublicTransport, double currentPrivateTransport, double predictedPublicTransport, double predictedPrivateTransport) {
        String message = "You can spend " + predictedPublicTransport + " on Public Transport and " + predictedPrivateTransport + " on Private Transport\n";
        if (currentPrivateTransport >= (1.25*currentPublicTransport)) {
            message += "Using public transport like MRT and buses can help you achieve your future goals!\n";
        }
        return message;
    }
}
