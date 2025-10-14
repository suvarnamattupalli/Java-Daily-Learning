class EvenOddIndex
{
	public static void main(String args[])
	{
		int a[]=new int[]{11,22,33,44,55,66,77,88,99};
		int b[]=new int[a.length];
		int x,y;
		for(x=0,y=0;x<a.length;x+=2,y++)	//First iterate through odd index elements in a and store in b array
			b[y]=a[x];
		for(x=1;x<a.length;x+=2,y++)		//Next iterate through even index elements in a and store in b array
			b[y]=a[x];
		for(int temp:b)				//Printing b array
			System.out.print(temp+" ");

					
	}
	
}


/*Output
11 33 55 77 99 22 44 66 88
*/
