package Lesson_12;

public class Main_CoffeeMachine {
    public static void main(String[] args) {

        CoffeeMachine myCoffeeMaker = new CoffeeMachine("Espresso Lavazza","Macchiato Lavazza",
                "Cappuccino Manuel","Milk 2.0%",
                "Hot White Choclate");

        myCoffeeMaker.getDrink();
    }
}