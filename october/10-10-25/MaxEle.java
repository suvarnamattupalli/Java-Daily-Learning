class MaxEle
{
	public static void main(String args[])
	{
		int[] a=new int[]{23,89,90,34,67,83,20};
		

		for(int y=0;y<a.length-1;y++)//0<6 //1<6
		{
		int max=y; //0 //1
		for(int x=y+1;x<a.length-1;x++)//0<6 //1<6 //x=y+1
		{
			if(a[max]<a[x]) //23<89,89<90(2) //89<
				max=x;
		}
		a[max]=a[y]+a[max]; //23+90=103
		a[y]=a[max]-a[y]; //103-23=90
		a[max]=a[max]-a[y]; //103-90=23

		
		for(int temp: a)
			System.out.print(temp+" "); //90 89 23 34 67 83 20
		System.out.println(" ");

		}

		
	}
}
//freq-how many times rep
//dup
//unique