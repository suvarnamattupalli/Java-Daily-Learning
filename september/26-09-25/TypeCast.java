class TypeCast
{
	public static void main(String args[])
	{
		TypeCast tc=new TypeCast();
		short y=10;
		tc.q=15;
		tc.calM1(y,y);
		tc.calM1(10.0);
		
	}
	int q;
	void calM1(short x,int z)
	{
		System.out.println("Short "+ x +" & Integer "+ z+" Variable "+q);
	}
	void calM1(double x)
	{
		System.out.println("Double "+ x);
	}
	void calM1(int x)
	{
		System.out.println("Integer "+x);
	}
	
	
}