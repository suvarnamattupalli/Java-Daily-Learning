class SumArray
{
	public static void main(String args[])
	{
		int[][] a= new int[][]{{1,2},{3,4},{5,6}};
		int sum=0;
		System.out.println("2D Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<a.length;i++)
		{
			sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("Sum of Sub Array, row->"+ i +": "+sum);

		}
		//System.out.println("Sum of Array: "+sum);


	}
}