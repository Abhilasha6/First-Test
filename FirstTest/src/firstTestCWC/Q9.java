package firstTestCWC;
//find the max product of 3 numbers in an integer array
//correct
import java.util.Arrays;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,n,max=1,mult;
		System.out.println("enter the length of array ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of array ");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);//this line sorts the array elements so that always the last 3 consecutive elements will give the max product
		if(n>3 && n<104)
		{
		for(i=0;i<n-2;i++)
		{
			if(arr[i]>-1000 && arr[i]<1000) {
			mult=arr[i]*arr[i+1]*arr[i+2];
			if(mult>max)
				max=mult;
			}
		}
		}
		System.out.println("the maximum product = "+max);
	}

}
