//Елементи, розташовані методом бульбашки зі спадання модулів.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskB5 {
    public static void main(String args[]) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Визначте довжину масиву:");
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = rand.nextInt(200) - 100;
        }
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i< nums.length - 1; i++){
            for (int j = 0; j < nums.length - i - 1; j++){
                if (Math.abs(nums[j]) < Math.abs(nums[j + 1])) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted:");
        System.out.println(Arrays.toString(nums));
    }
}
