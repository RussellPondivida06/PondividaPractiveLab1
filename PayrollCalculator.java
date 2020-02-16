
package com.code;

import com.Prog.Payroll;

public class PayrollCalculator {

	public static void main(String[] args) {
		System.out.println("Payroll Calculator");
		Payroll e1 = new Payroll();
		System.out.println(e1.getemployee());
		System.out.println(e1);
		e1.salary(550, 5.5, 7, 500);


		Payroll e2 = new Payroll();
		e2.setemployee("Rusell Pondivida");
		System.out.println(e2.getemployee());
		System.out.println(e2);
		e2.salary(800, 6, 6, 500);

	}

}

