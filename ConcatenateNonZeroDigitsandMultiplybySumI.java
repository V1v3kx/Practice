package practice;
import java.util.*;

public class ConcatenateNonZeroDigitsandMultiplybySumI {
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.sumAndMultiply(10203004));
	}
}

class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long temp=0;
        List<Long> list=new ArrayList<>();
        while(n>0){
            long num=n%10;
            list.add(num);
            n=n/10;
        }
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)!=0){
                sum=sum+list.get(i);
                temp=temp*10+list.get(i);
            }
        }
        long result=temp*sum;
        return result;
    }
}
