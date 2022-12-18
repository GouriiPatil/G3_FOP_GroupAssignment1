/**
 * This class will be where all action take place
 */
package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.companyservice.AdminDepartment;
import com.greatlearning.companyservice.HrDepartment;
import com.greatlearning.companyservice.TechDepartment;
import com.greatlearning.core.SuperDepartment;

/**
 * @author Group 3
 *
 */
public class CompanyDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		//super class object
		SuperDepartment superDepartment = new SuperDepartment("Super Department","No Work as of now"," Nil","Today is not a holiday");
		
		
		
		//admin class object. you can use any object construct
		AdminDepartment adminDepartment= new AdminDepartment("Admin Department","Complete your documents Submission"," Complete by EOD");
		
		//SuperDepartment adminDepartment= new AdminDepartment("Admin Department","Complete your documents Submission"," Complete by EOD");
		
		
		
		//hr class object. you can use any object construct
		HrDepartment hrDepartment= new HrDepartment("Hr Department","Fill today’s timesheet and mark your attendance"," Complete by EOD","“team Lunch");
		//SuperDepartment hrDepartment= new HrDepartment("Hr Department","Complete coding of module 1"," Complete by EOD","team Lunch");
		
		
		
		//
		TechDepartment techDepartment= new TechDepartment("Tech Department","Complete coding of module 1"," Complete by EOD","core Java");
		//SuperDepartment hrDepartment= new HrDepartment("Tech Department","Complete coding of module 1"," Complete by EOD","core Java");
		
		
		
		int option;
		do {
			//give options to 1.Super Department, 2.Admin Department, 3. Hr Department, 4. Tech Department
			System.out.println("Choose the Department option you wish to perform");
			System.out.println("1. Super Department");
			System.out.println("2. Admin Department");
			System.out.println("3. Hr Department");
			System.out.println("4. Tech Department");
			System.out.println("0. Wrong Department ");
			
			option = userInput.nextInt();
			
			//use switch case to direct to the appropriate bank operation
			switch(option) {
				case 0:
					break;
					
				case 1: {
					//superclass method calling
					System.out.println("The name of Department is:"+superDepartment.departmentName());
					System.out.println("The Today work of Department is:"+superDepartment.getTodaysWork());
					System.out.println("The work deadline of Department is:"+superDepartment.getWorkdeadline());
					System.out.println("Is Today Holiday of Department?:"+superDepartment.isTodayAHoliday());
				}
				break;
				
				case 2: {
					//adminclass method calling
					System.out.println("The name of Department is:"+adminDepartment.departmentName());
					System.out.println("The Today work of Department is:"+adminDepartment.getTodaysWork());
					System.out.println("The work deadline of Department is:"+adminDepartment.getWorkdeadline());
				}
				break;
				
				case 3: {
					//hrclass method calling
					System.out.println("The name of Department is:"+hrDepartment.departmentName());
					System.out.println("The Today work of Department is:"+hrDepartment.getTodaysWork());
					System.out.println("The work deadline of Department is:"+hrDepartment.getWorkdeadline());
					System.out.println("The work deadline of Department is:"+hrDepartment.doActivity());
				}
				
				case 4: {
					//techclass method calling
					System.out.println("The name of Department is:"+techDepartment.departmentName());
					System.out.println("The Today work of Department is:"+techDepartment.getTodaysWork());
					System.out.println("The work deadline of Department is:"+techDepartment.getWorkdeadline());
					System.out.println("The work deadline of Department is:"+techDepartment.getTechStackInformation());
					
				}
			}
			
		} while (option !=0);//until user selects logout option (0) repeat this loop
		System.out.println("You have entered wrong department code");
		userInput.close();

	}

}
