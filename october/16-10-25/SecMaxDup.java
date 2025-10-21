class SecMaxDup
{
	public static void main(String args[])
	{
		int[] a= new int[]{10,20,10,30,50,40,30,50};
		boolean[] b=new boolean[a.length];
		int[] x=new int[a.length];
		int count,fmax=0,smax=0;
		System.out.println("Duplicate Elements:");
		for(int i=0;i<a.length;i++)
		{	
			count=0;
			if(b[i])
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}		
			}
			if(count>0)
			{
				x[i]=a[i];
				System.out.print(a[i]+" ");
			}	
		}
		System.out.println("\nSec Max in Dup Ele:");
		for(int i=0;i<a.length;i++)
		{
			if(b[i])
				continue;
			if(x[i]>fmax)
			{
				smax=fmax;
				fmax=x[i];
			}
			else if(x[i]<fmax && x[i]>smax)
				smax=x[i];			
		}
		System.out.print(smax);
	}
}