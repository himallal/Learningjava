package waterTankCapacity;

import java.util.Scanner;

public class AmusementPark {
	double height;
	int name;
	int noOfPeopleEnterd;

	Scanner sc = new Scanner(System.in);

	void calculation() {
		do {
			System.out.println("the height is");
			height = sc.nextDouble();
			if (height > 90 && height <= 200) {
				noOfPeopleEnterd++;

				System.out.println("person can enter,current no of people in ride" + noOfPeopleEnterd);

			} else {
				System.out.println("height requirment is not match person cant enter");
			}
		} while (noOfPeopleEnterd < 10);

		System.out.println("closed no entry");

	}
}
