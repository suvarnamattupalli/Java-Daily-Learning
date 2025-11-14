/*class Abstraction
{
	public static void main(String args[])
	{
		Abstraction a= new Abstraction();
	}
	void m2();
}

 error: missing method body, or declare abstract
        void m2();
*/

/*class Ab
{
	public static void main(String args[])
	{
		Ab a= new Ab();
	}
	abstract void m2();
}
 error: Ab is not abstract and does not override abstract method m2() in Ab
class Ab
*/

abstract class Ab
{
	public static void main(String args[])
	{
		Ab a= new Ab();
	}
	abstract void m2();
}
 /*error: Ab is abstract; cannot be instantiated
                Ab a= new Ab();
*/

/*abstract class Ab
{
	public static void main(String args[])
	{
	}
	abstract void m2();
}
//No error but to implement abstract method we need to override by extend it.
*/


