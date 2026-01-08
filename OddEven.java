import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

          System.out.println("Enter A Number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("This is even number");
        }else{
            System.out.println("This is odd number");
        }
        sc.close();
    }
}
