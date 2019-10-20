package entities;

public class SilverCard extends DiscountCard {
    private final double initialDiscountRate = 2.0;
    private final double highestDiscountRate = 3.5;

    @Override
    public double getDiscountRate(double turnover) {
        if (turnover <= 300) {
            return initialDiscountRate;
        }
        else {
            return highestDiscountRate;
        }
    }
}
