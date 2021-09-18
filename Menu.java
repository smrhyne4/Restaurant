package org.launchcode.java.restaurant;


import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date dateUpdated, ArrayList<MenuItem> item) {
        this.lastUpdated = dateUpdated;
        this.items = item;
    }

    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }
    public void setItems(ArrayList<MenuItem> items) { this.items = items; }
    public Date getLastUpdated() { return lastUpdated; }
    public ArrayList<MenuItem> getItems() { return items; }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        return this.items;
    }
}
