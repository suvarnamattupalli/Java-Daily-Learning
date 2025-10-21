class DiagArray
{
	public static void main(String args[])
	{
		int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
				if(i==i)
				sum+=a[i][i];
		}
		System.out.println\(sum);
		int sum1=0;
		for(int x=0,j=a.length-1;x<a.length;x++,j--)
		{
				sum1+=a[x][j];
		}
		System.out.print(sum1);

	}
}