class SecMax
{
	public static void main(String args[])
	{
		SecMax sm= new SecMax();
		//sm.twoLoops();
		//sm.skipValue();
		sm.secMax();
	}
	void twoLoops()
	{
		int a[]= new int[]{60,50,90,60,20};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		System.out.print("Array:");
		for(int temp: a)
			System.out.print(temp+" ");
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.println("\nFirst Max: "+max);
		for(int i=0;i<a.length;i++)
		{
			if(max!=a[i] && smax<a[i])
				smax=a[i];
		}
		System.out.println("Sec Max: "+smax);
	}
	void skipValue() 
	{
		int a[]= new int[]{90,60,50,100,40};
		int max=Integer.MIN_VALUE; //-2^31 //
		int smax=max; //-2^31
		System.out.print("Array:");
		for(int temp: a)
			System.out.print(temp+" ");
		for(int i=0;i<a.length;i++) //0<5 //1<5 //2<5 //3<5 //4<5
		{
			if(max<a[i]) //-2^31<90T //90<60F //90<50F //90<100T //100<40F
				max=a[i];//90 //100
			if(max>a[i] && smax<a[i]) //90>90F //90>60T //90>50 60<50 //100>100F //100>40 60<40F
				smax=a[i]; //-2^31 //60
		}
		//SecMax value is at starting index only,so it got skipped in 2nd if loop.
		System.out.println("\nFirst Max: "+max);
		System.out.println("Sec Max: "+smax);
	}
	void secMax()
	{
		int a[]= new int[]{90,60,50,100,40};
		int max=Integer.MIN_VALUE; //-2^31
		int smax=max; //
		System.out.print("Array:");
		for(int temp: a) 
			System.out.print(temp+" ");
		for(int i=0;i<a.length;i++) //0<5 //1<5 //2<5 //3<5 //4<5
		{
			if(max<a[i]) //-2^31<90T //90<60F //90<50F //90<100T //100<40F
			{
				smax=max; //-2^31 //90
				max=a[i]; //90 //100
			}
			else if(max>a[i] && smax<a[i]) //90>60 -2^31<60T //90>50 60<60F //100>40 90<40F
				smax=a[i]; //60 
		}
		System.out.println("\nSec Max: "+smax);
	}

}