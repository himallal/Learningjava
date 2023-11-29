package arrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBrand {

	String[] samsung = { "s20", "s21", "filp1", "fold3" };
	String[] google = { "googlpixel6", "googlepixel6pro", "googlepixelpro", "googlepixel5" };
	String[] apple = { "Iphone12", "IphoneSE", "Iphone15", "Iphone13" };
	Scanner sc = new Scanner(System.in);
	int attempt = 0;
	boolean isBrandNotPresent = false;

	void findTheBrand() {
		do {
			System.out.println("enter the brand name");
			String brandName = sc.next();
			attempt++;
			boolean isProductPresent = false;
			switch (brandName) {
			case "samsung": {
				System.out.println("the products are" + Arrays.toString(samsung));
				System.out.println("enter one product name");
				String productName = sc.next();
				for (int i = 0; i < samsung.length; i++) {
					if (samsung[i].equalsIgnoreCase(productName)) {
						System.out.println("product selected is:" + samsung[i]);
						isProductPresent = true;
						break;
					}
				}

				if (!isProductPresent) {
					System.out.println("please select a product from the list");
				}

				break;
			}
			case "google": {
				System.out.println("the products are" + Arrays.toString(google));
				System.out.println("enter one product name");
				String productName = sc.next();
				for (int i = 0; i < google.length; i++) {

					if (google[i].equalsIgnoreCase(productName)) {
						System.out.println("product selected is:" + google[i]);
						isProductPresent = true;
						break;
					}
				}
				if (!isProductPresent) {
					System.out.println("please select a product from the list");
				}

				break;
			}
			case "apple": {
				System.out.println("the products are" + Arrays.toString(apple));
				System.out.println("enter one product name");
				String productName = sc.next();
				for (int i = 0; i < apple.length; i++) {
					if (apple[i].equalsIgnoreCase(productName)) {
						System.out.println("product selected is:" + apple[i]);
						isProductPresent = true;
						break;
					}
				}
				if (!isProductPresent) {
					System.out.println("please select a product from the list");
				}

				break;
			}
			default:
				System.out.println("the current brand entered is not found");
				isBrandNotPresent = true;
			}
		} while (attempt < 2 && isBrandNotPresent);

	}
}
