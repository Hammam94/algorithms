
public class selectionSort {
	public static void Sort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]) min = j;
			}
			arr[i] += arr[min];
			arr[min] = arr[i] - arr[min];
			arr[i] -= arr[min]; 
		}
	}
}
