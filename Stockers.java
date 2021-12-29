package stockers;

import java.util.Scanner;

public class Stockers {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("Enter the no. of companies");
		int company = sc.nextInt();

		double[] arr = new double[company];
		boolean[] booleanArr = new boolean[company];
		for (int i = 0; i < company; i++) {
			System.out.println("Enter the current stock price of company" + " " + (i + 1));
			arr[i] = sc.nextDouble();

			System.out.println("whether company's stock price rose today compare to yesterday ?");
			booleanArr[i] = sc.nextBoolean();
		}

		System.out.println("--------------------------------------------");
		for (;;) {
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in Ascending order");
			System.out.println("2. Display the companies stock prices in Descending order");
			System.out.println("3. Display the total no. of companies for which stock prices rose today");
			System.out.println("4. Display the total no. of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			int number = sc.nextInt();
			MergeSortImplementation ms = new MergeSortImplementation();

			switch (number) {
			case 1:
				ms.sort(arr, 0, arr.length - 1);
				System.out.println("Stock prices in ascending order are :");
				for (int i = company - 1; i >= 0; i--) {
					System.out.print(" " + arr[i] + " ");
				}

				System.out.println(" ");
				System.out.println("\n" + "--------------------------------------------");
				break;

			case 2:
				ms.sort(arr, 0, arr.length - 1);
				System.out.println("Stock prices in descending order are :");
				for (int i = 0; i < company; i++) {
					System.out.print(" " + arr[i] + " ");
				}
				System.out.println(" ");
				System.out.println("\n" + "--------------------------------------------");
				break;
			case 3:
				int k = 0;
				for (int i = 0; i < company; i++) {
					if (booleanArr[i] == true) {
						k++;
					}
				}
				System.out.println("Total no. of companies  whose stock price rose today :" + " " + k);
				System.out.println(" ");
				System.out.println("\n" + "--------------------------------------------");

				break;
			case 4:
				int c = 0;
				for (int i = 0; i < company; i++) {
					if (booleanArr[i] == false) {
						c++;
					}
				}
				System.out.println("Total no. of companies whose stock price declined today :" + " " + c);
				System.out.println(" ");
				System.out.println("\n" + "--------------------------------------------");
				break;

			case 5:
				System.out.println("Enter the key value");
				Double key = sc.nextDouble();
				boolean br = true;
				for (int i = 0; i < company; i++) {

					if (arr[i] == key) {
						System.out.println("stock of value " + key + " is present");
						br = false;
					}
				}

				if (br) {
					System.out.println("Value not found");
				}
				System.out.println(" ");
				System.out.println("\n" + "--------------------------------------------");
				break;
			case 0:
				System.out.println("Exited Successfully");
				System.exit(0);

			}

		}
	}

}
