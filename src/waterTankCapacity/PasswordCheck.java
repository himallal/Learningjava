package waterTankCapacity;

import java.util.Scanner;

public class PasswordCheck {
	String userName;
	String passWord;
	String orginalUserName="himallal370";
	String orginalPassword="himal123";
	int attempt=1;
	Scanner sc=new Scanner(System.in);
	void PassWordChecking() {
		do {
			System.out.println("enter the user name");
			userName=sc.next();
			System.out.println("enter the password");
			passWord=sc.next();
			
			attempt++;
			if (orginalUserName.equals(userName)&&!orginalPassword.equals(passWord)) {
				System.out.println(" pls enter u r username again");
			}
			else if(orginalPassword.equals(passWord)&&orginalUserName.equals(userName)) {
				System.out.println("user will get permission to login");
				
			}else if((attempt<=3&&!orginalPassword.equals(passWord))&&!orginalUserName.equals(userName)) {
				System.out.println("password or user name or both wrong try again");
			}
			
		}while(attempt<=3&&!orginalPassword.equals(passWord)); 
		if(attempt>=3&&!orginalPassword.equals(passWord)){
			
		System.out.println(" blocked the login bcs enter wrong password or username more than3 times");
		}
	
			
		
	
		
	}

}



