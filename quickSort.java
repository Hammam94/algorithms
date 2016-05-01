
public class quickSort {
	int[] arr;
	int swap; 
	public quickSort(int[] arr){
		this.arr = arr;
		Sort(arr, arr.length-1, 0);
	}
	
	private void Sort(int[] aux, int pivotIndex, int wallIndex){
		int wall = wallIndex;
		int pivot = wallIndex+(pivotIndex-wallIndex)/2;
		for (int i = wallIndex; i <= pivotIndex; i++) {
			if(aux[pivot] >= aux[i] && i != pivot){
				if(pivot == wall){
					swapper(i, wall);
					pivot = i;
					++wall;
					--i;
				}else{
					swapper(i, wall);
					++wall;
				}
			}
		}

		if(wall >= pivotIndex || wall + 1 > aux.length -1 || wall == 0) {return;}
		swapper(pivot, wall);
		Sort(aux, wall - 1, wallIndex);
		Sort(aux, pivotIndex, wall + 1);
	}
	
	private void swapper(int index1, int index2){
		swap = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = swap;
	}
}
