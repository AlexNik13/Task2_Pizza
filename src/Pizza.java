import java.util.Scanner;

public class Pizza {
    String namePizza;

    // Состав всех пицци
    // Основа
    int doughGram = 0;
    int cheeseGram = 0;
    int sauseGram = 0;
    int tomatoGram = 0;

    //Добавки
    int meatGram = 0;
    int baconGram = 0;
    int mushroomsGram = 0;
    int onionGram = 0;
    int hamGram = 0;
    int sausageGram = 0;
    int bellPepperGram = 0;
    int broccoliGram = 0;
    int olivesGram = 0;


    public Pizza() {
        this.doughGram = 150;
        this.cheeseGram = 50;
        this.sauseGram = 80;
        this.tomatoGram = 40;
        addIngredients();
    }

    Scanner in = new Scanner(System.in);
    void addIngredients(){
        boolean menu = true;
        int choice;
        System.out.println("Желаете добавить ингридиенты? 1 - \"YES\" или 2 - \"NO\"");
        choice = in.nextInt();
        if (choice == 1){


            while (menu){

                System.out.println("Добавить 50 грамм");
                System.out.println("1. Сыр");
                System.out.println("2. Соус");
                System.out.println("3. Помидоры");
                System.out.println("4. Мясо");
                System.out.println("5. Бекон");
                System.out.println("6. Гребы");
                System.out.println("7. Ветчина");
                System.out.println("8. Болгарский перец");
                System.out.println("9. Брокколи");
                System.out.println("10. Оливки");
                System.out.println("11. Лук");
                System.out.println("12. Сосиськи");
                System.out.println("13. ХВАТИТ");
                choice = in.nextInt();

                switch (choice){
                    case 1:
                        setCheeseGram(50);
                        break;
                    case 2:
                        setSauseGram(50);
                        break;
                    case 3:
                        setTomatoGram(50);
                        break;
                    case 4:
                        setMeatGram(50);
                        break;
                    case 5:
                        setBaconGram(50);
                        break;
                    case 6:
                        setMushroomsGram(50);
                        break;
                    case 7:
                        setHamGram(50);
                        break;
                    case 8:
                        setBellPepperGram(50);
                        break;
                    case 9:
                        setBroccoliGram(50);
                        break;
                    case 10:
                        setOlivesGram(50);
                        break;
                    case 11:
                        setOnionGram(50);
                        break;
                    case 12:
                        setSausageGram(50);
                        break;
                    case 13:
                        menu = false;
                        break;

                }
            }

        }
    }



    public void setCheeseGram(int cheeseGram) {
        this.cheeseGram += cheeseGram;
    }

    public void setSauseGram(int sauseGram) {
        this.sauseGram += sauseGram;
    }

    public void setTomatoGram(int tomatoGram) {
        this.tomatoGram += tomatoGram;
    }

    public void setMeatGram(int meatGram) {
        this.meatGram += meatGram;
    }

    public void setBaconGram(int baconGram) {
        this.baconGram += baconGram;
    }

    public void setMushroomsGram(int mushroomsGram) {
        this.mushroomsGram += mushroomsGram;
    }

    public void setOnionGram(int onionGram) {
        this.onionGram += onionGram;
    }

    public void setHamGram(int hamGram) {
        this.hamGram += hamGram;
    }

    public void setSausageGram(int sausageGram) {
        this.sausageGram += sausageGram;
    }

    public void setBellPepperGram(int bellPepperGram) {
        this.bellPepperGram += bellPepperGram;
    }

    public void setBroccoliGram(int broccoliGram) {
        this.broccoliGram += broccoliGram;
    }

    public void setOlivesGram(int olivesGram) {
        this.olivesGram += olivesGram;
    }

}
