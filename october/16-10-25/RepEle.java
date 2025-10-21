class RepEle
{
	public static void main(String args[])
	{
		int[] a=new int[]{10,30,20,30,40,40,30};
		boolean[] b=new boolean[a.length];
		int count=0,rep=0,x=0;
		System.out.println("Frequency of Elements:");
		for(int i=0;i<a.length;i++)
		{
			if(b[i])
				continue;
			count=0;
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}
			}
			System.out.println(a[i]+" "+count);
			if(count>rep)
			{
				rep=count;
				x=i;
			}
		}
		System.out.println("Most Repeated ele: "+a[x]+" "+rep+" times");
	}
}