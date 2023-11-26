package arrayAssignment;

public class SumOfArray {
	int pairSum = 15;

	int[] numbers = { -40, -5, 1, 3, 6, 7, 8, 20 };

	void adding() {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {

				if (numbers[i] + numbers[j] == pairSum) {
					System.out.println(numbers[i] + "+" + numbers[j]);
					System.out.println("the adding numbers is" + pairSum);
				}

			}

		}

	}
}
