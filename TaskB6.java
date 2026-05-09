//Усі тризначні числа, у десятковому записі яких немає однакових цифр.

import java.util.ArrayList;

public class TaskB6 {
    public static void main(String args[]) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 100; i <= 999; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            if (a != b && a != c && b != c) {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}