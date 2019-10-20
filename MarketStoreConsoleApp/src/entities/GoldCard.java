package entities;

public class GoldCard extends DiscountCard {
    private final double initialDiscountRate = 2.0;
    private double growingDiscountRate;

    @Override
    public double getDiscountRate(double turnover) {
        if (turnover >= 100) {
            growingDiscountRate = initialDiscountRate;

            for (int i = 100; i < turnover; i += 100) {
                growingDiscountRate += 1.0;
                if (growingDiscountRate == 10.0){
                    break;
                }
            }
            return growingDiscountRate;
        } else {
            return initialDiscountRate;
        }
    }
}
