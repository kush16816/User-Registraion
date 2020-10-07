
package com.userReg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Reg_LastName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name ");
		final String firstName = sc.next();
		
		final String fName = "^[A-Z][A-Za-z]*";
		Matcher m = Pattern.compile(fName).matcher(firstName);
		
		System.out.println("Your first name is in valid format - " + m.matches());
		

		System.out.println("Enter Your Last Name ");
		final String lastName = sc.next();
		
		final String lName = "^[A-Z][A-Za-z]*";
		m = Pattern.compile(lName).matcher(lastName);

		System.out.println("Your last name is in valid format - " + m.matches());

	}

}
