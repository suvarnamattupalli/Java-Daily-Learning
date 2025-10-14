class Delete
{
	public static void main(String args[])
	{
		int[] arr=new int[]{30,20,30,40,50,60};
		int ele=30,x=0;
		

		System.out.println("Original Array");
		for(int temp: arr)
			System.out.print(temp+" ");

		for(x=0;x<arr.length-1;x++)
		{
			if(arr[x]==ele)	
			for(int i=x;i<arr.length-1;i++)
				arr[i]=arr[i+1];
		}

		System.out.println("\nAfter Deletion");
		for(int temp: arr)
			System.out.print(temp+" ");		
	}
}