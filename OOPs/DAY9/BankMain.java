import java.util.*;

class BankUser{
	String name;
	int account_number;
	String account_type;
	double balance;
	
	BankUser(String nam,int ac_num,String ac_ty,double bal){
		name = nam;
		account_number = ac_num;
		account_type = ac_ty;
		balance = bal;
	}
	
	void depositeMoney(double money){
		balance += money;
		System.out.println();
		System.out.println("Rs."+money+" Deposited to Account Number: "+account_number);
	}
	void withdrawMoney(double money){
		System.out.println();
		if(balance==0){
			System.out.println("No Money Left.");
		}else if(balance<money){
			System.out.println("Sorry, You cannot Withdrawl Rs."+money);
			System.out.println("Try to Withdrawl Rs."+balance+" or Less.");
		}else{
			balance -= money;
			System.out.println("Rs."+money+" Withdrawled from Account Number: "+account_number);
			if(balance<=0){
				System.out.println("No Money Left.");
				balance=0;
			}
		}
	}
	void displayAccountDetail(){
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("User Account Details:-");
		System.out.println("------------------------------------");
		System.out.println("User Name: "+name);
		System.out.println("Account Number: "+account_number);
		System.out.println("Account Type: "+account_type);
		System.out.println("Account Balance: Rs."+balance);
	}
}
class BankMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int choice, ac_ty_ch, acc_num_counter=1, account_number, choice2;
		boolean flag;
		double money;
		String user_name, account_type = "";
		BankUser[] user = new BankUser[100];
		
		while(true){
			flag = true;
			System.out.println();
			System.out.println("1. To Create New Account");
			System.out.println("2. To Access Existing Account");
			System.out.println("3. To Exit");
			System.out.print("Enter Your Choice: ");
			choice = input.nextInt();
			switch(choice){
				case 1:
					System.out.println();
					System.out.print("Enter User Name: ");
					input.nextLine(); // buffer
					user_name = input.nextLine();
					System.out.println();
					System.out.println("1. Savings Account");
					System.out.println("2. Current Account");
					System.out.print("Enter Type Of The Account: ");
					ac_ty_ch = input.nextInt();
					switch(ac_ty_ch){
						case 1: 
							account_type = "Savings Account";
							break;
						case 2: 
							account_type = "Current Account";
							break;
						default:
							System.out.println("Wrong Input. Try Again.");
					}
					user[acc_num_counter] = new BankUser(user_name,acc_num_counter,account_type,0);
					System.out.println();
					System.out.println("Your Account has been Successfully Created.");
					System.out.println("Your Account Number: "+acc_num_counter);
					acc_num_counter++;
					break;
				case 2:
					System.out.println();
					System.out.print("Enter Account Number: ");
					account_number = input.nextInt();
					while(flag){
						System.out.println();
						System.out.println("------------------------------------");
						System.out.println("Hello Mr./Ms. "+user[account_number].name);
						System.out.println("------------------------------------");
						System.out.println("1. To Deposite Money");
						System.out.println("2. To Withdraw Money: ");
						System.out.println("3. To Display Account Detail");
						System.out.println("4. To Logout");
						System.out.print("Enter Your Choice: ");
						choice2 = input.nextInt();
						switch(choice2){
							case 1:
								System.out.println();
								System.out.print("Enter Ammount to Deposite: ");
								money = input.nextDouble();
								user[account_number].depositeMoney(money);
								break;
							case 2:
								System.out.println();
								System.out.print("Enter Ammount to Withdraw: ");
								money = input.nextDouble();
								user[account_number].withdrawMoney(money);
								break;
							case 3:
								user[account_number].displayAccountDetail();
								break;
							case 4:
								flag = false;
								break;
							default:
								System.out.println("Wrong Input. Try Again.");
						}
					}
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println();
					System.out.println("Wrong Input. Try Again.");
			}
		}
	}
}