package model.service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Food food : foods) {
            totalPrice += food.getPrice();
        }
        return totalPrice;
    }
    public double getTotalPriceWithDiscount() {
        double totalPriceWithDiscount = 0;
        for (Food food : foods) {
            totalPriceWithDiscount += food.getTotalPriceWithDiscount();
            return totalPriceWithDiscount;
        }
    }
}
