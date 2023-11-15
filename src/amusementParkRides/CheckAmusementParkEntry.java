package amusementParkRides;

public class CheckAmusementParkEntry {
	// Amusement park rides only permit people who are taller than a certain height.
	// Height<90 cm and more than 200 cm is not allowed. Display Allowed to ride or
	// not based on the height entered by user//
	String name;

	double peopleHeight;

	void displayAllowedToRide() {
		if (peopleHeight >=90 && peopleHeight <= 200) {// if the code corresponding to the if block executed only if the
														// condition satisfied//
			System.out.println(name + " can ride:"); // if the condition satisfied it will printout
		} else {// all other scenario //
			System.out.println(name + " cant ride");
		}

	}

}
//data used to check=89,89.9,90,91,199,200,201//