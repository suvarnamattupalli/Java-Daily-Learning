class OrderOfBlock
{
	public static void main(String args[])
	{		
		System.out.println("Main Block");
		OrderOfBlock o=new OrderOfBlock();	//Object creation leads to execute instance block.
	}
	static
	{
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
	{
		System.out.println("Inst Block 2");
	}
	static
	{
		System.out.println("Static Block 2");
	}
}
/*
Static Block
Static Block 2
Main Block
Instance Block
Inst Block 2
*/
