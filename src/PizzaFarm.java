public class PizzaFarm extends Pizza{
    int meatGram;
    int baconGram;
    int mushroomsGram;
    int onionGram;

    public PizzaFarm() {
        super();
        super.namePizza = "Фермерская пицца";
        this.meatGram = 100;
        this.baconGram = 80;
        this.mushroomsGram = 50;
        this.onionGram = 50;
    }
}
