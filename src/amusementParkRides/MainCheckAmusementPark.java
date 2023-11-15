package amusementParkRides;

import java.util.Scanner;

public class MainCheckAmusementPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAmusementParkEntry person = new CheckAmusementParkEntry();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the person name is");
		person.name=sc.next();
		System.out.println("the person height in cm is:");
		
		person.peopleHeight=sc.nextDouble();
		person.displayAllowedToRide();
		

	}

}
