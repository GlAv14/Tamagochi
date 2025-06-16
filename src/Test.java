import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Марс");
        cat1.catMenu();
    }
}

class Cat {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;
    private double weight;
    private int hungry;
    private int playDesire;
    private boolean b = true;

    public Cat(String name) {
        this.name = name;
        age = 0;
        weight = 3.00;
        hungry = 50;
        playDesire = 50;
    }

    public void catMenu() {
        System.out.println("Добро пожаловать в игру Мой кот");
        while (b) {
            if(this.hungry<=0){
                this.hungry = 0;
                System.out.println();
                System.out.println("Ваш кот очень голоден срочно покормите его");
                System.out.println("Он сыт на "+ this.hungry+"%");
            }
            if (this.playDesire<=0) {
                this.playDesire = 0;
                System.out.println();
                System.out.println("Кот очень сильно хочет играть");
                System.out.println("Он наигрался на " + this.playDesire + "%");
            }
            for (int i = 1; true; i++) {
                if (i % 20 == 0) {
                    System.out.println();
                    System.out.println("У вашего кота сегодня день рождения");
                    System.out.println("Его возраст теперь " + this.age + " год");
                }
                if (i % 2 == 0) {
                    if(this.hungry<=0){
                        this.hungry = 0;
                        System.out.println();
                        System.out.println("Ваш кот очень голоден срочно покормите его");
                        System.out.println("Он сыт на "+ this.hungry+"%");
                    }else {
                        this.hungry -= 40;
                        if(this.hungry<=0){
                            this.hungry = 0;
                        }
                        System.out.println();
                        System.out.println("Ваш кот проголодался");
                        System.out.println("Он сыт на " + this.hungry + "%");
                    }
                }
                if (i%15==0){
                    this.playDesire -= 40;
                    if (playDesire<=0){
                        this.playDesire = 0;
                        System.out.println();
                        System.out.println("Кот очень сильно хочет играть");
                        System.out.println("Он наигрался на "+this.playDesire+"%");
                    }else {
                        System.out.println("Ваш кот снова хочет поиграть");
                        System.out.println("Он хочет играть на " + this.playDesire + "%");
                    }
                }
                System.out.println();
                System.out.println("Нажмите 1 чтобы получить инфо о вашем коте");
                System.out.println("Нажмите 2 чтобы покормить кота");
                System.out.println("Нажмите 3 чтобы поиграть с котом");
                System.out.println("Нажмите 0 чтобы выйти из игры");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        catInfo(name, age, weight, hungry, playDesire);
                        break;
                    case 2:
                        catEating(weight, hungry);
                        break;
                    case 3:
                        catPlaying(playDesire, hungry);
                        break;
                    case 0:
                        System.out.println("Выход из игры");
                        b = false;
                        break;
                }

            }
        }
    }

    public void catInfo(String name, int age, double weight, int hungry, int playDesire) {
        System.out.println("Вашего кота зовут " + name);
        System.out.println("Его возраст " + age + "лет");
        System.out.println("Его вес " + weight + "кг");
        System.out.println("Он сыт на " + hungry + "%");
        System.out.println("Он наигрался на " + playDesire + "%");
    }

    public void catEating(double weight, int hungry) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Нажмите 1 чтобы покормить кота");
        System.out.println("Нажмите 2 чтобы выйти в меню");
        int choice = scanner1.nextInt();
        switch (choice) {
            case 1:
                if (hungry < 70) {
                    this.weight += 0.1;
                    this.hungry += 30;
                    System.out.println("Вы покормили кота его вес теперь " + this.weight + "кг");
                    System.out.println("Он сытый на " + this.hungry + "%");
                }else{
                    System.out.println("Кот не хочет кушать");
                    System.out.println("Он сытый на " + this.hungry + "%");
                }
                break;
            case 2:
                System.out.println("Выход в меню");
                break;
        }
    }

    public void catPlaying(int playDesire, int hungry) {
        if (playDesire < 70 && hungry > 20) {
            this.playDesire += 30;
            this.hungry -= 10;
            System.out.println("Вы поиграли с котом, он наигрался на " + this.playDesire + "%");
            System.out.println("Пока вы играли он немного проголодался, он сыт на " + this.hungry + "%");
        } else {
            System.out.println("Ваш кот не хочет играть, потому что уже наигрался или слишком голоден");
            System.out.println("Он сыт на " + this.hungry + "%");
            System.out.println("Он наигрался на " + this.playDesire + "%");
        }
    }
}