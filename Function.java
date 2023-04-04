package Functions;
import java.util.Scanner;
public class Function {
	Scanner sc = new Scanner(System.in);
	void greater() {
		System.out.println("Enter the first number - ");
		int x = sc.nextInt();
		System.out.println("Enter the second number - ");
		int y = sc.nextInt();
		System.out.println("Enter the third number - ");
		int z = sc.nextInt();
		int max =(x>=y)?(x>=z)?x:z : ((y>=z)? y:z);
		System.out.println("The greater value is- " +max);
	}
	void greater(int a ,int b) {
		int max =(a>=b)? a:b ;
		System.out.println("Function with two arguments");
		System.out.println("The greater value is-  " +max);
	}
	void greater(int a , int b, int c) {
		int max =(a>=b)?(a>=c)?a:c : ((b>=c)? b:c);
		System.out.println("Function with three arguments");
		System.out.println("The greater value is- " +max);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Function f = new Function();
		f.greater();
		f.greater(35, 36);
		f.greater(23, 44, 45);
	}

}
