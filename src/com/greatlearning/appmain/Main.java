package com.greatlearning.appmain;

import com.greatlearning.model.Admin_Department;
import com.greatlearning.model.Hr_Department;
import com.greatlearning.model.Tech_Department;

public class Main {

	public static void main(String[] args) {
		// Admin Department Object creation, calling its functionalities and the
		// functionality of Super Department Class
		Admin_Department admindepartment = new Admin_Department();
		System.out.println(admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday());
		System.out.println();
		// HR Department Object creation, calling its functionalities and the
		// functionality of Super Department Class
		Hr_Department hrdepartment = new Hr_Department();
		System.out.println(hrdepartment.departmentName());
		System.out.println(hrdepartment.doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday());
		System.out.println();
		// Tech Department Object creation, calling its functionalities and the
		// functionality of Super Department Class
		Tech_Department techdepartment = new Tech_Department();
		System.out.println(techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(techdepartment.getTechStackInformation());
		System.out.println(techdepartment.isTodayAHoliday());
	}

}
