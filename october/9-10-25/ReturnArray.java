class ReturnArray
{
	public static void main(String args[])
	{
		ReturnArray ra=new ReturnArray();
		int[] a=new int[]{10,20,30,40,50};
		int[] b=new int[a.length];
		System.out.println(ra.sumElements(a));
		int[] res=ra.revElements(a,b);
		for(int temp: res)
			System.out.print(temp+"\t");
		
		
	}
	int sumElements(int[] a)
	{
		int sum=0;
		for(int temp: a)
			sum+=temp;
		return sum;
	}
	int[] revElements(int[] a,int[] b)
	{	
		for(int x=0,y=a.length-1;x<a.length;x++,y--)
			b[y]=a[x];
		return b;
	}
}
