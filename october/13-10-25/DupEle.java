class DupEle
{
	public static void main(String args[])
	{
		int[] arr=new int[]{10,20,20,30,40,50,50};

		System.out.println("Original Array: ");
		for(int temp: arr)
			System.out.print(temp+" ");

		System.out.println("\nDuplicate Elements: ");

		for(int i=0;i<arr.length;i++) 
		{
			int count=0;
			for(int x=i+1;x<arr.length;x++)
			{
				if(arr[i]==arr[x])
				{
					count++;
					System.out.println(arr[i]);	
				}
			}
		}		
		
	}
}
