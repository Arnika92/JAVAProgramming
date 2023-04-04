package Functions;
import java.util.Scanner;
class Method{
	void cube(int a) {
		System.out.println(a*a*a);
	}
	void square(int b) {
		System.out.println(b*b);
	}
	void greater(int a , int b, int c) {
		int max =(a>=b)?(a>=c)?a:c : ((b>=c)? b:c);
		System.out.println(" " +max);
	}
}
	public class Methods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Method m = new Method();
        System.out.println("Enter the number for cube - ");
        int k =sc.nextInt();
        m.cube(k);
        System.out.println("Enter the number for square  -");
        int l=sc.nextInt();
        m.square(l);
        System.out.println("Number for comparision");
        System.out.println("enter first number -");
        int x=sc.nextInt();
        System.out.println("enter second number -");
        int y=sc.nextInt();
        System.out.println("enter third number -");
        int z=sc.nextInt();
        m.greater(x, y, z);
	}
}
