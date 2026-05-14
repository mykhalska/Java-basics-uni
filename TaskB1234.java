//Ввести з консолі n цілих чисел. На консоль вивести: Парні та непарні числа.
// Найбільше та найменше число.
//Числа, які поділяються на 3 чи на 9.
//Числа, які поділяються на 5 та на 7.

import java.util.Arrays;
import java.util.Scanner;

public class TaskB1234 {
    public void main(String args[]){
        int nums[] = new int[50];
        System.out.println("Цілі числа:");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++){
            nums[i] = i;
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nПарні числа:");
        for (int i = 0; i < nums.length; i++){
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nНепарні числа:");
        for (int i = 0; i < nums.length; i++){
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nЧисла, що поділяються на 3 чи 9:");
        for (int i = 0; i < nums.length; i++){
            if(i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nЧисла, що поділяються на 5 та 7:");
        for (int i = 0; i < nums.length; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nНайбільше число:");
        Arrays.sort(nums);
        int highest = nums[nums.length - 1];
        System.out.println(highest);
        System.out.println("Наменше число:");
        int lowest = nums[0];
        System.out.println(lowest);
    }
}
