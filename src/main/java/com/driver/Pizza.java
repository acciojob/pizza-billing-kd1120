package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private  int toppingsPrice;
    private int cheesePrice;
    private String size;
    private int carryBagPrice;
    private boolean isCarryBagAdded;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isBillGenerated;
    private int totalAmount;


    public Pizza(Boolean isVeg){

        if(isVeg) {
            price = 300;
            this.toppingsPrice = 70;


        }
        else {
            price = 400;
            this.toppingsPrice = 120;
        }
        this.cheesePrice = 80;
        this.carryBagPrice = 20;
        totalAmount = price;

        bill = "Base Price Of The Pizza: "+price+"\n";
        // your code goes here

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            isCheeseAdded = true;
            totalAmount = totalAmount + cheesePrice;
            bill = bill + "Extra Cheese Added: "+cheesePrice + "\n";

        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded) {
            isToppingsAdded = true;
            totalAmount = totalAmount + toppingsPrice;
            bill = bill + "Extra Toppings Added: "+toppingsPrice + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isCarryBagAdded) {
            isCarryBagAdded = true;
            totalAmount = totalAmount + carryBagPrice;
            bill = bill + "Paperbag Added: "+carryBagPrice + "\n";
        }
    }

    public String getBill(){


            bill = bill + "Total Price: "+totalAmount + "\n";
        return this.bill;
    }
}
