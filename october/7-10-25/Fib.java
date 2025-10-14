class Fib
{
	public static void main(String args[])
	{
		int[] arr=new int[]{10,12,5,18,20};
		for(int i=0;i<arr.length;i++)
		{
		int f=0,s=1,t=0;
		System.out.print(arr[i]+": ");
		for(int x=1;x<=arr[i];x++)
		{
			System.out.print(f+" ");
			t=f+s;
			f=s;
			s=t;
		}
		System.out.println("");
		}	
	}
}