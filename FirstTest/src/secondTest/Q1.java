package secondTest;
import java.util.*;//incomplete
//to find product of min element of 1st array and max element 2nd array
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,n2,i,j,prod=1,min1,max2;
		System.out.println("enter the size of array "); n1=sc.nextInt();
		n2=n1;
		int a[]=new int[n1];
		int b[]=new int[n2];
		System.out.println("enter the elements of first array "); 
		for(i=0;i<n1;i++)
		a[i]=sc.nextInt();
		System.out.println("enter the elements of second array "); 
		for(i=0;i<n1;i++)
		b[i]=sc.nextInt();
		for(i=0;i<n1-1;i++)
		{
			for(j=0;j<n1-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					min1=a[j];
					a[j]=a[j+1];
					a[j+1]=min1;
				}
			}
		}
	//	for(i=0;i<n1;i++)
	//	System.out.println(a[i]+" ");
		for(i=0;i<n1-1;i++)
		{
			for(j=0;j<n1-i-1;j++)
			{
				if(b[j]>b[j+1])
				{
					max2=b[j];
					b[j]=b[j+1];
					b[j+1]=max2;
				}
			}
		}
	//	for(i=0;i<n1;i++)
	//	System.out.println(b[i]+" ");
		prod=a[0]*b[n1-1];
		System.out.println("the product of minimum element of 1st array and maximum element of 2nd array = "+prod);
	}
}
