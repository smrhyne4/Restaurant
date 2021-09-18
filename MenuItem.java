package org.launchcode.java.restaurant;

public class MenuItem {
    public double price;
    public String description;
    public String category;
    public boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category= category;
        this.isNew = isNew;
    }

    public void setPrice(double price) { this.price = price; }
    public void setDescription(String description) { this.description = description; }
    public void setCategory(String category) { this.category = category; }
    public void setNew(boolean aNew) { isNew = aNew; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public boolean getIsNew() { return isNew; }

    public String isItemNew() {
        if (this.isNew) {
            return ("This item is new!");
        }
        else {
            return ("This item is not new!");
        }
    }
}
