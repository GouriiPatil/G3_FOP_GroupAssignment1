/**
 * This class shows tech sector work of comapny
 */
package com.greatlearning.companyservice;

import com.greatlearning.core.SuperDepartment;

/**
 * @author Group 3
 *
 */

public class TechDepartment extends SuperDepartment {
	
	//instance variable
		public String techinformation;
		
		// tech construct with parameter
		public TechDepartment(String deptname, String work, String deadline, String techinformation) {
			// TODO Auto-generated constructor stub
			super(deptname,work,deadline);
			this.techinformation=techinformation;
		}
		//returns tech department name
			public String departmentName()
			{
			return deptname;
			}
			
			//returns tech department today work
			public String getTodaysWork()
			{
				return work;
			}
			
			//returns tech department work deadline
			public String getWorkdeadline()
			{
				return deadline;
			
			}
			
			//returns tech department activity
			public String  getTechStackInformation()
			{
				return techinformation ;
			}

}
