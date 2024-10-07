import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер числа Фібоначчі: ");
        int n = scanner.nextInt();

        // Додаткове обмеження для запобігання негативним індексам
        if (n < 0) {
            System.out.println("Номер числа Фібоначчі має бути невід'ємним.");
        } else {
            // Початок заміру часу
            long startTime = System.nanoTime();

            // Обчислення числа Фібоначчі
            int result = fibonacci(n);

            // Кінець заміру часу
            long endTime = System.nanoTime();
            long durationInNano = endTime - startTime;  // Різниця часу в наносекундах
            double durationInMillis = durationInNano / 1_000_000.0; // Переведення у мілісекунди

            // Виведення результату
            System.out.println("Число Фібоначчі №" + n + " дорівнює: " + result);
            System.out.println("Час обчислення: " + durationInMillis + " мс");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // Використання ітеративного підходу для оптимізації
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}
