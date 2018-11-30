package oops;

 class Account {
	 int acc_no;
	 String name;
	 float amount;
	 void insert(int a,String n,float amt)
	 {
		 acc_no=a;
		 name=n;
		 amount=amt;
	 }
      void deposit(float amt)
      {
    	 amount=amount+amt;
    	 System.out.println(amt+"deposited");
      }
      void withdraw(float amt)
      {
    	  if(amount<amt)
    	  {
    		  System.out.println("insufficient balance");
    	  }
    	  else
    	  {
    		  amount=amount-amt;
    		  System.out.println(amt+"withdrawn");
    	  }
      }
      void chekBalance()
      {
    	  System.out.println("balance is:"+amount);
      }
      void display()
      {
    	  System.out.println(acc_no+" "+name+"  "+amount);
      }
}
