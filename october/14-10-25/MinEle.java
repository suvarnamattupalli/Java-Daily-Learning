class MinEle
{
	public static void main(String args[])
	{
		int[] a= new int[]{6,7,9,2,3};
		System.out.print("Array: ");
		for(int temp: a)
			System.out.print(temp+" ");
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<a[min]) //7<6F //9<6F //1<6T
				min=i;		
		}
		System.out.print("\nMin Element: "+a[min]);

	}		
}