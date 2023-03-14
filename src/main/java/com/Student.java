package com;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity                 //name of table will be student//or creating a table in db
public class Student {
	int rollNo;
	String name;
	int ssn;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int ssn) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.ssn = ssn;
	}
	
@Id	  //primary key
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", ssn=" + ssn + "]";
	}
	
	

}
