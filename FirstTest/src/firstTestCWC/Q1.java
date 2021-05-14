package firstTestCWC;
//copying a string into another without using loops or assignment operators
//correct
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String a=sc.nextLine();
		//StringSystem.out.println("enter another string");
		//b=sc.nextInt();
		//System.out.println(a.concat(b));
		String b=new String(a);
		System.out.println("after copying a to b the string b is "+b);
	}

}
