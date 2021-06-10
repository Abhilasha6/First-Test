package secondTest;
import java.util.*;
//to display the given pattern
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows and number of symbols ");
		int r=sc.nextInt(); int s= sc.nextInt();
		int i,j,k; 
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=s;j++)
			System.out.print("/"+"\\");
			System.out.println();
			if(i<r)
			{
				for(j=1;j<=s;j++)
				{
					System.out.print("|");
					for(k=2;k<j;j++)
						System.out.print("  ");
					System.out.print("|");
				}
			}
			System.out.println();
		}
	}

}
