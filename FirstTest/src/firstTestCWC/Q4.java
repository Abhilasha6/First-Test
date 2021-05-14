package firstTestCWC;
import java.util.Scanner;
//adding 2 numbers without using + operator
//correct answer
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a,b,i;
		System.out.println("enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=1;i<=b;i++)
			a++;
		System.out.println("their sum = "+a);
	}

}
