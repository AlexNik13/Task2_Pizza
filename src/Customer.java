import java.util.Scanner;

public class Customer {
    String name ;
    static int orderNumber = 0;


    Scanner in = new Scanner(System.in);


    public Customer() {
        this.name = "Без имени";
        orderNumber++;
    }


    String getOrderNumberStr(){
        return String.valueOf(orderNumber);
    }


    // коекция заказа пиц.
    Pizza[] pizza = new Pizza[0];


    //
    void zakazPizza(){
        boolean zakaz = true;
        int choice;

        while (zakaz){
            pizza = addPizza(pizza);
            System.out.println("Добавить пицу 1 - \"YES\" или 2 - \"NO\"");

            choice = in.nextInt();

            if(choice == 2){
                zakaz = false;
            }
        }


    }


    // Добавляем пицу к заказу
    Pizza[] addPizza(Pizza[] pizzaAdd){
        Pizza[] addPizza = new  Pizza[pizzaAdd.length +1];

        for (int i = 0; i < pizzaAdd.length; i++){
            addPizza[i] = pizzaAdd[i];
        }

        System.out.println("Выбор пици");
        System.out.println("1. Мясная пица");
        System.out.println("2. Фермерская пица");
        System.out.println("3. Вегатареанская пица");
        int choice = in.nextInt();

        switch (choice){
            case 1:
                addPizza[pizzaAdd.length] = new PizzaMeat();
                break;
            case 2:
                addPizza[pizzaAdd.length] = new PizzaFarm();
                break;
            case 3:
                addPizza[pizzaAdd.length] = new PizzaVegan();
                break;

        }
        return addPizza;
    } //


}
