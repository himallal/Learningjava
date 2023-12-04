package arrayAssignmentPart2;

public class MultipleDuplicates {
	
	int[]numbers= {1,3,2,5,9,10,2,4,3,9,34,55};
	int duplicates;
	void findDuplicates() {
		
		for (int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				
			if(numbers[i]==numbers[j])
		
			
				System.out.println(numbers[i]+" this number is duplicated in array"+"at index "+i+" and "+j);
			}
		}
	}

}

