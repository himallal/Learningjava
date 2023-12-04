package arrayAssignmentPart2;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	int sum;
	int previousNumber = 0;
	int nextNumber;
	int currentNumber = 1;
	Scanner sc = new Scanner(System.in);

	void findFibonacci() {
		System.out.println("enter a number at which fibonacci numbers should stop");
		int enterAnumber = sc.nextInt();
		int[] fibonacci = new int[enterAnumber];
		fibonacci[0] = currentNumber;
		int counter = 1;
		while (currentNumber < enterAnumber) {

			nextNumber = currentNumber + previousNumber;
			if (nextNumber <= enterAnumber) {
				previousNumber = currentNumber;
				fibonacci[counter] = nextNumber;
				currentNumber = nextNumber;
				counter++;
			} else {
				break;
			}
		}
		System.out.println("The numbers are:");

		for (int i = 0; i < counter; i++) {
			System.out.println(fibonacci[i]);
		}

	}
}
