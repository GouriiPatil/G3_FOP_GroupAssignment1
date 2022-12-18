/**
 * This class shows admin sector work for comapany
 */
package com.greatlearning.companyservice;

import com.greatlearning.core.SuperDepartment;

/**
 * @author Group 3
 *
 */

public class AdminDepartment extends SuperDepartment {
	
	//construct with parameters
		public AdminDepartment(String deptname, String work, String deadline) {
			// TODO Auto-generated constructor stub
			super(deptname,work,deadline);
		}
		
		//returns admin department name
			public String departmentName()
			{
			return deptname;
			}
			
			//returns admin department today work
			public String getTodaysWork()
			{
				return work;
			}
			
			//returns admin department work deadline
			public String getWorkdeadline()
			{
				return deadline;
			
			}


}
