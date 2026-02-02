import java.util.Scanner;
public class rectangel {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the width :");
        float  width=scanner.nextFloat();
        System.out.print("enter the height:");
        float height=scanner.nextFloat();
        float area=width*height;
        System.out.println("the area of rectangle is :"+area);
        scanner.close();
    }
}
