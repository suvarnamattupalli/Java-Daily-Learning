import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		int count=0;
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array elements: ");
		for(int x=0;x<arr.length;x++)
			arr[x]=sc.nextInt();
		for(int x=0;x<arr.length;x++)
		{
		
		int num=arr[x],temp=num,arm=0,temp2=num;
		count=0;
		while(temp!=0)
		{
			count++;	
			temp/=10;	
		}
		while(num!=0)
		{
			arm=arm+(int)Math.pow(num%10,count);
			num/=10;
		}
		if(temp2==arm)
		{
			count++;
			System.out.println("Armstrong: "+arm);	
		}
		}
		System.out.println("No of Armstrongs: "+count);
	}
}