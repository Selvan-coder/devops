package com.springcore;

public class Student {
	
	private String studname,studclass;
	private int studRollno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studname, String studclass, int studRollno) {
		super();
		this.studname = studname;
		this.studclass = studclass;
		this.studRollno = studRollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getStudclass() {
		return studclass;
	}
	public void setStudclass(String studclass) {
		this.studclass = studclass;
	}
	public int getStudRollno() {
		return studRollno;
	}
	public void setStudRollno(int studRollno) {
		this.studRollno = studRollno;
	}
	public void display()
	{
		System.out.print("student name :"+studname+"\n Student roll no :"+studRollno+"\n student class :"+studclass);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student name :"+studname+" Student roll no :"+studRollno+" student class :"+studclass;
	}
	

	
	
	

}
