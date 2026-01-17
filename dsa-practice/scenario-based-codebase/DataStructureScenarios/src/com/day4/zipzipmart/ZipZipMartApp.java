/*  3. ZipZipMart – Daily Sales Summary Report (Merge Sort)
Story: ZipZipMart compiles thousands of daily sales records from all branches. To generate
reports, the system sorts transactions by date and amount using Merge Sort, which ensures
stability and efficiency with large datasets.
Key Concepts:
● Divide and conquer
● Large-scale sorting
● Preserves order of equal items (stable)   */

package com.day4.zipzipmart;

import java.util.Scanner;

public class ZipZipMartApp {

	public static void mergeSort(SalesRecord[] records, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(records, left, mid);
			mergeSort(records, mid + 1, right);
			merge(records, left, mid, right);
		}
	}

	public static void merge(SalesRecord[] records, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		SalesRecord[] L = new SalesRecord[n1];
		SalesRecord[] R = new SalesRecord[n2];

		for (int i = 0; i < n1; i++)
			L[i] = records[left + i];
		for (int j = 0; j < n2; j++)
			R[j] = records[mid + 1 + j];

		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i].getDate().compareTo(R[j].getDate()) < 0 ||
				(L[i].getDate().equals(R[j].getDate()) && L[i].getAmount() <= R[j].getAmount())) {
				records[k] = L[i];
				i++;
			} else {
				records[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			records[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			records[k] = R[j];
			j++;
			k++;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of sales records: ");
		int n = scanner.nextInt();
		SalesRecord[] records = new SalesRecord[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter date (YYYY-MM-DD) for record " + (i + 1) + ": ");
			String date = scanner.next();
			System.out.print("Enter amount for record " + (i + 1) + ": ");
			double amount = scanner.nextDouble();
			records[i] = new SalesRecord(date, amount);
		}

		mergeSort(records, 0, records.length - 1);

		System.out.println("\nSorted Sales Records:");
		for (SalesRecord record : records) {
			System.out.println(record);
		}

		scanner.close();
	}
}