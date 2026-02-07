import java.util.Scanner;

public class BirthdayWish {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.println(" Happy Birthday " + name + "");
         System.out.println("Wishing you a wonderful year ahead!");
    }
}
