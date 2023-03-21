package model;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        isVegeterian = true;
    }
}
