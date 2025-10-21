class RCArray
{
	public static void main(String args[])
	{
		int[][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("2-D Array with index");
		int c =0;
		for(int r=0;r<a.length;r++)
		{
			for(c=0;c<a[r].length;c++)
			{
				System.out.print("a["+r+"]["+c+"]= "+a[r][c]+"\t");
			}
			System.out.println();
		}	
	}
}