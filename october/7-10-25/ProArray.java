import java.util.Scanner;
class ProArray
{
	public static void main(String a[])
	{
		int pro=1;

		Scanner sc=new Scanner(System.in);

		int[] arr=new int[5];
		System.out.print("Enter:");

		for(int x=0;x<=arr.length-1;x++)
			arr[x]=sc.nextInt();

		for(int x=0;x<=arr.length-1;x++)
		{
			//System.out.println(arr[x]);
			pro*=arr[x];	
		}
		System.out.println(pro);
	}
}