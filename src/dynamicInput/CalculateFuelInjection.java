package dynamicInput;

public class CalculateFuelInjection {
	int xThrottle,yFuel;
	
	//in the line number 8 we are declaring a variable of the datatype boolean//
	
//		boolean isXlessThan27=xThrottle<=127;
//		
//		
//		//the line number 11 we are using if block ,if the condition is satisfied then the code (with in the if block )correspoding to the condition will executed other wise it wont executed
//		if(isXlessThan27>=0 && isXlessThan27<=127) {
//			yFuel=xThrottle*2;
//			
//			
//			
//		}else
		void calculateFuelInjection() {
		
		if(xThrottle>=0 && xThrottle<=127) {
			yFuel=xThrottle*2;
			System.out.println("the fuel output is"+yFuel);
			
		}
		else if(xThrottle>=128 &&xThrottle<=255) {
			yFuel=xThrottle+127;
			}
		else
		{System.out.println("the number shoud be in between 1 and 255");

	}
	}
}

