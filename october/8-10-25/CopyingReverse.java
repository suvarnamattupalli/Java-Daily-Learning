class CopyingReverse
{ 	
	public static void main(String a[])
	{

		int[] i = new int[]{10,20,30,40,50,60};
		int[] copy = new int[i.length]; //6
		
		System.out.println("Original Array:");
		for(int x=0;x<i.length;x++)
			System.out.print(i[x]+" ");	

		for(int x=0,y=copy.length-1;x<i.length;x++,y--)
		{
			copy[y]=i[x];
		}

		System.out.println("\nReverse Copy Array:");

		for(int y=0;y<copy.length;y++)
			System.out.print(copy[y]+" ");
			
	}


	/*void method1()
	{
		int y=0;
		for(int x=i.length-1;x>=0;x--)
		{
			copy[y]=i[x];
			System.out.print(copy[y]+" ");
			y++;
		}
	}*/

	/*void method2()
	{
		int y=copy.length-1;//5
		for(int x=0;x<i.length;x++)
		{
			copy[x]=i[y]; //copy[0]=i[5]=60
			System.out.print(copy[x]+" "); //60
			y--;//
			
		}
	}*/
}


