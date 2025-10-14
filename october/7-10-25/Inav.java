class Inav
{
	public static void main(String args[])
	{
		int[] arr=new int[]{199,10,67,8,55,1};
		for(int x=0;x<arr.length;x++)
		{
			int num=arr[x];
			while(num>=9)
			{
				int sum=0;
				while(num!=0)
				{
					sum=sum+num%10;
					num/=10;
				}
				num=sum;
				//System.out.print(num);
			}
			System.out.println(num==1?"Inav "+num:"Not Inav "+num);
		}
	}
}