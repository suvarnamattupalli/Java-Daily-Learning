class Sort //Selection Sort
{
	public static void main(String args[])
	{
		int[] a=new int[]{23,89,90,34,67,83,20};
		int temp1=0;
		for(int y=0;y<a.length;y++)
		{

		int min=y; 
		for(int x=y+1;x<a.length;x++)
		{
			if(a[min]>a[x])
				min=x;
		}
		temp1=a[min]; //temp=20
		a[min]=a[y]; //min=23
		a[y]=temp1; //y=20
		}
		for(int temp: a)
			System.out.print(temp+" "); 
		System.out.println(" ");

		
	}
}