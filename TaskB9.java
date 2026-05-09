//Відсортовані числа у порядку зростання та спадання.

import java.util.Arrays;
import java.util.Random;

public class TaskB9 {
    public static void main(String args[]) {
        Random rand = new Random();
        int[] nums = new int[20];
        for (int i = 0; i < 20; i++) {
            nums[i] = rand.nextInt(200) - 100;
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
