class TypeCasting
{ 	
	
	void calM1(int b)
		{
			System.out.println("int");
		}
	void calM1(byte b)
		{
			System.out.println("byte");
		}
	void calM1(long b)
		{
			System.out.println("long");
		}
	void calM1(double b)
		{
			System.out.println("double");
		}
	void calM1(float b)
		{
			System.out.println("float");
		}
	public static void main(String args[])
	{
			short b=54;
			ch c=new ch();
			c.calM1(b);
	}
}
