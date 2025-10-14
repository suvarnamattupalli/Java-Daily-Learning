class EvenIndex
{
	public static void main(String args[])
	{
		int[] arr=new int[]{12,13,2,5,4,8,123,543};
		System.out.print("Even Index Elements: ");

		for(int x=0;x<arr.length;x++)
		{	
			if(x%2==0)
			System.out.print(arr[x]+" ");
		}
	}
}