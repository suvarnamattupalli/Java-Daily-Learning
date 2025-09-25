class Param
{ 	
	void noReturn(int num)
		{
			System.out.println(num);
		}
	int calAdd(int x,int y)
		{
			x+=y;
			return x;
		}
	public static void main(String args[])
	{
			Param p=new Param();
			p.noReturn(3);
			System.out.print(p.calAdd(3,2));
	}
}
