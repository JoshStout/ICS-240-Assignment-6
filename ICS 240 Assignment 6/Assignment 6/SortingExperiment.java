/**
 * ICS 240 Assignment 6
 * 
 */

import java.io.IOException;

public class SortingExperiment {

	public static void main(String[] args) throws IOException {
		
		//assignment instructions example for running insertion sort algorithm on libraries array.
//		Library[] data = DataUpload.uploadData();
//		LibrarySorter.insertionSort(data);
//		for(int i = 0; i < 100; i++) {
//			System.out.println(data[i]);
//		}
//		Library[] data = DataUpload.uploadData();
//		int numToSort = 10000;
//		long begin = System.currentTimeMillis(); // start time
//		LibrarySorter.quicksort(data, 0, numToSort);
//		long end = System.currentTimeMillis(); // end time
//		System.out.println("Size: " + numToSort + "\ttime in ms: " + (end-begin));

		//Quick Sort
		// loop thru 10 different amounts, 10 times each amount.
		System.out.println("quicksort");
		for(int k = 0; k < 10; k++) {
			System.out.println("Trial " + (k+1));
			int numToSort = 1000;
			for(int i = 0; i < 10; i++) {
				numToSort += 1500;
				Library[] data = DataUpload.uploadData();
				long begin = System.currentTimeMillis(); // start time
				LibrarySorter.quicksort(data, 0, numToSort);
				long end = System.currentTimeMillis(); // end time
				System.out.println("Size:\t" + numToSort + "\ttime in ms:\t" + (end-begin));
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		//Merge Sort
		// loop thru 10 different amounts, 10 times each amount.
		System.out.println("mergeSort");
		for(int k = 0; k < 10; k++) {
			System.out.println("Trial " + (k+1));
			int mergeSortNumToSort = 1000;
			for(int i = 0 ; i < 10; i++) {
				mergeSortNumToSort += 1500;
				Library[] data = DataUpload.uploadData();
				long begin = System.currentTimeMillis(); // start time
				LibrarySorter.mergeSort(data, 0, mergeSortNumToSort);
				long end = System.currentTimeMillis(); // end time
				System.out.println("Size:\t" + mergeSortNumToSort + "\ttime in ms:\t" + (end-begin));
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Insertion Sort
		// loop thru 10 different amounts, 10 times each amount.
		System.out.println("insertionSort");
		for(int k = 0; k < 10; k++) {
			System.out.println("Trial " + (k+1));
			int insertionSortNumToSort = 1000;
			for(int i = 0 ; i < 10; i++) {
				insertionSortNumToSort += 1500;
				Library[] data = DataUpload.uploadData();
				Library[] data2 = new Library[insertionSortNumToSort];
				for(int j = 0; j < insertionSortNumToSort; j++) {
					data2[j] = data[j];
				}
				long begin = System.currentTimeMillis(); // start time
				LibrarySorter.insertionSort(data2);
				long end = System.currentTimeMillis(); // end time
				System.out.println("Size:\t" + insertionSortNumToSort + "\ttime in ms:\t" + (end-begin));
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("end");
	}

}
