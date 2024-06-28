package coffeshop;

import java.util.Scanner;

public class Main1 {
    public static void main(String [] args) {
        Shop shop = new ShopServiceImpl();
        Scanner sc = new Scanner(System.in);
        int wrongInput = 0;
        String loop = "no";
        do {
            wrongInput = 0;
            System.out.println("What type of drink would you like to order?");
            String drink = sc.nextLine().toLowerCase();
            if(drink.equalsIgnoreCase("coffee")){
                System.out.println("What type of coffe would you like?");
                shop.listCoffee();
                String coffee = sc.nextLine().toLowerCase();
                switch (coffee){
                    case "latte":
                        shop.displayCoffee("Latte");
                        break;
                    case "espresso":
                        shop.displayCoffee("Espresso");
                        break;
                    case "cappucino":
                        shop.displayCoffee("Cappucino");
                        break;
                    case "flat white":
                        shop.displayCoffee("Flat White");
                        break;
                    case "americano":
                        shop.displayCoffee("Americano");
                        break;
                }
                System.out.println("Your order is taken!" + "\n" + "Would you like to order something else?");
                loop = sc.nextLine().toLowerCase();

            } else if (drink.equalsIgnoreCase("tea")){
                System.out.println("What type of tea would you like?");
                shop.listTea();
                String coffee = sc.nextLine().toLowerCase();
                switch (coffee){
                    case "black":
                        shop.displayTea("Black");
                        break;
                    case "green":
                        shop.displayTea("Green");
                        break;
                    case "herbal":
                        shop.displayTea("Herbal");
                        break;
                }
                System.out.println("Your order is taken!" + "\n" + "Would you like to order something else?");
                loop = sc.nextLine().toLowerCase();
            }else {
                System.out.println("Please provide a correct drink name");
                wrongInput++;
                loop = "no";

            }

        }while(loop.equalsIgnoreCase("yes") || (wrongInput > 0));

    }
}
