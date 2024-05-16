package ders7;

import java.util.Arrays;

public class arraysDemoHOme {

    public static void main(String[] args) {

        int[] numbers = new int[4];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        System.out.println("Massivin elementləri:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("---------------------------");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int a = numbers.length;
        double massivinEdediOrtasi = (double) sum / a;
        System.out.println("Massivin ədədi ortası: " + massivinEdediOrtasi);

        System.out.println("----------------------------");

        int minimumElement = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimumElement) {
                minimumElement = numbers[i];
            }
        }
        System.out.println("Minimum element: " + minimumElement);
        System.out.println("-------------------------------------");

        int maksimumElement = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maksimumElement) {
                maksimumElement = numbers[i];
            }
        }
        System.out.println("Maksimum element: " + maksimumElement);
        System.out.println("---------------------------------------");

        System.out.print("Tək elementlər: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Cüt elementlər: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------");

        System.out.println("Sadə ədədlər:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------");

        Arrays.sort(numbers);
        System.out.print("Massivin azalan sıra ilə: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

     //Chatgpt

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
