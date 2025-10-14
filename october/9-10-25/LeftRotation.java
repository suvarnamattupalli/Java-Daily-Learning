import java.util.Scanner;
class LeftRotation
{
	public static void main(String args[])
	{
		LeftRotation lr=new LeftRotation();

		int[] a= new int[]{10,20,30,40,50,60,70,80,90,100};
		int[] b= new int[a.length];		//Storing in different Array

		System.out.print("Array: ");
		for(int temp: a)
			System.out.print(temp+" ");

		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter no of Rotations: ");
		int r=sc.nextInt();

		int[] res=lr.leftRot(a,b,r);
		for(int temp: res)	
			System.out.print(temp+" ");	//rotated array is printed
		
	}
	int[] leftRot(int[] a,int[] b,int r) 	//Methof for left Rotation
	{
		int x=r,y=0;
		for(;x<a.length;x++,y++) //from r to end elements stored in b array
		{
			b[y]=a[x];
		}
		for(x=0;x<r;x++,y++)	//from first to r elements stored in b array
		{
			b[y]=a[x];
		}
		return b;
	}
	
}

/*Output
Array: 10 20 30 40 50 60 70 80 90 100
Enter no of Rotations: 3
40 50 60 70 80 90 100 10 20 30
*/