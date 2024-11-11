package com.SpringCore.SpringCore;

public class Student {
	private int sid;
	private String sName;
	private String saddress;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Student(int sid, String sName, String saddress) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.saddress = saddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", saddress=" + saddress + "]";
	}
	
	
	
	
    
}
