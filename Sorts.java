public class Sorts {


	public static void showArray(int[] arr) {
		if (arr.length > 0) {
			System.out.print(arr[0]);
			for (int i = 1; i < arr.length; i++)
				System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
	public void shakeSort(int[] arr) {
		int noSawp = 0;
		int noCompar = 0;
		showArray(arr);
		for (int begin = 0;  begin < arr.length - 1; begin++) {
			for (int j = arr.length - 1, k = 0; j > begin && k<arr.length-1; j--, k++) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
					noSawp++;
				}if (arr[k] > arr[k+1]) {
					swap(arr, k, k+1);
					noSawp++;
				}
			}
			noCompar++; 
		}
		showArray(arr);
		System.out.println("The number of comparision using Shake sort is: " + (noCompar)/2 );
		System.out.println("The number of shifting using Shake sort is: " + noSawp);
	}
	public void bubbleSort(int[] arr) {
		int noSawp = 0;
		int noCompar = 0;
		showArray(arr);
		for (int begin = 0; begin < arr.length - 1; begin++) {
			for (int j = arr.length - 1; j > begin; j--)
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
					noSawp++;
				}
			noCompar++; 
		}
		showArray(arr);
		System.out.println("The number of comparision using Bubble sort is: " + (noCompar));
		System.out.println("The number of shifting using Bubble sort is: " + noSawp);
	}

	private void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public void insertSort(int[] arr) {
		int noSawp = 0;
		int noCompar = 0;
		showArray(arr);
		for (int pos = arr.length - 2; pos >= 0; pos--) {
			int value = arr[pos];
			int i = pos + 1;
			while (i < arr.length && value > arr[i]) {
				arr[i - 1] = arr[i];
				noSawp++;
				i++;
			}
			arr[i - 1] = value;
			noCompar++;
		}
		showArray(arr);
		System.out.println("The number of comparision using Insert sort is: " + (noCompar));
		System.out.println("The number of shifting using Insert sort is: " + noSawp);
	}

	public void selectSort(int[] arr) {
		int noSawp = 0;
		int noCompar = 0;
		showArray(arr);
		for (int border = arr.length; border > 1; border--) {
			int maxPos = 0;
			for (int pos = 0; pos < border; pos++) {
				if (arr[maxPos] < arr[pos]) {
					maxPos = pos;
				}
			}
			swap(arr, border - 1, maxPos);
			noSawp++;
			noCompar++;
		}
		showArray(arr);
		System.out.println("The number of comparision using Select sort is: " + (noCompar));
		System.out.println("The number of shifting using Select sort is: " + noSawp);
	}
	
}
