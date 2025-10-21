import java.util.Scanner;
class SortSearch
{
	public static void main(String args[])
	{
		SortSearch ss=new SortSearch();
		int[] a= new int[7];
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Elements in Array");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();

		System.out.println("Sorted Array");
		int[] sort=ss.sortElements(a);
		for(int temp: sort)
			System.out.print(temp+" " );
		
		 ss.searchElements(sort);
	}
	int[] sortElements(int[] a)
	{
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
		return a;
	}
	void searchElements(int[] a)
	{

		int low=0,mid=0,high=0,search=0;
		search=12;
		low=0;
		high=a.length-1;

		while(low<=high)
		{
		mid=(low+high)/2;

		if(a[mid]==search)
		{
			System.out.print("\nFound at index:"+ mid);
			break;
		}
		else if(a[mid]<search)	//Move to right side
			low=mid+1;
	
		else if(a[mid]>search)	//Move to left side
			high=mid-1;
		
		else
			System.out.print("Element "+search+" Not Found");
		}
	}
}