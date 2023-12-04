package arrayAssignmentPart2;

public class SecondHighest {
	
	
	int[] numbers= {1,4,8,3,65,32,55,88};
	
	int secondHigest=0;
	int firstHigest=0;
	
	void find() {
		
		for(int i=0;i<numbers.length;i++) {
			
	if(numbers[i]>firstHigest){
		secondHigest=firstHigest;
		
		firstHigest=numbers[i];
		
	}
	
		
	}System.out.println("second higest number is "+secondHigest);
	System.out.println("The highest number is "+firstHigest);

		}
	}


