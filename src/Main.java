import java.time.LocalDate;

public class Main {
    public static int currentYear = LocalDate.now().getYear();

    public static void main(String[] args) {
        // 1
        int year = currentYear;
        isLeapYear(year);
        // 2
        determinateAppVersion(0, currentYear);
        // 3
        int deliveryDistance = 95;
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней для доставки: " + getDeliveryTime(deliveryDistance));
        } else {
            System.out.println("Доставка только в пределах 100 км!");
        }
    }
    // 1
    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
    }
    // 2
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
    // 3
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