//Ввести цілі числа як аргументи командного рядка, підрахувати їх суми (добутки) та вивести результат на консоль.

public class taskA5 {
    public static void main(String args[]) {
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < args.length; i++){
            int num = Integer.parseInt(args[i]);
            sum += num;
            mult *= num;
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}