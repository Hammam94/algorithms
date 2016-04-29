
public class findQuick {
	static int[] arr = {11,21,31,44,54,63,73,82,92,102};
	static int[] connected = new int[arr.length];
	public static void main(String[] args) {
		//load different vales for connected array as the all component in the first
		//is not connected 
		for(int i = 1; i <= arr.length; i++) {
			connected[i-1] = i;
		}
		
		// we take the connectivity from user then we did not need that 
		join(11,73);
		join(21,73);
		join(31,21);
		join(102,54);
		join(92,82);
		
		System.out.println(isconnected(31, 11));
		System.out.println(isconnected(102, 11));
		System.out.println(isconnected(21, 11));
		
	}
	
	public static void join(int a, int b){
		int aIndex = -1, bIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if(a == arr[i]){
				aIndex = i;
			}else if( b == arr[i]){
				bIndex = i;
			}
		}
		if(aIndex != -1 && bIndex != -1){
			connected[aIndex] = connected[bIndex];
		} else {
			System.out.println("One or the both number you have entered is not found in the objects");
		}
	}
	
	public static boolean isconnected(int a, int b){
		int aIndex = -1, bIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if(a == arr[i]){
				aIndex = i;
			}else if( b == arr[i]){
				bIndex = i;
			}
		}
		if(aIndex != -1 && bIndex != -1){
			return connected[aIndex] == connected[bIndex];
		}
		return false;
	}

}
