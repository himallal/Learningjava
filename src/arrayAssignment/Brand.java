package arrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Brand {

	String[][] brand = { { "s20", "s21", "filp1", "fold3" },
			{ "googlpixel6", "googlepixel6pro", "googlepixelpro", "googlepixel5" },
			{ "Iphone12", "IphoneSE", "Iphone15", "Iphone13" } };

	Scanner sc = new Scanner(System.in);

	void findBrand() {
		boolean isProductAvilable = false;
		System.out.println("enter the brand");
		String product = sc.next();
		
		if (product.equalsIgnoreCase("samsung")) {
			System.out.println("avilable product in the list" + Arrays.toString(brand[0]));
			

			System.out.println("enter one product name");
			product = sc.next();

			for (int j = 0; j < brand[0].length; j++) {
				if (brand[0][j].equalsIgnoreCase(product)) {
					System.out.println("the product selected is" + brand[0][j]);
					isProductAvilable = true;

				}

			}

			if (!isProductAvilable) {
				System.out.println("the product s nt avilable");

			}

		}
		if (product.equalsIgnoreCase("google")) {
			System.out.println("avilable product in the list" + Arrays.toString(brand[1]));
			System.out.println("enter one product name");
			product = sc.next();

			for (int j = 0; j < brand[1].length; j++) {
				if (brand[1][j].equalsIgnoreCase(product)) {
					System.out.println("the product selected is" + brand[1][j]);
					isProductAvilable = true;

				}

			}

			if (!isProductAvilable) {
				System.out.println("the product s nt avilable");

			}

		}
		if (product.equalsIgnoreCase("apple")) {

			System.out.println("avilable product in the list" + Arrays.toString(brand[2]));

			System.out.println("enter one product name");
			product = sc.next();

			for (int j = 0; j < brand[2].length; j++) {
				if (brand[2][j].equalsIgnoreCase(product)) {
					System.out.println("the product selected is" + brand[2][j]);
					isProductAvilable = true;

				}
			}

			if (!isProductAvilable) {
				System.out.println("the product s nt avilable");
			}

		}
		if(!product.equalsIgnoreCase("samsung")||!product.equalsIgnoreCase("apple")||!product.equalsIgnoreCase("google")) {
			
		}
	System.out.println(" the product is not avilable");
	}
}
