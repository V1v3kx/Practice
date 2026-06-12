package dailyPractice;



public class RemoveDuplicatesfromSortedArray {
	
	public static int removeDuplicates(int[] nums) {
		
		
			int[] arr=new int[nums.length];
			int count=1;
			int index=1;
			arr[0]=nums[0];
			for(int i=1;i<nums.length;i++) {
				if(nums[i]!=nums[i-1]) {
					arr[index]=nums[i];
					count++;
					index++;
				}
			}
			for(int i=0;i<arr.length;i++) {
				nums[i]=arr[i];
			}
			return count;
		
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {1,1,2};
		int[] arr1= {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
		System.out.println(removeDuplicates(arr1));
	}
}
