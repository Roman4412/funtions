import java.time.LocalDate;

public class Main {
    public static int currentYear = LocalDate.now().getYear();
    public static void main(String[] args) {
        int year = currentYear;
        int deliveryDistance = 95;
        isLeapYear(year);
        determinateAppVersion(0, currentYear);
        System.out.println("Потребуется дней для доставки: " + getDeliveryTime(deliveryDistance));
    }
    public static void isLeapYear(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным!");
        }
        else {
            System.out.println("Год не является високосным!");
        }
    }
    public static void determinateAppVersion(int systemType, int yearOfIssue) {
        if (systemType == 1 && yearOfIssue < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (systemType == 1) {
            System.out.println("Установите мобильное приложения для Android по ссылке");
        }
        if (systemType == 0 && yearOfIssue < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (systemType == 0) {
            System.out.println("Установите мобильное приложения для IOS по ссылке");
        }
    }

    public static int getDeliveryTime(int distance) {
        int deliveryTime = 0;
        if (distance <= 20) {
            deliveryTime = 1;
        } else if (distance <= 60) {
            deliveryTime = 2;
        } else if (distance <= 100) {
            deliveryTime = 3;
        }
        return deliveryTime;
    }
}