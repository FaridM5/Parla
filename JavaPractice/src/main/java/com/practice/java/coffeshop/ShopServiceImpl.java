package com.practice.java.coffeshop;

public class ShopServiceImpl implements Shop{

    @Override
    public void displayCoffee(String name){
        switch (name){
            case "Latte":
                System.out.println("The selected coffee is: " + Coffee.LATTE.getDescription() + ". Price: " + Coffee.LATTE.getPrice() + ". Size: " + Coffee.LATTE.getSize());
                break;
            case "Espresso":
                System.out.println("The selected coffee is: " + Coffee.ESPRESSO.getDescription() + ". Price: " + Coffee.ESPRESSO.getPrice() + ". Size: " + Coffee.ESPRESSO.getSize());
                break;
            case "Cappucino":
                System.out.println("The selected coffee is: " + Coffee.CAPPUCCINO.getDescription() + ". Price: " + Coffee.CAPPUCCINO.getPrice() + ". Size: " + Coffee.CAPPUCCINO.getSize());
                break;
            case "Flat White":
                System.out.println("The selected coffee is: " + Coffee.FLAT_WHITE.getDescription() + ". Price: " + Coffee.FLAT_WHITE.getPrice() + ". Size: " + Coffee.FLAT_WHITE.getSize());
                break;
            case "Americano":
                System.out.println("The selected coffee is: " + Coffee.AMERICANO.getDescription() + ". Price: " + Coffee.AMERICANO.getPrice() + ". Size: " + Coffee.AMERICANO.getSize());
                break;
        }
    }

    @Override
    public void displayTea(String name){
        switch (name){
            case "Black":
                System.out.println("The selected tea is: " + Tea.BLACK.getDescription() + ". Price: " + Tea.BLACK.getPrice() + ". Size: " + Tea.BLACK.getSize());
                break;
            case "Green":
                System.out.println("The selected tea is: " + Tea.GREEN.getDescription() + ". Price: " + Tea.GREEN.getPrice() + ". Size: " + Tea.GREEN.getSize());
                break;
            case "Herbal":
                System.out.println("The selected tea is: " + Tea.HERBAL.getDescription() + ". Price: " + Tea.HERBAL.getPrice() + ". Size: " + Tea.HERBAL.getSize());
                break;
        }
    }

    @Override
    public void listCoffee(){
        for(Coffee coffee: Coffee.values()){
            System.out.println(coffee.getDescription());
        }
    }

    @Override
    public void listTea(){
        for (Tea tea: Tea.values()){
            System.out.println(tea.getDescription());
        }
    }

}
