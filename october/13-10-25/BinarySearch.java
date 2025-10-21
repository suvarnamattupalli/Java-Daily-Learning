class BinarySearch
{
	public static void main(String args[])
	{
		int[] a=new int[]{2,5,7,9,10,12,16,19};
		int low=0,mid=0,high=0,search=0;
		search=12;
		low=0;
		high=a.length-1;

		System.out.print("Array: ");
		for(int temp: a)
			System.out.print(temp+" ");

		while(low<=high)
		{
		mid=(low+high)/2;

		if(a[mid]==search)
		{
			System.out.print("\nFound at index: "+mid);
			break;
		}

		else if(a[mid]<search)	//Move to right side
			low=mid+1;
	
		else if(a[mid]>search)	//Move to left side
			high=mid-1;
		
		else
			System.out.print("Element Not Found");
		}
	}
}