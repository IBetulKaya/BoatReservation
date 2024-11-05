package model;

public class Boat {
    public static int id = 1000;
    private String categoryName;
    private int boatId;
    private String boatName;
    private int boatSize;
    private String boatColor;
    private boolean isAvailable;
    private double price;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getBoatId() {
        return boatId;
    }


    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public int getBoatSize() {
        return boatSize;
    }

    public void setBoatSize(int boatSize) {
        this.boatSize = boatSize;
    }

    public String getBoatColor() {
        return boatColor;
    }

    public void setBoatColor(String boatColor) {
        this.boatColor = boatColor;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boat(String categoryName, int boatId, String boatName, int boatSize, boolean isAvailable, String boatColor, double price) {
        this.categoryName = categoryName;
        this.boatId = boatId;
        this.boatName = boatName;
        this.boatSize = boatSize;
        this.isAvailable = isAvailable;
        this.boatColor = boatColor;
        this.price = price;
    }
}
