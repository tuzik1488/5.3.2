public class Main {
    public static void main(String[] args) {

        for (int i = 500; i <= 650; i += 10) {
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------------------------");
        int j = 500;
        while (j <= 650) {
            System.out.println(j);
            j += 10;
        }
        System.out.println("----------------------------------------------------------------------");
        int p = 500;
        do {
            System.out.println(p);
            p += 10;
        } while (p <= 650);

        System.out.println("-----------------------------------2 завдання-----------------------------------");

        int a = 2; // Початкове
        int n = 1; // Номер послідовності

        while (2 * a - 1 < 5000) {
            System.out.println(n + ". " + (2 * a - 1));
            a++;
            n++;
        }

        System.out.println("-----------------------------------3 завдання-----------------------------------");

        int number = 10; // Введіть число

        System.out.println("Дільники числа " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        System.out.println("-----------------------------------4 завдання-----------------------------------");

        int number1 = 10;
        int factorial = 1;

        for (int i = 1; i <= number1; i++) {
            factorial *= i;
        }

        System.out.println("Факторіал числа " + number1 + " = " + factorial);

        int number3 = 10;
        int factorial1 = 1;
        int i = 1;

        while (i <= number3) {
            factorial1 *= i;
            i++;
        }

        System.out.println("Факторіал числа " + number3 + " = " + factorial1);


        System.out.println("-----------------------------------5 завдання-----------------------------------");

        int count = 0;

        // Перебір годин
        for (int hours = 0; hours < 24; hours++) {
            // Перебір хвилин
            for (int minutes = 0; minutes < 60; minutes++) {
                // Перевірка
                if (hours / 10 == minutes % 10 && hours % 10 == minutes / 10) {
                    count++;
                }
            }
        }
        System.out.println("Кількість симетричних комбінацій: " + count);
    }
}