class IBlock
{
	{
		System.out.println("Inst Block 2");
	}
	public static void main(String args[])
	{		
		System.out.println("Main Block");
		IBlock i=new IBlock();	//Object creation leads to execute instance block.
	}
	static
	{
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Block");
	}

	

}
/*
Static Block
Main Block
Inst Block 2
Instance Block
*/