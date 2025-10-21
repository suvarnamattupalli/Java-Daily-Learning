import java.util.Scanner;
class DynamicArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows & columns: ");
		int[][] a = new int[sc.nextInt()][sc.nextInt()]; //for JAGGED ARRAY take only rows input here.
		for(int r=0;r<a.length;r++)
		{
			/*System.out.print("Enter no of elements in "+ (r+1) +" row"); //for JAGGED ARRAY
			a[r]=new int[sc.nextInt()]; */
			System.out.print("Enter elements: ");
			for(int c=0;c<a[r].length;c++)
				a[r][c]=sc.nextInt();		
		}

		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"\t");
			}
			System.out.println();
		}
	}
}
