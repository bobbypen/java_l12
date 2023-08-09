package lecture12;

public class _1_1_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,5,8,9,12,14,15,16,17};
		int item = 15;
		System.out.println(search(arr,item));
		
	}
	
	public static int search(int [] arr , int item) {
		
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
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
