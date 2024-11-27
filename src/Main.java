public class Main {

    public static void printQuest(int a) {
        System.out.println();
        System.out.println("Задача " + a);
    }

    // 1 Задача

    public static void chekYear(int year) {

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    // 2 Задача

    public static void chekApp(int clientDeviceYear, int clientOS) {

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }

    }

    // 3 Задача

    public static int deliveryCheck(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 21) {
            deliveryTime = 1;
        } else if (deliveryDistance < 61) {
            deliveryTime = 2;
        } else if (deliveryDistance < 101) {
            deliveryTime = 3;
        }

        return deliveryTime;
    }


    public static void main(String[] args) {

        // 1 Задача
        printQuest(1);
        chekYear(2001);

        // 2 Задача
        printQuest(2);
        int year = 2013;
        int clientOS = 1;
        chekApp(year, clientOS);

        // 3 Задача
        printQuest(3);
        int time = deliveryCheck(101);
        if (time != 0) {
            System.out.println("Потребуется дней: " + time);
        } else {
            System.out.println("Доставка недоступна");
        }


    }


}