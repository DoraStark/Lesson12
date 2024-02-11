import java.util.Scanner;

public class Drinks {

    public final double COFFEE_PRICE = 10.5;
    public final double TEE_PRICE = 6.25;
    public final double LEMONADE_PRICE = 12.5;
    public final double MOCHITO_PRICE = 15.0;
    public final double MINERALWATER_PRICE = 5.5;
    public final double COCA_COLA_PRICE = 7.5;
    double sum=0;
    int drinksAmount=0;
    DrinksMachine selectedDrink = null;


    public void drinkChoice(){
        System.out.println(
                "1. Кава " + COFFEE_PRICE + " грн.\n" +
                        "2. Чай " + TEE_PRICE + " грн.\n" +
                        "3. Лемонад " + LEMONADE_PRICE + " грн.\n" +
                        "4. Мохіто " + MOCHITO_PRICE + " грн.\n" +
                        "5. Мінеральна вода " + MINERALWATER_PRICE + " грн.\n" +
                        "6. Кока-Кола " + COCA_COLA_PRICE + " грн.\n");

    }

    public  void makeDrink(){
        System.out.println("Оберіть напій");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                selectedDrink = DrinksMachine.COFFEE;
                sum+=getCOFFEE();
                usersChoice();
                makeCoffee();
                drinksAmount++;
                break;
            case 2:
                selectedDrink = DrinksMachine.TEE;
                sum+=getTEE();
                usersChoice();
                makeTee();
                drinksAmount++;
                break;
            case 3:
                selectedDrink = DrinksMachine.LEMONADE;
                sum+=getLEMONADE();
                usersChoice();
                makeLemonade();
                drinksAmount++;
                break;
            case 4:
                selectedDrink = DrinksMachine.MOCHITO;
                sum+=getMOCHITO();
                usersChoice();
                makeMochito();
                drinksAmount++;
                break;
            case 5:
                selectedDrink = DrinksMachine.MINERALWATER;
                sum+=getMINERALWATER();
                usersChoice();
                makeWater();
                drinksAmount++;
                break;
            case 6:
                selectedDrink = DrinksMachine.COCA_COLA;
                sum+=getCOCA_COLA();
                usersChoice();
                makeCola();
                drinksAmount++;
                break;

            default:
                System.out.println("Позиція недоступна. Оберіть від 1 до 6.");
                scanner.nextInt();
        }

        ifContinue();
}
    public  void ifContinue() {
        System.out.println("Бажаєте продовжити? Натисніть Продовжити. ");
        System.out.println("Завершити замовлення? Натисніть Завершити. ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("Продовжити")) {
            makeDrink();
        }
        else if (choice.equals("Завершити")) {
            System.out.println("Кількість замовлених напоїв: "+drinksAmount+". Сума до оплати: " + sum + " грн");
        } else {
            System.out.println("Помилка.Оберіть ще");
        }
    }
    public double getCOFFEE() {
        return COFFEE_PRICE;
    }
    public double getTEE() {
        return TEE_PRICE;
    }

    public double getLEMONADE() {
        return LEMONADE_PRICE;
    }

    public double getMOCHITO() {
        return MOCHITO_PRICE;
    }

    public double getMINERALWATER() {
        return MINERALWATER_PRICE;
    }

    public double getCOCA_COLA() {
        return COCA_COLA_PRICE;
    }

    public void usersChoice(){
        System.out.println("Ви обрали: " + selectedDrink);
    }

    public void makeCoffee(){
        System.out.println("Введіть кількість цукру ");
        Scanner scanner = new Scanner(System.in);
        int sugar = scanner.nextInt();
        System.out.println("Молоко? Оберіть Так або Ні");
        Scanner scanner1 = new Scanner(System.in);
        String choice = scanner1.nextLine();
        String milk=null;
        if(choice.equals("Так")){
            milk="з молоком";
        }
        if(choice.equals("Ні")){
            milk="без молока";
        }
        System.out.println("Зачекайте ваша кава з цукром х" + sugar +" та " + milk +" готується... \nГотово.");
        }

    public void makeTee(){
        String teetype = null;
        System.out.println("Оберіть чай: \n1.Чорний\n2.Зелений\n3.Трав'яний");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                teetype = "Чорний";
                break;
            case 2:
                teetype = "Зелений";
                break;
            case 3:
                teetype = "Трав'яний";
                break;}

        System.out.println("Введіть кількість цукру ");
        scanner = new Scanner(System.in);
        int sugar = scanner.nextInt();
        System.out.println("Молоко? Оберіть Так або Ні");
        Scanner scanner1 = new Scanner(System.in);
        String milkChoice = scanner1.nextLine();
        if(milkChoice.equals("Так")){
            milkChoice="з молоком";
        }
        if(milkChoice.equals("Ні")){
            milkChoice="без молока";
        }

        System.out.println("Зачекайте ваш " + teetype+ " чай з цукром х" + sugar + " з " + milkChoice+" готується... \nГотово.");
    }

    public void makeLemonade(){
        System.out.println("Візьміть ваш лимонад");
    }
    public void makeMochito(){
    System.out.println("Візьміть ваше мохіто");
    }

    public void makeWater(){
        System.out.println("Візьміть ваше мохіто");
    }

    public void makeCola(){
        System.out.println("Візьміть вашу колу");
    }


}








