package lecture12;

public class _1_Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	[] arr = {2,3,5,6,7,11,13,15,18};
		int item = 13;
		System.out.println(search(arr,item));
		
		
	}
	
	public static int search(int [] arr, int item) {
		
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low + high) /2;
			if(arr[mid] == item) {
				return mid;
			}else if (arr[mid]>item) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
