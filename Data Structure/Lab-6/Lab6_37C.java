import java.util.*;
class BankAccount{
	int accountno;
	double balance;
	String accholder;
	String name;

	Scanner sc=new Scanner(System.in);
	public BankAccount(){
		System.out.println("Enter accountno");
		accountno=sc.nextInt();

		System.out.println("Enter balance");
		balance=sc.nextDouble();

		System.out.println("Enter accholder");
		accholder=sc.next();

		System.out.println("Enter name");
		name=sc.next();
	}

	void deposit(){
		System.out.println("Enter deposit money");
		double dm=sc.nextDouble();
		balance=balance+dm;
		System.out.println(balance);
	}
	void withdraw(){
		System.out.println("Enter withdraw money");
		double wm=sc.nextDouble();
		if(wm>0){
			balance=balance-wm;
		}
		else if(wm<0){
			System.out.println("please check balance");
		}
		else{
			System.out.println("not enough balance");
		}
		System.out.println(balance);
	}
	void displaybalance(){
		System.out.println(balance);
	}
}

public class Lab6_37C{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();

		BankAccount[] b=new BankAccount[n];

		for(int i=0;i<n;i++){
			b[i]=new BankAccount();
			b[i].displaybalance();
			b[i].deposit();
			b[i].withdraw();
			b[i].displaybalance();
		}
	}
}