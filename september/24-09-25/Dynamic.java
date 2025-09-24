import java.util.Scanner;
class Dynamic
{ 	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter double value: ");
		double d=sc.nextDouble();

		System.out.print("Enter float value: ");
		float f=sc.nextFloat();

		System.out.print("Enter String value: ");
		String s=sc.next();
		
		System.out.print("Enter boolean value: ");
		boolean bool=sc.nextBoolean();
		
		System.out.print("Enter long value: ");
		long l=sc.nextLong();
		
		System.out.print("Enter integer value: ");
		int i=sc.nextInt();
		
		System.out.print("Enter byte value: ");
		byte b=sc.nextByte();
		
		System.out.print(d+" "+f+" "+s+" "+bool+" "+l+" "+i+" "+b);
		
	}
}
/*Output
Enter double value: 67
Enter float value: 89
Enter String value: 76
Enter boolean value: true
Enter long value: 0
Enter integer value: 9
Enter byte value: 6
67.0 89.0 76 true 0 9 6*/