import java.util.Scanner;
class SumOfTwoNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,s;
		System.out.print("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		s = a + b;
		System.out.print("Sum of two number is: " +s);
	}
}