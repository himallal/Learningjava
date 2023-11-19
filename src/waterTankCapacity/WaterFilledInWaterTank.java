package waterTankCapacity;

import java.util.Scanner;

public class WaterFilledInWaterTank {
	int tankCapacity = 100;
	int bucketCapacity = 10;
	int breakpoint=90;
	
	

	void calculateTheWaterLevel() {

		for (int waterIntank = 0; waterIntank <=breakpoint; waterIntank += bucketCapacity) {
			
		
			System.out.println("the total amount of water in the tank" + waterIntank);
		
			 
		if (waterIntank==breakpoint) {
			
			System.out.println("watertank will be overflow,the current water in tank"+waterIntank);
				break;
			}
			
		}

	}
}
