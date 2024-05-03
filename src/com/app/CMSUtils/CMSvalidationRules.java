package com.app.CMSUtils;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import com.app.CustomException.CMSExc;
import com.app.Customer.Customer;
import com.app.Customer.Service;

public class CMSvalidationRules {
	public static void checkForDupCustomer(String email, List<Customer> customerlist) throws CMSExc {
		Customer c = new Customer(email);
		if (customerlist.contains(c))
			throw new CMSExc("Duplicate email");
	}

	public static LocalDate validateDate(String dob) {
		return LocalDate.parse(dob);
	}

	public static void validateServiceandplanType(Service plan, double regamt) throws CMSExc {
		Service serviceplan = plan;
		if (serviceplan.getPrice() != regamt) {
			throw new CMSExc("Invalid plan");
		}
		System.out.println("Approved!");
	}

	public static void removeatgivenDob(String Dob, List<Customer> custlist) throws CMSExc {
		LocalDate correctdob = validateDate(Dob);
		Iterator<Customer> cusitr = custlist.iterator();
		while (cusitr.hasNext()) {
			Customer cust = cusitr.next();
			if (cust.getDob().equals(correctdob)) {
				cusitr.remove();
			}
		}
	}
	
}