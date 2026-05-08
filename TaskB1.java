//Ввести з консолі n цілих чисел. На консоль вивести: Парні та непарні числа.

import java.util.Scanner;

public class TaskB1 {
    public void main(String args[]){
        int nums[] = new int[7];
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
    }
}
