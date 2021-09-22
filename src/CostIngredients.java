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
    double costPizzaMeat(PizzaMeat pizza){
        double cost;
        cost =  doughCostKg / 1000 * pizza.doughGram +
                cheeseCostKg / 1000 * pizza.cheeseGram +
                sauseCostKg / 1000 * pizza.sauseGram +
                tomatoCostKg / 1000 * pizza.tomatoGram +
                meatCostKg / 1000 * pizza.meatGram +
                hamCostKg / 1000 * pizza.hamGram +
                sausageCostKg / 1000 * pizza.sausageGram;
        return  cost ;
    }

    // цена фермерской пицци
    double costPizzaFarm(PizzaFarm pizza){
        double cost;
        cost = doughCostKg / 1000 * pizza.doughGram +
                cheeseCostKg / 1000 * pizza.cheeseGram +
                sauseCostKg / 1000 * pizza.sauseGram +
                meatCostKg / 1000 * pizza.meatGram +
                baconCostKg / 1000 * pizza.baconGram +
                mushroomsCostKg / 1000 * pizza.meatGram +
                onionCostKg / 1000 * pizza.onionGram;
        return cost;
    }


    // цена вегеторианской пицци
    double costPizzaVegan(PizzaVegan pizza){
        double cost;
        cost = doughCostKg / 1000 * pizza.doughGram +
                cheeseCostKg / 1000 * pizza.cheeseGram +
                sauseCostKg / 1000 * pizza.sauseGram +
                bellPepperCostKg / 1000 * pizza.bellPepperGram +
                broccoliCostKg / 1000 * pizza.broccoliGram +
                mushroomsCostKg / 1000 * pizza.mushroomsGram +
                olivesCostKg / 1000 * pizza.olivesGram +
                onionCostKg / 1000 * pizza.onionGram;
        return cost;
    }
}
