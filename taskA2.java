/*2. Відобразити у вікні консолі аргументи командного рядка у зворотному порядку.*/

public class taskA2 {
    public static void main(String args[]) {
            for(int i = args.length - 1; i > -1; --i) {
                System.out.println(args[i]);
            }
    }
}