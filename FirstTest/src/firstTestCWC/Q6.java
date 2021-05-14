package firstTestCWC;
import java.util.Scanner;
//doubt
//2d array sorting in 2 order as per user using switch case
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,k,r,c,ch,row,col;
		System.out.println("enter the number or rows and columns in array");
		r=sc.nextInt();
		c=sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("enter the elements in the array ");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				arr[i][j]=sc.nextInt();
		System.out.println("enter 1 if you want to arrange the elements in ascending order or 2 for descending order");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("elements in ascending order are ");
			for(row=0;row<arr.length-1;row++) 
			{
				for(col=0;col<r;col++)
				{
					int min=arr[row][col];
					for(i=0;i<arr.length;i++)
						if(arr[i][0]<min)
						{
							min=arr[i][0];
							
						}
				}
				
			}
			
		}
	}

}
