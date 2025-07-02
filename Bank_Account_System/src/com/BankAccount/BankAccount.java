package com.BankAccount;
import java.util.*;

public class BankAccount {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your Account Balance = ");
		int balance = sc.nextInt();
		
		while (true) {
			System.out.println("\n Simple Bank Menu ___");
			System.out.println("1. Deposit");
			System.out.println("2. WithDraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter Choice = ");
			int choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter amount to deposit = ");
				int amt = sc.nextInt();
				
				balance = balance+amt;
				System.out.println("Amount deposited successfully...!");
				System.out.print("Your account balance is "+balance+" RS\n");
				break;
				
			case 2:
				System.out.print("Enter amount to withdraw = ");
				int am = sc.nextInt();
				
				if (balance>=am) {
					balance-=am;
					System.out.println("Amount withdrawn successfully...!");
				}
				else {
					System.out.print("You do not have sufficient balance to withdraw...!\n");
				}
				System.out.print("Your account balance is "+balance+"RS \n");
				break;
				
			case 3:
				System.out.print("Your account balance is "+balance+"RS\n");
				break;
				
			case 4:
				return;
			
			default:
				System.out.println("Enter correct choice please...!");
			}
		}
		
	}

}