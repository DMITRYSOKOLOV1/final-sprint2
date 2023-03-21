package model;

public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegeterian;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public double getPrice() {
        return amount * price;
    }

    public double getTotalPriceWithDiscount() {
        if (getDiscount() == DISCOYNT_FOR_RED_APPLE) {
            return getPrice() * (100 - DISCOYNT_FOR_RED_APPLE / 100);
        }
    }
}
