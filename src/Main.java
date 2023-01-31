import java.time.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean checkIsLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void printLeapYear(int year) {
        String leapString = checkIsLeapYear(year) ? "" : "не";
        System.out.println(year + " год — " + leapString + "високосный год");
    }

    public static void printAppLink(int osType, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < 2007 || year > currentYear) {
            System.out.println("Неверно указан год");
            return;
        }
        String osString = osType == 0 ? "iOS" : "Android";
        String version = year == currentYear ? "приложение" : "облегченную версию приложения";
        System.out.println("Установите " + version + " для " + osString + " по ссылке");
    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (0 < deliveryDistance && deliveryDistance < 20) {
            deliveryTime = 1;
        } else if (deliveryDistance < 60) {
            deliveryTime = 2;
        } else if (deliveryDistance < 100) {
            deliveryTime = 3;
        }
        return deliveryTime;
    }

    public static void printDeliveryTime(int deliveryTime) {
        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        printLeapYear(1900);
        printLeapYear(2000);
        printLeapYear(1999);
        printLeapYear(2024);
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int testYear1 = 2020, testYear2 = 2023, osType1 = 0, osType2 = 1;
        printAppLink(osType1, testYear1);
        printAppLink(osType2, testYear2);
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int deliveryTime1 = calculateDeliveryTime(95), deliveryTime2 = calculateDeliveryTime(101);
        printDeliveryTime(deliveryTime1);
        printDeliveryTime(deliveryTime2);
    }
}
