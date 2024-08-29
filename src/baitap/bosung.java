package baitap;
import java.util.Scanner;
public class bosung {
    public static void main(String[] args) {
		 int a, b;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("nhap a: ");
		 a = sc.nextInt();
		 System.out.println("nhap b: ");
		 b = sc.nextInt();
	        int sum = a+b;
	        int sub = a-b;
	        int multi = a*b;
	        float div = (float)a/b;
	        float modulus = (float)a%b;
	        
	        System.out.println("sum= "+sum);
	        System.out.println("sub= "+sub);
	        System.out.println("multi= "+multi);
	        System.out.println("div= "+div);
	        System.out.println("modulus= "+modulus);
	}
}

