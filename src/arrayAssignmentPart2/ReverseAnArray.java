package arrayAssignmentPart2;

import java.util.Arrays;

public class ReverseAnArray {
	
	int[]numbers= {1,2,3,4,5,6,7,8,9,10};
	
	int temp;
	
	void findReverse() {
		for(int i=0;i<numbers.length/2;i++) {
			temp=numbers[i];
			numbers[i]=numbers[numbers.length-i-1];
			numbers[numbers.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(numbers));
	}

}
