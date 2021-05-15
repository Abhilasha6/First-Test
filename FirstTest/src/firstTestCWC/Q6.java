package firstTestCWC;
import java.util.Scanner;
//doubt
//2d array sorting in 2 order as per user using switch case
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,k,r,c,ch,row,col,dup;
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
		
		int arrrow[]=new int[r];
		int arrcol[]=new int[c];
		/**(i=0;i<m;i++) // if it doesnt work then write i<c,j<r not i<r,j<c
			for(j=0;j<n;j++)
				arrrow[j]=arr[j][i];
		*/
		switch(ch) {
		case 1:
			System.out.println("elements in ascending order are ");
			for(row=0;row<r-1;row++) 
			{
				for(col=0;col<r-row-1;col++)
				{
					/**int min=arr[row][col];
					for(i=0;i<arr.length;i++)
						if(arr[i][0]<min)
						{
							min=arr[i][0];
							
						}
						*/
				//	if(arr[0][col]>arr[0][col+1]) //if it doesnt work then write[i] instead of[0]					
					if(arrrow[col]>arrrow[col+1])
						{
						dup=arrrow[col];//arr[0][col];
						arrrow[col]=arrrow[col+1];//arr[0][col]=arr[0][col+1];
						arrrow[col+1]=dup;//arr[0][col+1]=dup;
						}
				}
			
			for(j=0;j<r;j++)
				arr[j][i]=arrrow[j];
			}
			for(i=0;i<r;i++)
				for(j=0;j<c;j++)
					arrcol[j]=arr[i][j];
			for(row=0;row<c-1;row++)
			{
				for(col=0;col<c-r-1;col++)
				{
					if(arrcol[col]>arrcol[col+1])
					{
						dup=arrcol[col];
						arrcol[col]=arrcol[col+1];
						arrcol[col+1]=dup;
					}
				}
				for(j=0;j<c;j++)
					arr[i][j]=arrcol[j];
			}
			
			for(i=0;i<r;i++)
				for(j=0;j<c;j++)
					System.out.println(arr[i][j]);
			break;
		case 2:
			System.out.println("the elements in descending order are ");
			
		}
	}

}
