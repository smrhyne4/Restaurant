package org.launchcode.java.restaurant;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem newItem1 = new MenuItem( 5.99, "Buffalo Wings", "Appetizer", true);
        MenuItem newItem2 = new MenuItem( 15.99, "Double Bacon Cheeseburger", "Main Course", true);
        MenuItem newItem3 = new MenuItem( 7.99, "Chocolate Brownie with ice-cream", "Dessert", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        System.out.println(ourMenu);

    }
}
