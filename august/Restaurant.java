class Restaurant
{
	public static void main(String args[])
	{
		System.out.println("\t \t    Name");
		System.out.println("\t \t kphb,Kukatpally");
		System.out.println("\t \t    phn no");
		System.out.println("--------------------------------------------------");
		System.out.println("Item \t \tPrice \t quantity \t t_price");
		
		String item1="Chicken65";
		double price1=349;
		int quantity1=3;
		double t_price1 = price1*quantity1;
		System.out.println(item1+"\t"+price1+"\t    "+quantity1+"\t\t  "+t_price1);
		
		String item2="Fishfry";
		double price2=400;
		int quantity2=2;
		double t_price2 = price2*quantity2;
		System.out.println(item2+"\t\t"+price2+"\t    "+quantity2+"\t\t   "+t_price2);

		String item3="Naan";
		double price3=70;
		int quantity3=3;
		double t_price3 = price3*quantity3;
		System.out.println(item3+"\t\t"+price3+"\t    "+quantity3+"\t\t   "+t_price3);
		
		String item4="Mix Veg curry";
		double price4=399;
		int quantity4=2;
		double t_price4 = price4*quantity4;
		System.out.println(item4+"\t"+price4+"\t    "+quantity4+"\t\t   "+t_price4);

		System.out.println("--------------------------------------------------");
		
		double total_price=t_price1+t_price2+t_price3+t_price4;
		System.out.println("Total Price \t \t\t \t  "+ total_price);

		double cgst = 9.0/100*total_price;
		System.out.println("cgst(9%) \t \t\t \t   "+ cgst);

		double sgst = 9*total_price/100;
		System.out.println("sgst(9%) \t \t\t \t   "+ sgst);

		System.out.println("--------------------------------------------------");
		
		double gst = cgst+sgst;
		System.out.println("gst(cgst+sgst) \t \t\t \t   "+ gst);

		System.out.println("--------------------------------------------------");

		double bill = gst+total_price;
		System.out.println("Bill \t \t\t \t \t  "+ bill);
		
		double discount = 5.0/100*total_price;
		System.out.println("Discount(5%) \t \t\t \t   "+ discount);

		System.out.println("--------------------------------------------------");
		
		double final_bill=total_price-discount;
		System.out.println("Final Bill \t \t\t \t  "+ final_bill );

	}
}


