public class Customer {
    String name ;
    static int orderNumber = 0;
    public Customer() {
        this.name = "Без имени";
        orderNumber++;
    }
}
