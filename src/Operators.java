import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        int x = 0;
        int y;
        int z = 0;
        String string = "четыре";
        Scanner s = new Scanner(System.in);
        if(x<=10){
            System.out.println("x<=10");
        }else{
            System.out.println("x>10");
        }

        for(int i = 0; i<3; i++){
            System.out.println("x = "+x);
        }

        while(x<4){
            System.out.println("x = "+x);
            x++;
        }

        while (true){
            System.out.println("break = "+z);
            z++;
            if(z==4){
                break;
            }
        }
        System.out.println("break = " +z);

        for(int i=0;i<=10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i+" это нечетное число");
        }

        switch (string){
            case "ноль" :
                System.out.println("ваше число "+string);
                break;
            case "один" :
                System.out.println("ваше число "+string);
                break;
            case "два" :
                System.out.println("ваше число "+string);
                break;
            case "три" :
                System.out.println("ваше число "+string);
                break;
            case "четыре" :
                System.out.println("ваше число "+string);
                break;
            default:
                System.out.println("no one");
        }

        do{
            System.out.println("Введи число 5");
            y = s.nextInt();
        } while(y!=5);
        System.out.println("Вы ввели 5!");
    }
}