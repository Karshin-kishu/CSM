package com.app.CMSUtils;

import static com.app.CMSUtils.CMSvalidationRules.validateDate;
import static com.app.CMSUtils.CMSvalidationRules.validateServiceandplanType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.CustomException.CMSExc;
import com.app.CustomException.InvalidCreds;
import com.app.Customer.Customer;
import com.app.Customer.Service;

public class Utility {
	public static void changepassword( ArrayList<Customer> a) throws InvalidCreds{
		String e,p,np; 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Email");
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
							sc.close();
						}
					}
			throw new InvalidCreds("Invalid Password");
			
	}
	public static void registerUser(String fname, String lname, String email, String pwd, String dob, Service sname, double regamt,List<Customer> custlist) throws CMSExc {
		Scanner sc = new Scanner(System.in);
		String f,l,e,p,d;
		double r;
		Service s;
		System.out.println("ENTER FIRST NAME: ");
		f=sc.next();
		System.out.println("ENTER LAST NAME: ");
		l=sc.next();
		System.out.println("ENTER THE EMAIL");
		e = sc.next();
		System.out.println("ENTER PASSWORD: ");
		p=sc.next();
		System.out.println("ENTER DOB IN YYYY-MM-DD : ");
		d=sc.next();
		LocalDate dob1=validateDate(d);
		System.out.println("ENTER SERVICEPLAN NAME AND REGISTRATION AMOUNT ");
		s = Service.valueOf(sc.next().toUpperCase());
		r = sc.nextDouble();
		validateServiceandplanType(s,r);
		
		Customer c = new Customer(f,l,e,p,dob1,s,r);
		custlist.add(c);
		sc.close();
	}
	public static void signin(String email,String pswd,List<Customer> custlit) {
		/*1.Take inputs email and password.
		2.verify the email and password by checking and equalising the contents inside the array list and the
		  inputted email,pass.
		3. If successful print success else input correct email and password */
	}
	public static void deleteuser(String email,List<Customer> custlist) {
/*		1. get user input email
		2. match the inputted email to the object where the matching email is present.
		3. remove the object of that Array
	    4. print USER DELETED. */
		
		
	}
}
