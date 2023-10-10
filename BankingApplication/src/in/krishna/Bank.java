package in.krishna;
import java.util.Scanner;

	public class Bank {
		int balance=50000;
		
		public void checkBalance() {
			System.out.println("Your balance is : "+balance);
		}
		
		public void deposit(int amount) {
			if(amount!=0) {
				balance=balance+amount;
				System.out.println("Successfully Deposited");
				System.out.println("Deposited Amount : "+amount+" \t Updated Balance : "+balance);
			}
		}
		
		public void withDrawAmount(int wAmount) {
			if (wAmount!=0) {
				balance=balance-wAmount;
				System.out.println();
				System.out.println("Successfully Withdrawn");
				System.out.println("WithDrawal Amount : "+wAmount+" \t Updated Balance : " +balance);
			}
		}
		
		public void transfer(int tAmount) {
			if(tAmount<=balance) {
				balance=balance-tAmount;
				System.out.println();
				System.out.println("Transaction Successfully Completed");
				System.out.println("Transfer amount : "+tAmount+" \t updated balance : "+balance);
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
		public void exit() {
			System.out.println("Thank you for using banking application");
			System.out.println("See you Soon");
			System.exit(0);
		}
		
		public void ShowMenu() {
			int option =0;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println(" **************** Welcome to Banking application *************** ");
			System.out.println();
			
			System.out.println("1 : Check Balance");
			System.out.println("2 : Deposit");
			System.out.println("3 : Withdraw");
			System.out.println("4 : Transfer");
			System.out.println("5 : Exit");
			
			do {
				System.out.println("");
				System.out.println("**** PLEASE SELECT A OPTION ****");
				System.out.println();
				option = scanner.nextInt();
				System.out.println("\n");
				
				switch (option) {
				case 1: 
					checkBalance();
					break;
				
				case 2: 
					System.out.println("Enter Amount to be deposited");
					int amount=scanner.nextInt();
					deposit(amount);
					break;
					
				case 3: 
					System.out.println("Enter Amount which you want to withdrawl");
					int wdrAmount=scanner.nextInt();
					withDrawAmount(wdrAmount);
					break;
				
				case 4: 
					System.out.println("Enter Amount which you want to transfer");
					int trfAmount=scanner.nextInt();
					transfer(trfAmount);
					break;
					
				case 5:
					exit();
					break;
					
				default:
					System.out.println("Invalid option !!! Please  enter correct Option ");
					break;
				}
					
			} while (option!=5);
			scanner.close();		
		}
	}


