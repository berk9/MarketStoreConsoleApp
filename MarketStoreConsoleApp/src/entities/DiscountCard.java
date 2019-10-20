package entities;

public class DiscountCard {

    private double discountRate;

    public static DiscountCard init(String typeOfCard) {

        try {
            if (typeOfCard.equals("bronze")) {
                return new BronzeCard();

            } else if (typeOfCard.equals("silver")) {
                return new SilverCard();

            } else if (typeOfCard.equals("gold")) {
                return new GoldCard();

            } else {
                throw new IllegalArgumentException();
            }

        } catch (Exception e) {
            return new InvalidCard();
        }
    }

    public double getDiscountRate(double turnover) {
        return discountRate;
    }
}
