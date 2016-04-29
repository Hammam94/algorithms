
public class insertionSort {
	public static void Sort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j >= 0; j--) {
				if(arr[j] < arr[i]) {
					arr[i] += arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] -= arr[j];
				}else{
					break;
				}
			}
		}
	}
}
