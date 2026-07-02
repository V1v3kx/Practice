package dailyPractice;

import java.util.Arrays;

public class MaximumIceCreamBars {
	public static void main(String[] args) {
		Solution89 s=new Solution89();
		int[] costs= {1,3,2,4,1};
		int coins=7;
		System.out.println(s.maxIceCream( costs, coins));
	}
}

class Solution89 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int max_icecream=0;
        int bars=0;
        for(int i=0;i<costs.length;i++) {
        		max_icecream=max_icecream+costs[i];
        		if(max_icecream<=coins) {
        			bars++;
        		}else {
        			break;
        		}
        }
    		return bars;
    }
}
