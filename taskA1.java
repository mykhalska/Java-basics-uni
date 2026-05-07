/*1. Привітання будь-якого користувача під час введення його імені через командний рядок.  */

import java.util.Scanner;

public class taskA1 {
    public static void main(String args[]) {
        {
            String message;
            Scanner scan = new Scanner(System.in);
            System.out.println("Введіть ваше ім'я: ");

                    message = scan.nextLine();
            System.out.println("Вітаю, " + message + "!");
        }
    }
}
