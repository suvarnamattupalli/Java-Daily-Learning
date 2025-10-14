class Linear
{
	public static void main(String args[])
	{
		int[] a=new int[]{10,50,30,40,50,60,10,80,50};
		int search=10,count=0,c=0;
		boolean b=false;
		int x,y=0;
		for(x=0;x<a.length;x++)
		{
			if(a[x]==search)
			{
				b=true;
				//System.out.println("Found at Index: "+x);
				count++;
				y=x;
				if(count==1)
					System.out.println("First time ele found at index: "+x);
			}
			
		}	
		System.out.println(b?"Last time ele found at index "+y: " No last ele");
		System.out.print(b==true?"found: "+count+" times":"not found");
		
	}
}