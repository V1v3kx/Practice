package practice;

import java.util.*;

public class SmallestMissingMultipleofK {
	
	public static void main(String[] args) {
		int[] nums= {8,2,3,4,6};
		int k=2;
		System.out.println(missingMultiple(nums,k));
	}
	
	
	public static int missingMultiple(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        int maxn=Integer.MIN_VALUE;
        for(int num:nums){
            list.add(num);
            maxn=Math.max(maxn,num);
        }
        int smallest=Integer.MIN_VALUE;
        for(int i=1;i<200;i++){
            int answer=k*i;
            if(!list.contains(answer)){
                return answer;
            }
            if(answer>maxn){
                return answer;
            }
        }
        return smallest;

    }
}
