class InsertEle
{
	public static void main(String args[])
	{
		int[] arr=new int[]{10,20,30,40,50,60};
		int insert=35;
		int ele=40,count=0;
		int index=3;
		
		System.out.println("Original Array");
		for(int temp: arr)
			System.out.print(temp+" ");

		for(int i=0;i<arr.length;i++)
		{
			count++;
			if(arr[i]==ele)
				break;	
		}
		
		for(int i=arr.length-1;i>count-1;i--) 
			arr[i]=arr[i-1];

		arr[count-1]=insert;
		
		System.out.println("\nAfter Insertion");
		for(int temp: arr)
			System.out.print(temp+" ");
		
	}
}