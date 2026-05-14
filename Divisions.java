import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Divisions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = getSizeFromUser(scan);
        int[] nums = generateArray(size);
        System.out.println("Згенерований масив: " + Arrays.toString(nums));
        int div = getDivisor(scan);
        System.out.println("Числа, що діляться на " + div + ":");
        printDivisibleNumbers(nums, div);
    }

    public static int getSizeFromUser(Scanner scanner) {
        while (true) {
            System.out.println("Визначте довжину масиву:");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n > 0) {
                    return n;
                } else {
                    System.out.println("Розмір має бути більшим за 0!");
                }
            } else {
                System.out.println("Це не ціле число! Спробуйте ще раз:");
                scanner.next();
            }
        }
    }

        public static int[] generateArray ( int size){
            Random rand = new Random();
            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = rand.nextInt(200);
            }
            return nums;
        }

        public static int getDivisor (Scanner scanner){
            System.out.println("Введіть дільник:");
            while (!scanner.hasNextInt()) {
                System.out.println("Будь ласка, введіть ціле число:");
                scanner.next();
            }
            return scanner.nextInt();
        }

        public static void printDivisibleNumbers ( int[] array, int divisor){
            if (divisor == 0) {
                System.out.println("Неможливо поділити на 0!");
                return;
            }
            boolean found = false;
            for (int num : array) {
                if (num % divisor == 0) {
                    System.out.print(num + " ");
                    found = true;
                }
            }

            if (!found) {
                System.out.print("Таких чисел немає.");
            }
            System.out.println();
        }
    }