class Payment
{
	public static void main(String args[])
	{
		int payment=10000;
		String p_mode,t_mode;
		double discount=0;

		p_mode="online"; //online or offline or both
		t_mode="card"; //upi or card or cash
		
		/*if(p_mode=="online")
		{
			if(t_mode=="upi")
			{
				discount=15.0/100*payment; //upi
			}else
			{
				discount=10.0/100*payment; //card or wallet, if cash it is error

			}
		}else 		//offline or both
		{
			if(t_mode=="cash")
			{
			discount=5.0/100*payment; //cash
			}else
			{
			discount=0; //both
			}
		}

		
		if(p_mode=="online")
		{
			discount=(t_mode=="upi")?(15.0/100*payment):(10.0/100*payment);
		}else 		//offline or both
		{
			discount=(t_mode=="cash")?(5.0/100*payment):(0);
		}*/



		discount=(p_mode=="online")?((t_mode=="upi")?(15.0/100*payment):(10.0/100*payment)):((t_mode=="cash")?(5.0/100*payment):(0));





		
		double bill=payment-discount;
		System.out.println("Payment amount = "+ bill);
	}
}




