package com.app.Customer;

import java.time.LocalDate;

public class Customer {
	private static int id;
	private int custid = 100;
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	private Double regamt;
	private LocalDate dob;
	private Service sname;
	
	public Customer() {}
	public Customer(String fname, String lname, String email, String pwd, LocalDate dob, Service sname, double regamt) {
		super();
		this.custid = id++;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pwd = pwd;
		this.dob = dob;
		this.sname = sname;
		this.regamt = regamt;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [Customerid="+ custid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pwd=" + pwd + ", regamt="
				+ regamt + ", dob=" + dob + ", sname=" + sname + "]";
	}
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Double getRegamt() {
		return regamt;
	}

	public void setRegamt(Double regamt) {
		this.regamt = regamt;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Service getSname() {
		return sname;
	}

	public void setSname(Service sname) {
		this.sname = sname;
	}

	public boolean equals (Object o) {
		System.out.println("in customer equals");
		if (o instanceof Customer) {
			Customer c=(Customer)o;
			return this.email.equals(c.email);
		}
		return false;
	}
}
