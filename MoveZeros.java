package dailyPractice;

public class MoveZeros {
	public static void main(String[] args) {
		Solution2 s=new Solution2();
		int[] nums= {0,1,0,3,12};
		s.moveZeroes(nums);
	}
}
class Solution2{
    public void moveZeroes(int[] nums) {
        int f=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i != f){
                    int temp=nums[i];
                    nums[i]=nums[f];
                    nums[f]=temp;
                }
                f++;
            }
            
        }
        for(int i=0;i<nums.length;i++) {
        		System.out.print(nums[i]+" ");
        }
    }
}