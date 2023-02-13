package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    boolean isExteraCheseAdded;
    boolean isexteraToppingAdded;
    boolean isBillCreated;
    boolean isTakeAway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExteraCheseAdded){
            this.price += 80;
            this.isExteraCheseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isexteraToppingAdded){
            this.price += this.toppings;
            this.isExteraCheseAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            this.isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated) {
            if (!isExteraCheseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (!isexteraToppingAdded) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            this.isBillCreated = true;
            return this.bill;
        }
        return "";
    }
}
