import java.time.LocalDate;

public class Main {

    //Задание 1
    public static void checkLeapYear (int number) {
        if ((number % 4 == 0 && number % 100 != 0) || number % 400 == 0) {
            System.out.println(number + " — високосный год");
        } else {
            System.out.println(number + " — не високосный год");
        }
    }
    //Задание 2
    public static void checkOSAndYear (int OS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (OS == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 1 && year == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }
    //Задание 3
    public static void calculateDeliveryPeriod (int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if  (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else if (distance > 100) {
            System.out.println("Доставка не выполняется в ваш район");
        }
    }
    //Задание 6
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] costs = new int[30];
        for (int i = 0; i < costs.length; i++) {
            costs [i] = random.nextInt(100_000) + 100_000;
        }
        return costs;

    }

    public static int calculateSumOfCosts (int [] costs2) {
        int sum = 0;
        for (int i = 0; i < costs2.length; i++) {
            sum += costs2[i];

        }
        return sum;
    }
    public static void calculateAverageCosts(int [] costs3) {
        double averageCost = (double) (calculateSumOfCosts(costs3) / 30);
        String averageCostRounded = String.format("%.2f",averageCost);
        System.out.println("Средняя сумма трат за месяц составила " + averageCostRounded + " рублей");
    }

    public static void main(String[] args) {
        //Задание 1
        int year = 1800;
        checkLeapYear(year);

        //Задание 2
        int clientOS = 1;
        int clientDeviceYear = 2014;
        checkOSAndYear(clientOS, clientDeviceYear);

        //Задание 3
        int deliveryDistance = 95;
       calculateDeliveryPeriod(deliveryDistance);

       //Задание 6
        int[] costs = generateRandomArray();
        calculateAverageCosts (costs);





    }







}