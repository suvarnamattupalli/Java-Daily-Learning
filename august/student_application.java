class Student
{
	public static void main(String args[])
	{
		String p_name="Pen";
		double p_price= 100;
		String rating="*****";
		int quantity=4;
		double t_price=p_price*quantity;

		double gst=18.0/100*t_price;
		int final_bill=(int)(t_price+gst);
		System.out.println("Product Name: "+p_name);
		System.out.println("Product Price: "+p_price);
		System.out.println("Rating: "+rating);
		System.out.println("Quantity: "+quantity);
		System.out.println("GST: "+gst);
		System.out.println("Final Bill: "+final_bill);
	}
}
		