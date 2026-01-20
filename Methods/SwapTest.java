package Methods;
import java.util.Scanner;
public class SwapTest {
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value a =");
        int x= sc.nextInt();
        System.out.println("Enter a value b = ");
        int y= sc.nextInt();
        Swap(x,y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
