import entities.DiscountCard;

import entities.InvalidCard;

import java.util.Scanner;

public class MarketStoreSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DiscountCard discountCard;

        String typeOfCard = "";

        while (true) {

            System.out.println("Welcome to our market store!");
            System.out.println("The discount cards are: bronze, silver or gold");
            System.out.println();

            do {
                System.out.println("Please enter the type of card that you have or enter 'exit' to close the application:");
                typeOfCard = sc.nextLine();

                if (typeOfCard.equals("exit")) {
                    return;
                }

                discountCard = PayDesk.getCard(typeOfCard);

                if (discountCard instanceof InvalidCard) {
                    System.out.println("This type of card is not available!");
                }

            } while (discountCard instanceof InvalidCard);

            double turnover;

            do {

                System.out.println("Please enter the turnover: ");
                turnover = Double.parseDouble(sc.nextLine());

                if (turnover < 0) {
                    System.out.println("Turnover can't be negative.");
                }

            } while (turnover < 0);


            double purchaseValue;

            do {
                System.out.println("Please enter the purchase value: ");
                purchaseValue = Double.parseDouble(sc.nextLine());

                if (purchaseValue <= 0) {
                    System.out.println("Purchase value can't be negative or null");
                }

            } while (purchaseValue <= 0);

            System.out.println();

            PayDesk.getInfo(discountCard, turnover, purchaseValue);

            break;

        }
    }
}
