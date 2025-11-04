class ConcatPlus
{
	public static void main(String args[])
	{
		String s1="hello";
		System.out.println(s1);
		
		System.out.println("\nConcat Method - we can add at - last & String data type only.\n");
		s1=s1.concat(" all");
		System.out.println(s1);
	
		System.out.println("\n+ operator - We can add at - first or last & other data types also.\n");
		s1=s1+'!';
		s1=0+s1;

		System.out.println(s1);
	}
}