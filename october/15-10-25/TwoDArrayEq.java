import java.util.Arrays;
class TwoDArrayEq
{
	public static void main(String args[])
	{
		int[][] a=new int[][]{{1,2,3},{4,5,6}};
		int[][] b=new int[][]{{1,2,3},{4,5,6}};
		System.out.print("Checking 2D Array equal or not - "+Arrays.deepEquals(a,b));
	}
}