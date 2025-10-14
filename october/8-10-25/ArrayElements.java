class ArrayElements
{ 	
	public static void main(String a[])
	{
		String[] str = new String[]{"Hello","all","good","morning","Have","a","great","day"};
		System.out.println("First ele: "+str[0]);
		System.out.println("Mid ele: "+str[(str.length-1)/2]);
		System.out.println("Last ele: "+str[str.length-1]);	
	}
}
