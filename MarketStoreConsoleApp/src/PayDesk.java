import entities.DiscountCard;

public class PayDesk {

    static DiscountCard getCard(String typeOfCard) {
        return DiscountCard.init(typeOfCard);
    }

    static void getInfo(DiscountCard discountCard, double turnover, double purchaseValue) {
        System.out.printf("> Purchase value: $%.2f%n", purchaseValue);
        System.out.printf("> Discount rate: %.1f%s%n", discountCard.getDiscountRate(turnover), "%");
        System.out.printf("> Discount: $%.2f%n", discountCard.getDiscountRate(turnover) / 100 * purchaseValue);
        System.out.printf("> Total: $%.2f%n", purchaseValue - discountCard.getDiscountRate(turnover) / 100 * purchaseValue);
    }
}
