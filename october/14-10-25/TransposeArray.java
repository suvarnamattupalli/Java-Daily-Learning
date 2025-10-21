class TransposeArray
{
	public static void main(String args[])
	{
		int[][] a= new int[][]{{1,2,3},{4,5,6}};
		System.out.println("2D Array");
		for(int r=0;r<a.length;r++) //0<2 
		{
			for(int c=0;c<a[r].length;c++) //0<3 //1<3 //2<3 //3<3F
			{
				System.out.print(" "+a[r][c]+" ");
			}
			System.out.println();
		}

		System.out.println("Transpose Array");
		int x=a.length;
		int y=a[0].length;
		for(int i=0;i<y;i++) //0<3 //1<3 //2<3   //3<3F
		{
			for(int j=0;j<x;j++)//0<2 //1<2   //2<2F
			{
				System.out.print(" "+a[j][i]+" "); //0 0 | 1 0    //0 1 | 1 1   //0 2 | 1 2
			}
			System.out.println();
		}

	}
}