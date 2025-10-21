class BubbleSort
{
	public static void main(String args[])
	{
		int[] a=new int[]{40,60,90,20,10};
		int temp=0;
		System.out.println("Original Array");
		for(int temp1: a)
			System.out.print(temp1+" ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++) //swapping from 0 to a.length-1-i,bcoz in every iteration last ele is sorted, with true cond.
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		System.out.println("\nSorted Array");
		for(int temp1: a)
			System.out.print(temp1+" ");
		
	}	
}