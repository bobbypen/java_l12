package lecture12;

public class _3_first_bad_version {

	
	//solution on leetcode
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	//isme hum ek minimum tk check krege

	public static int firstBadVersion(int n) {
		
	
	
	int low= 1;
	int high = n;
	while(low<=high) {
//		int mid =low + (high-low)/2;
		int mid =(low+high)/2;
		if(isBadVersion(mid) == true) {
			ans = mid -1;
		}
		else {
			low = mid + 1;
		}
		
		return ans;
	}
	}
	
}
