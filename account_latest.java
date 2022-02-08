package devarsh;

import java.util.Scanner;

public class account_latest {
	int acc_no;
	String name;
	float amount;

	public account_latest(int acc_no,String name,float amount) {
		this.acc_no = acc_no;
		this.name = name;
		this.amount = amount;
	}
	
	public void deposit(float amt) {
		amount = amount + amt;
		System.out.println("Diposited Successfully : ");
		System.out.println(amt+" diposited");
	}
	
	public void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("insufficient account balance");
			System.out.println("Please check your account balance...");
		}
		else {
			amount = amount - amt;
			System.out.println("Withdrawal Successfully : ");
			System.out.println(amt+" withdrawn");
		}	
	}
	
	public void checkbalance() {
		System.out.println("balance is "+amount);
	}
	
	public void display() {
		System.out.println("Account holder name : "+name);
		System.out.println("Account number : "+acc_no);
		System.out.println("Current balance : "+amount);
	}
	
	public void home() {
		System.out.println("Thank You");
	}

	public static void main(String[] args) {
		account_latest a11 = new account_latest(345678912,"Vivek Yadav",50000);
		while(true) {
			System.out.println("Enter your account number : ");
			Scanner an = new Scanner(System.in);
			int a_num = an.nextInt();
			if(a_num == 345678912) {
				System.out.println("Account details\n");
				a11.display();
				while(true)
				  {
					System.out.println("---------------------------------------------------------------------------------------------------");
					System.out.println("Choose Option : Withdraw(1)\tDeposit(2)\tBalance Inquiry(3)\tBack(4)\n---------------------------------------------------------------------------------------------------");
					Scanner input = new Scanner(System.in);
				    int number = input.nextInt();
				    if(number > 4 || number < 0) {
				    	System.out.println("Invalid");
				    	System.out.println("Choose option again & Please enter valid option...");
				    }
				    if(number == 4) {
				    	System.out.println("Thank You");
				    	break;
				    }
				    switch(number)
				    {
				    		case 1:
				    			while(true) {
				    				System.out.println("Enter withdrawal Amount: ");
					    			Scanner sc = new Scanner(System.in);
					    			int cash = sc.nextInt();
				    				if(cash > 0) {
				    					System.out.println("Valid");
				    					for(int i=1;i<4;i++) {
						    				System.out.println("Enter Your 4 digit UPI PIN(****): "); /*-----------> PIN = 1221 <-----------*/
							    			Scanner sc2 = new Scanner(System.in);
							    			int pin = sc2.nextInt();
							    			if(i == 1 || i == 2) {
							    				if(pin == 1221) {
								    				a11.withdraw(cash); 
								    				break;
								    			}
								    			else {
								    				System.out.println("Invalid!! Please enter valid UPI PIN");
								    			}
							    			}
							    			
							    			if(i == 3) {
							    				if(pin == 1221) {
								    				a11.withdraw(cash); 
								    				break;
								    			}
								    			else {
								    				System.out.println("Please choose option again...");
								    				a11.home();
								    				break;
								    			}
							    			}
						    			} 
				    					break;
				    				}
				    				else {
				    					System.out.println("Please enter valid amount!!!");
				    				}
				    			}
			                    break;
							case 2:
								while(true) {
									System.out.println("Enter deposit Amount : ");
									Scanner sc1 = new Scanner(System.in);
									int cash1 = sc1.nextInt();
									if(cash1 > 0) {
										for(int i=1;i<4;i++) {
						    				System.out.println("Enter Your 4 digit UPI PIN(****): ");
							    			Scanner sc2 = new Scanner(System.in);
							    			int pin = sc2.nextInt();
							    			if(i == 1 || i == 2) {
							    				if(pin == 1221) {
								    				a11.deposit(cash1); 
								    				break;
								    			}
								    			else {
								    				System.out.println("Invalid!! Please enter valid UPI PIN");
								    			}
							    			}
							    			if(i == 3) {
							    				if(pin == 1221) {
								    				a11.deposit(cash1); 
								    				break;
								    			}
								    			else {
								    				System.out.println("Sorry! Please choose option again...");
								    				a11.home();
								    				break;
								    			}
							    			}
						    			}
										break;
									}
									else {
				    					System.out.println("Please enter valid amount!!!");
									}
								}
							    break;
							case 3:
								a11.checkbalance();
							    break;
				     }
				  }
			}
			else {
				System.out.println("Invalid!!! Please enter valid account number!");
			}
		}

		// TODO Auto-generated method stub
	}

}
