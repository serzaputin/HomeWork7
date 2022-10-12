public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("задание 1");

        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }

        System.out.println("задание 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("задание 3");

        for (int i = 0; i < 17; i = i+2) {
            System.out.println(i);
        }

        System.out.println("задание 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        
        System.out.println("задание 5");

        for (int year = 1904; year <= 2096; year++) {
            if (year%4 == 0 && year%100 != 0 || year%400 == 0){
                System.out.println(year+ " год является високосным");
            }
        }
        System.out.println("задание 6");

        for (int i = 7; i < 98; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("задание 7");

        int nomber = 1;
        System.out.print(nomber + " ");
        for (int i = 0; i < 9; i++) {
            nomber =nomber*2;
            System.out.print(nomber+ " ");
        }
        System.out.println();

        System.out.println("задание 8");

        int savings = 29_000;
        int sum = 0;
        for (int i = 1; i < 12; i++) {
            sum += savings;
            System.out.println("Месяц " +1+ ", сумма накоплений равна " +sum+ " рублей");
        }

        System.out.println("задание 8");

        double sumWithPercens=0;
        double precent = 0.01;
        for (int i = 1; i < 12; i++) {
            sumWithPercens = (sumWithPercens + savings) * (1 + precent);
            System.out.println("Месяц " + i + ", сумма начислений равна " +sumWithPercens+ " рублей");
        }
    }
}
