/**
 * This class shows hr sector work for company
 */
package com.greatlearning.companyservice;

import com.greatlearning.core.SuperDepartment;

/**
 * @author Group 3
 *
 */

public class HrDepartment extends SuperDepartment {

	//instance variable
	public String activity;
	
	//hr construct with parameters
	public HrDepartment(String deptname, String work, String deadline, String activity) {
		// TODO Auto-generated constructor stub
		super(deptname,work,deadline);
		this.activity=activity;
	}
	
	//returns hr department name
	public String departmentName()
	{
	return deptname;
	}
	
	//returns hr department today work
	public String getTodaysWork()
	{
		return work;
	}
	
	//returns hr department work deadline
	public String getWorkdeadline()
	{
		return deadline;
	
	}
	
	//returns hr department activity
	public String doActivity()
	{
		return activity;
	}

}
