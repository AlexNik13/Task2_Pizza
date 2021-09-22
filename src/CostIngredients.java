import java.lang.management.MemoryType;

public class CostIngredients {
    double doughCostKg;
    double cheeseCostKg;
    double sauseCostKg;
    double tomatoCostKg;
    double meatCostKg;
    double baconCostKg;
    double mushroomsCostKg;
    double onionCostKg;
    double hamCostKg;
    double sausageCostKg;
    double bellPepperCostKg;
    double broccoliCostKg;
    double olivesCostKg;

    public CostIngredients() {
        this.doughCostKg = 50;
        this.cheeseCostKg = 248.25;
        this.sauseCostKg = 85.90;
        this.tomatoCostKg = 35;
        this.meatCostKg = 125.70;
        this.baconCostKg = 135.10;
        this.mushroomsCostKg = 35.20;
        this.onionCostKg = 80;
        this.hamCostKg = 310.40;
        this.sausageCostKg = 250;
        this.bellPepperCostKg = 40;
        this.broccoliCostKg = 70;
        this.olivesCostKg = 145.3;
    }

    // цена мясной пицци



    double costPizza(PizzaMeat pizza){
        double cost;
        cost =  doughCostKg / 1000 * pizza.doughGram +
                cheeseCostKg / 1000 * pizza.cheeseGram +
                sauseCostKg / 1000 * pizza.sauseGram +
                tomatoCostKg / 1000 * pizza.tomatoGram +
                meatCostKg / 1000 * pizza.meatGram +
                hamCostKg / 1000 * pizza.hamGram +
                sausageCostKg / 1000 * pizza.sausageGram +
                baconCostKg / 1000 * pizza.baconGram +
                mushroomsCostKg / 1000 * pizza.mushroomsGram +
                onionCostKg / 1000 * pizza.onionGram +
                bellPepperCostKg / 1000 * pizza.bellPepperGram +
                broccoliCostKg / 1000 * pizza.broccoliGram +
                olivesCostKg / 1000 * pizza.olivesGram;


        return  cost ;
    }

    // цена фермерской пицци
    double costPizza(PizzaFarm pizza){
        double cost;
        cost =  doughCostKg / 1000 * pizza.doughGram +
                cheeseCostKg / 1000 * pizza.cheeseGram +
                sauseCostKg / 1000 * pizza.sauseGram +
                tomatoCostKg / 1000 * pizza.tomatoGram +
                meatCostKg / 1000 * pizza.meatGram +
                hamCostKg / 1000 * pizza.hamGram +
                sausageCostKg / 1000 * pizza.sausageGram +
                baconCostKg / 1000 * pizza.baconGram +
                mushroomsCostKg / 1000 * pizza.mushroomsGram +
                onionCostKg / 1000 * pizza.onionGram +
                bellPepperCostKg / 1000 * pizza.bellPepperGram +
                broccoliCostKg / 1000 * pizza.broccoliGram +
                olivesCostKg / 1000 * pizza.olivesGram;
        return cost;
    }


    // цена вегеторианской пицци
    double costPizza(PizzaVegan pizza){
        double cost;
        cost =  doughCostKg / 1000 * pizza.doughGram +
                cheeseCostKg / 1000 * pizza.cheeseGram +
                sauseCostKg / 1000 * pizza.sauseGram +
                tomatoCostKg / 1000 * pizza.tomatoGram +
                meatCostKg / 1000 * pizza.meatGram +
                hamCostKg / 1000 * pizza.hamGram +
                sausageCostKg / 1000 * pizza.sausageGram +
                baconCostKg / 1000 * pizza.baconGram +
                mushroomsCostKg / 1000 * pizza.mushroomsGram +
                onionCostKg / 1000 * pizza.onionGram +
                bellPepperCostKg / 1000 * pizza.bellPepperGram +
                broccoliCostKg / 1000 * pizza.broccoliGram +
                olivesCostKg / 1000 * pizza.olivesGram;
        return cost;
    }
}
