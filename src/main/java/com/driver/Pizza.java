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

        if(isVeg)
            price = 300;
        else
            price = 400;

        this.toppingsPrice = 70;
        this.cheesePrice = 80;
        this.carryBagPrice = 20;

        totalAmount = price;

        bill = "Base Price of the pizza :" +price+"\n";
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
            bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";

        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded) {
            isToppingsAdded = true;
            totalAmount = totalAmount + toppingsPrice;
            bill = bill + "Extra toppings added : " + toppingsPrice + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isCarryBagAdded) {
            isCarryBagAdded = true;
            totalAmount = totalAmount + carryBagPrice;
            bill = bill + "Paper bag added : " + carryBagPrice + "\n";
        }
    }

    public String getBill(){

        if(isBillGenerated == false){
            isBillGenerated = true;
            bill = bill + "Total price: " + totalAmount + "\n";
        }
        // your code goes here
        return this.bill;
    }
}
