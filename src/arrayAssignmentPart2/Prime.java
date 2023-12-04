package arrayAssignmentPart2;

import java.util.Scanner;

public class Prime {
	
	int number;
	int attempt=0;
	Scanner sc=new Scanner(System.in);
	boolean isItPrime=false;
	boolean reentry=true;

	void calculate(){
		while(reentry) {
		System.out.println("enter the prime number");
		int number=sc.nextInt();


			if ((number-1)%6==0||(number+1)%6==0){
				System.out.println("it s prime number");
				isItPrime=true;
				
			}else if(number==2||number==3||number==5||number==7||number==11) {
				System.out.println("it will be prime number");
				isItPrime=true;
			
			}
			
		
		
	if(!isItPrime) {
		System.out.println("it s nt prime number");
	
	}
	
	System.out.println("do you want enter a new number?");
	reentry=sc.nextBoolean();
}}
}

