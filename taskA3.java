/*3. Вивести задану кількість випадкових чисел з переходом та без переходу на новий рядок.*/
import java.util.Random;
import java.util.Scanner;

public class taskA3 {
    public static void main(String args[]) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("скільки рандомних чисел ви хочете згенерувати? ");
        num = scan.nextInt();
        Random rand = new Random();
        for (int i = 0; i <num; i++){
            System.out.print(rand.nextInt(100) + " ");
        }
        for (int i = 0; i <num; i++){
            System.out.print("\n" + rand.nextInt( 100));
        }
    }
}