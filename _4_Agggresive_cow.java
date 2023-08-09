package lecture12;
import java.util.*;
public class _4_Agggresive_cow {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	
	int t = sc.nextInt();
	while(t>0) {
		
		int nos = sc.nextInt(); //number of stall;
		int noc = sc.nextInt(); //number of cows
		int [] stall = new int[nos];
		for (int i = 0; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(maxdistance(stall,noc));
		t--;
	}
	
	
	}
	public static int maxdistance(int [] stall , int noc) {
		
		int low = stall[0];
		int high = stall[stall.length-1];
		int ans = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(issafe(stall,noc,mid) == true)
			{
				ans = mid;
				low = mid+1;
				
			}else {
				high = mid - 1;
				
			}
		}
		return ans;
	}

	public static boolean issafe(int[] stall,int noc,int mid) {
		
		
		int cow = 1;
		int pos = stall[0];
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos>=mid) {
				cow++;
				pos = stall[i];
			}
			if(cow==noc) {
				return true;
			}
		
		}
		return false;
	}
	
}
