public class PrintCheck {

    CostIngredients cost = new CostIngredients();
    void printCheck(Customer customer){
        double sum = 0;
        System.out.println("Черк № " + customer.getOrderNumberStr());
        for (int i =0; i < customer.pizza.length; i++){
            if(customer.pizza[i].namePizza == "Фермерская пицца"){
                System.out.println(customer.pizza[i].namePizza + " - " + (double)Math.round(cost.costPizza((PizzaFarm) customer.pizza[i]) *100)/100);
                sum +=cost.costPizza((PizzaFarm) customer.pizza[i]);
            }
            if(customer.pizza[i].namePizza == "Мясная пицца"){
                System.out.println(customer.pizza[i].namePizza + " - " + (double)Math.round(cost.costPizza((PizzaMeat) customer.pizza[i])*100)/100);
                sum +=cost.costPizza((PizzaMeat) customer.pizza[i]);
            }
            if(customer.pizza[i].namePizza == "Вегетарианская пицца"){
                System.out.println(customer.pizza[i].namePizza + " - " + (double)Math.round(cost.costPizza((PizzaVegan) customer.pizza[i]) *100)/100);
                sum +=cost.costPizza((PizzaVegan) customer.pizza[i]);
            }
            if(customer.pizza[i].namePizza == "Авторская пицца"){
                System.out.println(customer.pizza[i].namePizza + " - " + (double)Math.round(cost.costPizza((AuthorPizza) customer.pizza[i]) *100)/100);
                sum +=cost.costPizza((AuthorPizza) customer.pizza[i]);
            }
        }
        System.out.println();
        System.out.println("ИТОГО к оплате " + (double)Math.round(sum * 100) / 100 + " грн.");
    }
}
