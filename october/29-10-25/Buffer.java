class Buffer
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer("hello");

		System.out.println("Original String1: "+s);

		s.append("all");
		s.append(1);
		s.append(true);
		System.out.println("append() - "+s);

		StringBuffer sb = new StringBuffer("hello");

		System.out.println("Original String2: "+sb);

		sb.insert(0,1);
		sb.insert(0,"hii ");
		System.out.println("insert(index,value) - "+sb);
		
		sb.setCharAt(5,'z');
		System.out.println("setCharAt(index,char) - "+sb);

		sb.delete(2,4);//4 is excluded
		System.out.println("delete(start,end index) - "+sb);
	
		sb.deleteCharAt(0);
		System.out.println("deleteCharAt(index) - "+sb);

		sb.reverse();
		System.out.println("reverse() - "+sb);

		System.out.println("length - "+sb.length());

		sb.setLength(4);
		System.out.println("setLength(length) - "+sb.length());
		System.out.println("String - "+sb);

	}			
}
