class CopyEleArr
{
	public static void main(String args[])
	{
		int[] a=new int[]{12,13,14,16};
		int[] b=new int[a.length];

		for(int i=0;i<a.length;i++)
			b[i]=a[i];

		System.out.println("Copying");
		for(int temp:b)
			System.out.print(temp+" ");

		for(int i=a.length-1,j=0;i>=0;i--,j++)
			b[i]=a[j];

		System.out.println("\nCopying in Reverse");
		for(int temp:b)
			System.out.print(temp+" ");	
	}
			
}