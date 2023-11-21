package waterTankCapacity;

import java.util.Scanner;

public class WaterFilledInWaterTank {
	int tankCapacity = 100;
	int bucketCapacity = 10;
	int waterInTank;
	int currentLevel;
	int breakpoint=90;
	Scanner sc=new Scanner(System.in);
	

	void calculateTheWaterLevel() {
		System.out.println("the current level of water");
		currentLevel=sc.nextInt();

		
	
		while(currentLevel<=breakpoint) {
		currentLevel+=bucketCapacity;
		System.out.println("the watel level is"+currentLevel);
		
		 
	if (currentLevel==breakpoint) {
			
			System.out.println("watertank will be overflow,the current water in tank"+currentLevel);
		
			break;
			
			}
			
			}
		}

	}

