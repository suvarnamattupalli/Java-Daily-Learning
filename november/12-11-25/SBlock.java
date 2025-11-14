class SBlock
{
	public static void main(String args[])
	{		
		System.out.println("Main Block");
	}
	static	//It will be exec without call.
	{
		System.out.println("static block"); //Wherever Static members present,bef exec, these will be loaded.
	}
}
/*
static block
Main Block
*/