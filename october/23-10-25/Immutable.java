class Immutable 
{
    public static void main(String args[]) 
	{
        //Immutable String
	String s1="helloall";
	System.out.println("String s1 \"" + s1 + "\" is " + System.identityHashCode(s1)); //scp
        String s = "hello"; 
        System.out.println("String s \"" + s + "\" is " + System.identityHashCode(s)); //scp 
        s = s.concat("all"); // creates a new String object
        System.out.println("String s \"" + s + "\" is " + System.identityHashCode(s)); //heap
	s=s.intern();
	System.out.println("String s \"" + s + "\" is " + System.identityHashCode(s) + "\n"); //scp

        // Mutable StringBuffer
        StringBuffer buffer = new StringBuffer("i am buffer"); 
        System.out.println("StringBuffer buffer \"" + buffer + "\" is " + System.identityHashCode(buffer)); //heap
        buffer.append(" hello"); // modifies the same object
        System.out.println("StringBuffer buffer \"" + buffer + "\" is " + System.identityHashCode(buffer) + "\n"); //heap

        // Mutable StringBuilder
        StringBuilder builder = new StringBuilder("i am builder");
        System.out.println("StringBuilder \"" + builder + "\" is " + System.identityHashCode(builder)); //heap
        builder.append(" hello"); // modifies the same object
        System.out.println("StringBuilder \"" + builder + "\" is " + System.identityHashCode(builder)); //heap
    }
}