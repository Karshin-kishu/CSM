package com.app.Client;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.CMSUtils.CMSvalidationRules;
import com.app.Customer.Customer;

public class Client {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int count=0;
			System.out.println("Enter number of employee");
			Customer[] cc = new Customer [sc.nextInt()];
			while(true) {
				System.out.println("Enter choice");
				System.out.println("1. Sign up \n 2. Sign in \n 3. Change Password \n 4. UnSubscribe \n 5. Display All \n 0. Exit \n");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter all Details");
					cc[count++] = new Customer(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),LocalDate.parse(sc.next()),CMSvalidationRules.validatePlan(sc.next()));
					System.out.println("Added !!");
					break;
				case 2:
					
					
					
					break;
				case 5:
					System.out.println("ALL DETAILS ARE : ");
					for (Customer z : cc ) {
						if (z != null) {
							System.out.println(z.toString());
						}
					}
					
					

				default:
					break;
				}
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
