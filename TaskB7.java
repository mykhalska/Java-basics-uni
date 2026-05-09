//Найбільший спільний дільник та найменше загальне кратне цих чисел.

import java.util.ArrayList;
import java.util.Random;

public class TaskB7 {
    public static void main(String[] args){
        int[] nums = new int[2];
        Random rand = new Random();
        ArrayList<Integer> div1 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        for(int i = 0; i < 2; i++ ){
            nums[i] = rand.nextInt(100);
        }
       System.out.println("числа:" + nums[0] + " " + nums[1]);
//        if(nums[0]<nums[1] && nums[1] % nums[0] == 0){
//            System.out.println("НСД = " + nums[0]);
//        }
        for(int i = 1; i < nums[0] + 1; i++){
            if(nums[0] % i == 0){
                div1.add(i);
            }
        }
        System.out.println(div1);
        for(int i = 1; i < nums[1] + 1; i++){
            if(nums[1] % i == 0){
                div2.add(i);
            }
        }
        System.out.println(div2);
        div1.retainAll(div2);
        int res = div1.get(div1.size() - 1);
        System.out.println("НСД= " + res);
        int hgst = (nums[0] * nums[1]) / res;
        System.out.println("НЗК= " + hgst);
    }
}
