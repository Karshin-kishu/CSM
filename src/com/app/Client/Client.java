package com.app.Client;

import static com.app.CMSUtils.Utility.changepassword;
import static com.app.CMSUtils.Utility.deleteuser;
import static com.app.CMSUtils.Utility.registerUser;
import static com.app.CMSUtils.Utility.signin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.Customer.Customer;

public class Client {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Customer> cc = new ArrayList<>();
			boolean flag = true ; 
			while(flag != false) {
				System.out.println("Enter choice");
				System.out.println("1. Sign up \n 2. Sign in \n 3. Change Password \n 4. UnSubscribe \n 5. Display All \n 0. Exit \n");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("===================Enter all Details=============");
					//cc.add(new Customer(sc.next(),sc.next(),sc.next(),sc.next(),LocalDate.parse(sc.next()),Service.valueOf(sc.next().toUpperCase()),sc.nextDouble()));		
					//sc,sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),Service.valueOf(sc.next().toUpperCase()),sc.nextDouble(),
					registerUser(sc,cc);
					break;
				case 2:
					signin(sc,cc);
					System.out.println("SIGNED IN");
					break;
				case 3:
					changepassword(sc,cc);
					System.out.println("PASSWORD CHANGED");
					break;
				case 4:
					deleteuser(sc,cc);
					System.out.println("USER DELETED ");
					break;
				case 5:
					System.out.println("ALL DETAILS ARE : ");
					for (Customer z : cc ) {
						if (z != null) {
							System.out.println(z.toString());
						}
					}
					break;
				case 0:	
					System.out.println("EXITED");			
					flag=false;
					break;
				}
			}
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
//			sc.nextLine();
		}

	}

}
