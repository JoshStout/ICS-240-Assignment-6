/**
 * 
 * Sorting Algorithms from lecture 9 but modified for [Library] objects.
 *
 */
public class LibrarySorter {
	
	/**
	 * quick sort
	 * @param data - array to be sorted
	 * @param first - start index of the portion of the array that will be sorted.
	 * @param n - number of elements to sort.
	 */
	public static void quicksort(Library[] data, int first, int n){
		int pivotIndex,n1,n2;
		if (n > 1){
			pivotIndex = partition(data,first,n);
			n1 = pivotIndex - first;
			n2 = n - n1 - 1;
			//recursive calls to sort the two pieces
			quicksort(data,first,n1);
			quicksort(data,pivotIndex+1,n2);
		}
		
	}
	//helper method for the quicksort method.
	private static int partition(Library data[], int first, int n) {
		
		int pivotIndex = first;
		int finalIndex = first + n -1;
		int left = first+1;
		int right = finalIndex;
		while (left <= right) { 
			while (left <= finalIndex && data[left].compareTo(data[pivotIndex]) <= 0) {
				left++;				
			}
			
			while (right > first && data[right].compareTo(data[pivotIndex]) > 0) {
				right--;
			}
				if (left < right) {
				Library temp = data[left];
				data[left] = data[right];
				data[right] = temp;
			}
		}
		//move pivot to its correct position
		Library temp = data[pivotIndex];
		data[pivotIndex] = data[right];
		data[right] = temp;
		return right;
	}
	
	
	/**
	 * merge sort
	 * @param data - array to be sorted
	 * @param first - start index for the portion of the array that will be sorted
	 * @param n - number of elements to sort
	 */
	//Divide and Conquer algorithm
	//divides input array in two halves,
	//calls itself for the two halves and then merges the two sorted halves.
	//two functions are involved.
	//merge() function is used for merging two halves.
	//mergeSort() function recursively calls itself to divide the array until size becomes one
	//video: https://www.geeksforgeeks.org/merge-sort/
	//O(n log n)
	public static void mergeSort(Library[] data, int first, int n) {
		int n1; //size of the first half of the array
		int n2; //size of the second half of the array
		if(n > 1) {
			n1 = n/2;
			n2 = n - n1;
			//sort data[first]...data[first+n1]
			mergeSort(data, first, n1);
			//sort data[first+n1+1] to the end
			mergeSort(data, first + n1, n2);
			//merge the two sorted halves using the merge method below
			merge(data, first, n1, n2);
		}
	}
	
	/**
	 * @precondition data has at least n1 + n2 elements starting at data[first]
	 * @param data
	 * @param first
	 * @param n1
	 * @param n2
	 * @postcondition starting from data[first], n1 + n2 elements will be sorted
	 */
	public static void merge(Library[] data, int first, int n1, int n2) {
		Library[] temp = new Library[n1+n2];
		int p1 = 0, p2 = 0, p = 0;
		
		while((p1 < n1) && (p2 < n2)) {
			if(data[first+p1].compareTo(data[first + n1 + p2]) < 0) {
				temp[p] = data[first + p1];
				p++;
				p1++;
			}else {
				temp[p] = data[first + n1 + p2];
				p++;
				p2++;
			}
		}

		//copy the remaining elements from the first half but not from the
		//second half because those elements are in their correct positions
		//in the data array
		while(p1 < n1) {
			temp[p] = data[first + p1];
			p++;
			p1++;
		}
		
		//copy back from temp array to the original array
		for(int i = 0; i < p; i++) {
			data[first + i] = temp[i];
		}
	}
	
	
	//insertion sort
	//O(n^2)
	public static void insertionSort(Library[] data) {
		for(int i = 1; i < data.length; i++) {
			Library element = data[i];
			int j = i;
			//shift elements to the right as long as they are greater than element
			for(j = i; j > 0 && data[j-1].compareTo(element) > 0; j--) {
				data[j] = data[j-1];
			}
			data[j] = element;
		}
	}

}
