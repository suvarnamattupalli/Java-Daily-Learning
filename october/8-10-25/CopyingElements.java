class CopyingElements
{ 	
	public static void main(String a[])
	{

		int[] i = new int[]{10,20,30,40,50,60};
		int[] copy = new int[i.length]; //6
		
		System.out.println("Original Array:");
		for(int x=0;x<i.length;x++)
			System.out.print(i[x]+" ");	

		for(int x=0;x<i.length;x++)
		{
			copy[x]=i[x];
		}

		System.out.println("\nCopy Array:");

		for(int y=0;y<copy.length;y++)
			System.out.print(copy[y]+" ");
			
	}

}


