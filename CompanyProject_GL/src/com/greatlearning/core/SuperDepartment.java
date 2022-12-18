/**
 * This class is base class 
 */
package com.greatlearning.core;

/**
 * @author Group 3
 *
 */
public class SuperDepartment {
	
	//instance variables
	public String deptname;
	public String work;
	public String deadline;
	public String holiday;
	
	//super construct
	public SuperDepartment(String deptname, String work, String deadline,String holiday)
	{
	this.deptname=deptname;
	this.work=work;
	this.deadline=deadline;
	this.holiday=holiday;
	}
	
	//super construct with three parameters
	public SuperDepartment(String deptname, String work, String deadline)
	{
	this.deptname=deptname;
	this.work=work;
	this.deadline=deadline;
	}
	
	//returns super department name
	public String departmentName()
	{
	return deptname;
	}
	
	//returns super department today work
	public String getTodaysWork()
	{
		return work;
	}
	
	//returns super department work deadline
	public String getWorkdeadline()
	{
		return deadline;
	
	}
	
	//returns superdepartment holiday activity
	public String isTodayAHoliday() {
		return holiday;
	}

}