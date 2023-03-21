package model;

public class Main {
    public static void main(String[] args) {
        Food apple = new Apple(1,2,"green");
        System.out.println(apple.isVegeterian);
        Food meat = new Meat(1,2);
        System.out.println(meat.isVegeterian);
    }
}
