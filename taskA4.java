//Ввести пароль з командного рядка та порівняти його з рядком-зразком.

import java.util.Scanner;

public class taskA4 {
    public static void main(String args[]) {
        String usr_pswrd = "";
        String pswrd = "admin";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password: ");
        usr_pswrd = scan.nextLine();
        if(usr_pswrd.equals(pswrd)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        }
}