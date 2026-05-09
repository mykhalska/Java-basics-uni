//Прості числа

import java.util.ArrayList;
import java.util.List;

public class TaskB8 {
    public static void main(String[] args){
        ArrayList<Integer> result = new ArrayList<>(List.of(1, 2, 3, 5, 7));
        for(int i =7; i <= 500; i++){
            if(i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0 && i % 7 != 0 && i % 9 != 0 && i % 10 != 0 && i % 11 != 0){
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
