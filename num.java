import java.util.Scanner;
public class num {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number :");
        int num=sc.nextInt();
        if (num>0){
            System.out.println("the number is positive");
        }
        else if (num<0) {
            System.out.println("the number is negative");
        }
        else{
            System.out.println("the number is zero");
        }
        sc.close();
    }
}
