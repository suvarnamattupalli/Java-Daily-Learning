class JaggedArray
{
	public static void main(String args[])
	{
		int[][] a = new int[][]{{1,2,3},{4,5,6,7},{8,9}};
		System.out.println("Jagged 2-D Array");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}	
	}
}