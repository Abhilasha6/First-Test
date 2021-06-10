package secondTest;
//to create a wave like array out of a given sorted array
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];int k;
		for(int i=0;i<5;i++)
			arr[i]=i+1;
		for(int i=0;i<4;i+=2)
		{
			if((arr[i]<arr[i+1]))
			{
				k=arr[i+1]; arr[i+1]=arr[i];arr[i]=k;
			}
		}
		System.out.println("wave array output = ");
		for(int i=0;i<5;i++)
			System.out.print(arr[i]+" ");
	}
}
