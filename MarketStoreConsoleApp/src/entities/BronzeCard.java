package entities;

public class BronzeCard extends DiscountCard{
    private final double lowestDiscountRate = 0.0;
    private final double midDiscountRate = 1.0;
    private final double highestDiscountRate = 2.5;

    @Override
    public double getDiscountRate(double turnover) {
        if (turnover < 100) {
            return lowestDiscountRate;
        }
        else if (turnover <= 300){
            return midDiscountRate;
        }
        else {
            return highestDiscountRate;
        }
    }
}
