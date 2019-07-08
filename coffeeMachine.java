import java.util.*;


public class coffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int water;
    static int milk;
    static int beans;
    static int cups;
    static int money;

    public static void coffeeMachineStatus(int water, int milk, int beans, int cups, int money) {

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }
    public static void buy(){
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String n = scanner.next();
        buyCoffee(n);
    }
    public static void buyCoffee(String n){

        switch(n) {
            case "1": espresso();
                break;
            case "2": latte();
                break;
            case "3": cappuccino();
                break;
            case "back": break;

            default: break;
        }
    }
    public static void espresso() {
        if(water >= 250 && beans >= 16){
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            beans -= 16;
            cups--;
            money += 4;
        }
        else if (water < 250){
            System.out.println("Sorry, not enough water!");
        }
        else if (beans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        }
    }
    public static void latte(){
        if (water >= 350 && milk >= 75 && beans >= 20){
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups--;
            money += 7;
        }
        else if (water < 350) {
            System.out.println("Sorry, not enough water!");
        }
        else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
        }
        else if (beans < 20) {
            System.out.println("Sorry, not enough beans!");
        }
    }
    public static void cappuccino(){
        if (water >= 200 && milk >= 100 && beans >= 12) {
            System.out.println("I have a enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups--;
            money += 6;
        }
        else if (water < 200) {
            System.out.println("Sorry, not enough water!");
        }
        else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
        }
        else if (beans < 12){
            System.out.println ("Sorry, not enough beans!");
        }

    }
    public static void fill(){
        System.out.print("Write how many ml of water do you want to add: ");
        water = scanner.nextInt() + water;
        System.out.print("Write how many ml of milk do you want to add: ");
        milk = scanner.nextInt() + milk;
        System.out.print("Write how many grams of coffee beans do you want to add: ");
        beans = scanner.nextInt() + beans;
        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        cups = scanner.nextInt() + cups;
        System.out.println("");

    }
    public static void takeMoney(){
        System.out.println("I gave you $550");
        System.out.println("");
        money = 0;
    }
    public static void main(String[] args){
        water = 400;
        milk = 540;
        beans = 120;
        cups = 9;
        money = 550;

        while(true) {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            String choice = scanner.next();
            System.out.println("");
            if (choice.equals("exit")){
                break;
            }
            switch (choice){
                case "buy": buy();
                    break;
                case "fill": fill();
                    break;
                case "take": takeMoney();
                    break;
                case "remaining": coffeeMachineStatus(water, milk, beans, cups, money);
                    break;
                default: break;
            }
            System.out.println("");
        }
    }


}