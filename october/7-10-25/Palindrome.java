import java.util.Scanner;
class Palindrome
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[5];
		System.out.print("Enter array elements: ");
	
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=sc.nextInt();
		}		
		for(int x=0;x<arr.length;x++)
		{
			int num=arr[x],rev=0,temp=num;
			while(num!=0)
			{
				rev=rev*10+(num%10);
				num/=10;
			}
			System.out.println(rev==temp?"Pal: "+temp:"Not Pal: "+temp);
		}
	}
}