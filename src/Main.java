//public class Main {
//
//    public static void main(String[] args) {
//       Factorial ob = new Factorial();
//       System.out.println(ob.factorial(3));
//    }
//}
// class Factorial {
//     int factorial (int n){
//         int result;
//         if(n==1) return 1;
//         result = factorial(n-1) * n;
//         return result;
//     }
//}

//public class Main{
//    int method(int a, int b){
//        return a+b;
//    }
//    double method (double c){
//     return c;
//    }
//    public static void main(String[] args) {
//        Main f = new Main();
//        System.out.println(f.method(1,2));
//    }
//}

//import java.util.Scanner;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово для проверки на палиндром: ");
//        String input = scanner.nextLine();
//        PolidromCheck f = new PolidromCheck();
//        System.out.println(f.check(input.toCharArray(), 0, input.length() - 1));
//    }
//}
//
//class PolidromCheck {
//    // Рекурсивный метод для проверки на палиндром
//    boolean check(char[] n, int start, int end) {
//        // Базовый случай: если стартовый индекс больше или равен конечному
//        if (start >= end) {
//            return true; // это палиндром
//        }
//
//        // Если символы на текущих позициях совпадают
//        if (n[start] == n[end]) {
//            // Рекурсивный вызов для следующей пары символов
//            return check(n, start + 1, end - 1);
//        }
//
//        // Если символы не совпадают, то это не палиндром
//        return false;
//    }
//}


//import java.util.ArrayList;
//import java.util.Arrays;

//class Main{
//    static void vaTest(int ... f){
//        System.out.print("Количество: " + f.length + " содержание: ");
//       for(int x : f){
//           System.out.print(x + " ");
//       }
//    }
//    public static void main(String[] args) {
//        vaTest(12,54,1,43,65,23,87,45);
//    }
//}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//class Main {
//    static int recurse(int[] array, int index, int value) {
//        // Базовый случай: если индекс вышел за границы массива
//        if (index >= array.length) {
//            System.out.println("Его нет в массиве");
//            return -1;
//        }
//
//        // Если элемент найден, возвращаем его индекс
//        if (array[index] == value) {
//            System.out.println("Вот индекс: " + index);
//            return index;
//        }
//
//        // Рекурсивный вызов для следующего индекса
//        return recurse(array, index + 1, value);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число для поиска: ");
//        int answer = scanner.nextInt();
//
//        // Массив для поиска
//        int[] arr = new int[]{5,10,40,6,100,90};
//
//        // Начинаем поиск с индекса 0
//        recurse(arr, 0, answer);
//    }
//}

//

