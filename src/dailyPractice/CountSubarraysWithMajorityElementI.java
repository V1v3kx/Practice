<<<<<<< HEAD
package dailyPractice;

public class CountSubarraysWithMajorityElementI {
	public static void main(String[] args) {
		Solution87 s=new Solution87();
		int[] nums= {1,2,2,3};
		int target=2;
		System.out.println(s.countMajoritySubarrays(nums,target));
	}
}

class Solution87 {
    public int countMajoritySubarrays(int[] nums, int target) {
		int answer=0;
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=i;j<nums.length;j++) {
				if(nums[j]==target) {
					count++;
				}
				int length=j-i+1;
				if(length/2<count) {
					answer++;
				}
			}
		}
		return answer;
    }
=======
package dailyPractice;

public class CountSubarraysWithMajorityElementI {
	public static void main(String[] args) {
		Solution87 s=new Solution87();
		int[] nums= {1,2,2,3};
		int target=2;
		System.out.println(s.countMajoritySubarrays(nums,target));
	}
}

class Solution87 {
    public int countMajoritySubarrays(int[] nums, int target) {
		int answer=0;
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=i;j<nums.length;j++) {
				if(nums[j]==target) {
					count++;
				}
				int length=j-i+1;
				if(length/2<count) {
					answer++;
				}
			}
		}
		return answer;
    }
>>>>>>> 26803db (Movezeroes)
}