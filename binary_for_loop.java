package lecture12;

public class binary_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,5,8,9,12,14,15,16,17};
		int item = 15;
		System.out.println(name(arr,item));
	}

	public static int name(int [] arr, int item	) {
		
		int high = arr.length-1;
		
		for (int low = 0; low <= high; ) {
			
		
		
		int mid = (low + high) 	/ 2;
		if(arr[mid]==item) {
			return mid;
		}else if(arr[mid]>item) {
			high = mid-1;
		}
		else {
			low = mid + 1;
		}
	}
		return -1;
	
	}
}
