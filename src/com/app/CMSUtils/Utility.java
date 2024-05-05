package com.app.CMSUtils;

import static com.app.CMSUtils.CMSvalidationRules.validateDate;
import static com.app.CMSUtils.CMSvalidationRules.validateServiceandplanType;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.CustomException.CMSExc;
import com.app.CustomException.InvalidCreds;
import com.app.Customer.Customer;
import com.app.Customer.Service;

public class Utility {
	public static void changepassword(Scanner sc,List<Customer> a) throws InvalidCreds{
		String e,p,np; 
//		Scanner sc = new Scanner (System.in);
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
		public static void registerUser(Scanner sc,List<Customer> custlist) throws CMSExc {
			//Scanner sc,String fname, String lname, String email, String pwd, String dob, Service sname, double regamt,List<Customer> custlist
			String f,l,e,p,d;
		double r;
		Service s;
//		Scanner sc =new Scanner (System.in);
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
//		sc.close();
	}
	public static void signin(Scanner sc,List<Customer> custlit) throws CMSExc {
		//.Take inputs email and password.
//		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER EMAIL AND PASSWORD");
		String e = sc.next();
		String p = sc.next();
		Customer c = new Customer(e,p);
//         1. manipulate equals method and override it so that objects can be compared
//		   and also create a constructor where it take two arguements 
		if(!custlit.contains(c)) {
			throw new CMSExc("sign in failed");
		}
//		3. If successful print success else input correct email and password */
		System.out.println("sigined in");
		sc.close();
	}
	public static void deleteuser(Scanner sc,List<Customer> custlist) throws CMSExc {
		/* 1. get user input email */
		System.out.println("ENTER EMAIL TO BEE DELETED");
	//	Scanner sc = new Scanner(System.in);
		/* create an object initiated with that inputted email,
		and check condition if that object is present in that custlist.*/
		Customer c = new Customer(sc.next());
		System.out.println("USER TO BE DELETED: " + c);
		if(custlist.contains(c)) {
		/* 3. remove the object of that Array */
			custlist.remove(c);
			sc.close();
		}
		throw new CMSExc ("INVALID EMAIL");	
		}
}
