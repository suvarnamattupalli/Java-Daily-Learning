class col
{ 	
	public static void main(String args[])
	{
		int rows=3,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(c);
			}
			System.out.println();	
		}
	}
}


class row
{ 	
	public static void main(String args[])
	{
		int rows=4,cols=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(r);
			}
			System.out.println();	
		}
	}
}


class cont
{ 	
	public static void main(String args[])
	{
		int rows=3,cols=3,temp=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(temp++);
			}
			System.out.println();	
		}
	}
}


class contR
{ 	
	public static void main(String args[])
	{
		int rows=4,cols=4,temp=1;
		for(int r=1;r<=rows;r++)
		{
			temp=r;
			for(int c=1;c<=cols;c++)
			{
				System.out.print(temp++);
			}
			System.out.println();	
		}
	}
}


class DiagCol
{ 	
	public static void main(String args[])
	{
		int rows=5,cols=5,temp=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==c || r+c==rows+1)
				System.out.print(c);
				else
				System.out.print(" ");
			}
			System.out.println();	
		}
	}
}


class DiagRow
{ 	
	public static void main(String args[])
	{
		int rows=5,cols=5,temp=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==c || r+c==rows+1)
				System.out.print(r);
				else
				System.out.print(" ");
			}
			System.out.println();	
		}
	}
}

class Letters
{ 	
	public static void main(String args[])
	{
		int rows=3,cols=5;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(ch++);
			}
			System.out.println();	
		}
	}
}


class LetterCS
{ 	
	public static void main(String args[])
	{
		int rows=5,cols=3;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r%2==0)
				System.out.print((char)(ch+32));
				else
				System.out.print(ch);
				ch++;
			}
			System.out.println();	
		}
	}
}

class LetterDigit
{ 	
	public static void main(String args[])
	{
		int rows=4,cols=4,temp=1;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			temp=r;
			for(int c=1;c<=cols;c++)
			{
				if(r%2==0)
				System.out.print(temp++);
				else
				System.out.print(ch++);
			}
			System.out.println();	
		}
	}
}