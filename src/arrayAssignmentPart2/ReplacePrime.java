package arrayAssignmentPart2;

import java.util.Arrays;
import java.util.Scanner;

public class ReplacePrime {
	String[]prime={"1","5","9","11","15"};

	int n;
	int attempt=0;
	Scanner sc=new Scanner(System.in);
	boolean isItPrime=false;
	boolean reentry=true;

	void calculate(){
		
for(int i=0;i<prime.length;i++) {
	n=Integer.parseInt(prime[i]);
			if ((n-1)%6==0||(n+1)%6==0){
				System.out.println(n+" is prime number");
				prime[i]="prime";
				isItPrime=true;
				
			}else if(n==2||n==3||n==5||n==7||n==11) {
				System.out.println(n+" is  prime number");
				prime[i]="prime";
				isItPrime=true;
			
			} else  {
		System.out.println(n+" it s nt prime number");
	
	}
	
}
System.out.println(Arrays.toString(prime));
}}




