package emailapp;

import java.util.Scanner;

public class Email extends Info {
	//Email Administration Application
	private String firstName;
	private String secondName;
	private String password;
	private String email;
	private String department;
	private int mailBoxCapacity = 400;
	private String alternateEmail;
	private int passwordLength = 8;
	
	public Email(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
		
			// Call department method
		this.department = setDepartment();
			// call random password method
		this.password = randomPassword(passwordLength);
			// generate email address for the employee
		email = firstName.toLowerCase() + secondName.toLowerCase() + "@" + department + "." + companyName;
	}
	
	private String setDepartment() {
			// Select department
		System.out.println("New employee: " + firstName +"."+ " " + "Department codes:");
		System.out.println("1 for Sales");
		System.out.println("2 for Accounting");
		System.out.println("3 for Fees and dues");
		System.out.println("4 for Development");
		System.out.println("5 for Security");
		System.out.println("6 for Examination");
		System.out.print("Enter code: ");
		
		Scanner cin = new Scanner(System.in);
		int departmentChoice = cin.nextInt();
		
		if(departmentChoice == 1) {
			return "sales";
		}
		else if(departmentChoice  == 2) {
			return "accounting";
		}
		else if (departmentChoice == 3){
			return "F&D";
		}
		else if (departmentChoice == 4){
			return "dev";
		}
		else if (departmentChoice == 5) {
			return "security";
		}
		else if(departmentChoice == 6) {
			return "examination";
		}
		else {
			return "";
		}
	}
		// Set random password
	private String randomPassword(int length) {
		
		String setPass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$";
		char[] password = new char[length];
		
		for(int i=0; i<length; i++) {
			int random = (int)(Math.random() * setPass.length());
			password[i] = setPass.charAt(random);
		}
		
		return new String(password);
	}
		//set mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
		//set alternate Email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
		// change password
	public void changePassword(String password) {
		this.password = password;
	}
		// get mailbox capacity
	public String getMailBoxCapacity() {
		System.out.print(changeCapacity);
		return + mailBoxCapacity + "mb";
	}
		// get alternate Email
	public String getAlternateEmail() {
		return altMail + alternateEmail;
	}
		// get password
	public String getPassword() {
		return changePass + password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + secondName +
		 "\nCOMPANY EMAIL: " + email + 
		 "\nCOMPANY PASSWORD: " + password +
		 "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb" ;
	}
}




