class RevArray
{
	public static void main(String args[])
	{
		int[] arr=new int[]{10,20,30,40,50};
		int[] rev=new int[]{10,20,30,40,50};

		int x=0,y=arr.length-1;
		for(;x<arr.length;x++,y--)
		{
			rev[x]=arr[y];
		}
		for(x=0;x<arr.length;x++)
		{
			System.out.print(rev[x]+" ");			
		}
	}
}
/*numMissing
alphabet Mising
fisrt and last ele swap*/