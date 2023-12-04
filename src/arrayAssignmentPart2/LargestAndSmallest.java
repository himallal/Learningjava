package arrayAssignmentPart2;

public class LargestAndSmallest {
	
	int[]number= {1,7,3,10,5,22,67};
	
	int greatest=0;
	int smallest=100;
	void findTheGretest() {
		for(int i=0;i<number.length;i++) {
		if(number[i]>greatest) {
			greatest=number[i];
			
		}if(number[i]<smallest) {
			smallest=number[i];
		}
			
			
		}
		System.out.println("the greatest number is"+greatest);
		System.out.println("the lowest number is"+smallest);
	}

}
