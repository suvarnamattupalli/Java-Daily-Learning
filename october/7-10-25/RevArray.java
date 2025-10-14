import java.util.Scanner;
class RevArray
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);

		int[] arr=new int[5];
		System.out.print("Enter:");

		for(int x=0;x<=arr.length-1;x++)
			arr[x]=sc.nextInt();

		System.out.print("Reverse of Array:");
		for(int x=arr.length-1;x>=0;x--)
		{
			System.out.print(arr[x]+" ");
		}
	}
}