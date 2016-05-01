
public class mergeSort {
	int[] leftArray, rightArray;
	int[] arr;
	int i = 0, j = 0, k = 0;
	public mergeSort(int[] arr){
		this.arr = arr;
		Sort(this.arr, rightArray, leftArray);
	}
	
	
	
	private void Sort(int[] aux,int[] rightArray, int[] leftArray){
		if(aux.length == 1) return;
		if(aux.length % 2 == 0){
			leftArray = new int[aux.length / 2];
			rightArray= new int[aux.length / 2];
		}else{
			leftArray = new int[aux.length / 2 + 1];
			rightArray= new int[aux.length / 2];
		}
		System.arraycopy(aux, 0, leftArray, 0, leftArray.length);
		System.arraycopy(aux, leftArray.length, rightArray, 0, rightArray.length);
		Sort(leftArray,rightArray,leftArray);
		arraySort(aux, rightArray, leftArray);
		Sort(rightArray,rightArray,leftArray);
		arraySort(aux, rightArray, leftArray);
	}
	private void arraySort(int[] aux, int[] rightArray, int[] leftArray){
		for (int x = 0; x < aux.length; x++) {
			if(j < rightArray.length && i < leftArray.length && leftArray[i] > rightArray[j]) {
				aux[k] = rightArray[j];
				++j;	++k;
			} else if (j < rightArray.length && i < leftArray.length && leftArray[i] <= rightArray[j]) {
				aux[k] = leftArray[i];
				++i;	++k;
			} else if(i >= leftArray.length && j < rightArray.length){
				aux[k] = rightArray[j];
				++j;	++k;
			} else if(i < leftArray.length && j >= rightArray.length) {
				aux[k] = leftArray[i];
				++i;	++k;
			}else{
				break;
			}
		}
		j = 0;
		i = 0;
		k = 0;
	}
	
}
