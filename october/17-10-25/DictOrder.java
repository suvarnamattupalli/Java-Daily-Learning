import java.util.Arrays;
class DictOrder
{
	public static void main(String args[])
	{	
		String s= new String("Java is a Object oriented Prog lang");
		char[] c=s.toCharArray();
		String temp="";
		//Arrays.sort(c);
		int min=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
				continue;
			else
				temp=temp+c[i];
		}	
	}
}