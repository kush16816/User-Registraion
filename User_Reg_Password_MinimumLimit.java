
package com.userReg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Reg_Password_MinimumLimit {

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
		
		System.out.println("Enter Your EmailID ");
		final String emailID = sc.next();
		
		final String emlID = "^[a-z0-9]+[a-z0-9.+-_]+@[a-z0-9]+.[a-z]{2,}(.[a-z]{2})?$";
		m = Pattern.compile(emlID).matcher(emailID);
		
		System.out.println("Your emailID is in valid format - " + m.matches());
		
		System.out.println("Enter Your Mobile ");
		final String mobileNo = sc.nextLine();

		final String mobNo = "[1-9][0-9][\\s][1-9][0-9]{9}";
		m = Pattern.compile(mobNo).matcher(mobileNo);

		System.out.println("Your mobile number is in valid format - " + m.matches());

		System.out.println("Enter Your Password ");
		final String password = sc.next();

		final String pwd = ".{8,}";
		m = Pattern.compile(pwd).matcher(password);

		System.out.println("Your password is in valid format - " + m.matches());

	}

}
