package dailyPractice;
import java.util.*;

public class SingleNumber {
	public static void main(String[] args) {
		Solution45 s=new Solution45();
		int[] nums= {2,2,1};
		System.out.print(s.singleNumber(nums));
	}
}
class Solution45 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
        		if(map.containsKey(nums[i])) {
        			map.put(nums[i], map.get(nums[i])+1);
        		}else {
        			map.put(nums[i], 1);
        		}
        }
        int output=0;
        for(int i=0;i<nums.length;i++) {
        		if(map.get(nums[i])==1) {
        			output=nums[i];
        		}
        }
        return output;
    }
}