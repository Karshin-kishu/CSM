package com.app.Utils;

import java.util.Scanner;

import com.app.Customer.Customer;
import com.app.CustomException.Eclass;

public class Signin {
  public static void signin(Customer[] a) throws Eclass{
	Scanner sc = new Scanner (System.in);
	System.out.println("ENTER THE EMAIL");
	String e,p;
	e=sc.next();
	System.out.println("ENTER THE PASSWORD");
	p=sc.next();
	for (Customer c : a) {
		if(e.equals(c.getEmail()) && p.equals(c.getPwd())) {
			System.out.println("SUCCESSFUL");
		}
		if (c!=null && e.equals(c.getEmail())) {
			System.out.println("Enter PASSWORD");
			p=sc.next();
			if (p.equals(c.getPwd())) {
				System.out.println("SUCCESS");
			}else {
				System.out.println("FAILED"); 
			}
		}
	  }
	sc.close();
	}
  }
