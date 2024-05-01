package com.app.CMSUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.CustomException.CMSExc;
import com.app.CustomException.Eclass;
import com.app.CustomException.InvalidCreds;
import com.app.Customer.Customer;
import com.app.Customer.Service;

public class CMSvalidationRules {
	// add a method to check for dup customer (by email)
	public static void checkForDupCustomer(String email, List<Customer> customerlist) throws CMSExc {

		Customer c = new Customer(email);
		if (customerlist.contains(c))
			throw new CMSExc("Duplicate email");
	}

	public static Service validatePlan(String s ) throws Eclass {
		for (Service sv : Service.values()) {
			if (sv.name().equalsIgnoreCase(s)) {
				return sv;
			}
		}
		throw new Eclass("INVALID PLAN");
	}

	public static void changepassword( ArrayList<Customer> a) throws InvalidCreds{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Email");
		String e,p,np; 
		e=sc.next();
		for (Customer c : a)
			if (e.equals(c.getEmail())) {
				System.out.println("Enter Old Password");
				p = sc.next();
				if (p.equals(c.getPwd())){
							System.out.println("Enter New Password");
							np = sc.next();
							c.setPwd(np);
							System.out.println("PASSWORD UPDATED");
						}
					}
			throw new InvalidCreds("Invalid Password");
	}


	public static void signin(Customer[] a) throws Eclass {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE EMAIL");
		String e, p;
		e = sc.next();
		System.out.println("ENTER THE PASSWORD");
		p = sc.next();
		for (Customer c : a) {
			if (e.equals(c.getEmail()) && p.equals(c.getPwd())) {
				System.out.println("SUCCESSFUL");
			}
			if (c != null && e.equals(c.getEmail())) {
				System.out.println("Enter PASSWORD");
				p = sc.next();
				if (p.equals(c.getPwd())) {
					System.out.println("SUCCESS");
				} else {
					System.out.println("FAILED");
				}
			}
		}
		sc.close();
	}
}