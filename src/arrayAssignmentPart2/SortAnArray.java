package arrayAssignmentPart2;

import java.util.Arrays;

public class SortAnArray {

int[]number= {1,6,2,22,3,67};
int max=0;
void writeAscendingOrder() {
	
	int n = number.length;
    boolean swapped;

    do {
        swapped = false;

        for (int i = 0; i < n - 1; i++) {
            if (number[i] > number[i + 1]) {
               
                int temp = number[i];
                number[i] = number[i + 1];
                number[i + 1] = temp;

                swapped = true;
            }
        }
        n--;

    } while (swapped);
    System.out.println("the numbers are"+Arrays.toString(number));
}
}

	


