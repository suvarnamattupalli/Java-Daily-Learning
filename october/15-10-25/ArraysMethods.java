import java.util.Arrays;
class ArraysMethods
{
	public static void main(String args[])
	{
		int[] a=new int[]{10,30,20,40,50};
		int[] b=new int[]{10,20,30,40,50};

		System.out.print("\nArray a:");
		for(int temp:a)
			System.out.print(temp+" ");

		System.out.print("\nArray b:");
		for(int temp:b)
			System.out.print(temp+" ");
		
		System.out.print("\n\nBefore Sorting: "+Arrays.equals(a,b));

		System.out.print("\n\nArray a sorted: ");
		Arrays.sort(a);
		for(int temp:a)
			System.out.print(temp+" ");
		
		System.out.println("\n\nAfter Sorting: "+Arrays.equals(a,b));

		int search=50;
		System.out.println("\n"+search+" found at index: "+Arrays.binarySearch(a,search));

		Arrays.fill(a,100);
		System.out.print("\nAll Elements in Array a filled/replaced: ");
		for(int temp:a)
			System.out.print(temp+" ");
		
		Arrays.fill(a,1,3,90);
		System.out.print("\n\nRange of Elements in Array a filled/replaced: ");
		for(int temp:a)
			System.out.print(temp+" ");
		
		System.out.print("\n\nCopy of elements into new array c: ");
		int[] c=Arrays.copyOf(b,3);
		for(int temp:c)
			System.out.print(temp+" ");

		System.out.print("\n\nCopying Range of elements into new array c: ");
		int[] d=Arrays.copyOfRange(b,2,5);
		for(int temp:d)
			System.out.print(temp+" ");

	}
}

/*Output
Array a:10 30 20 40 50
Array b:10 20 30 40 50

Before Sorting: false

Array a sorted: 10 20 30 40 50

After Sorting: true

50 found at index: 4

All Elements in Array a filled/replaced: 100 100 100 100 100

Range of Elements in Array a filled/replaced: 100 90 90 100 100

Copy of elements into new array c: 10 20 30

Copying Range of elements into new array c: 30 40 50
*/