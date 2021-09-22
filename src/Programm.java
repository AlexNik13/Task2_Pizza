public class Programm {
    public static void main(String[] args) {


        Customer buy1 = new Customer();
        PrintCheck printCheck = new PrintCheck();

        buy1.zakazPizza();
        printCheck.printCheck(buy1);




    }
}
