package dailyPractice;
import java.util.Arrays;


public class MinimumCostofBuyingCandiesWithDiscount {
	
	
	public static void main(String[] args) {
		int[] cost= {3,3,3,1};
		System.out.println(minimumCost(cost));
	}
	
	
	public static int minimumCost(int[] cost) {
		int min_cost=0;
        Arrays.sort(cost);
        int i=cost.length-1;
        if(i<1){
            return cost[0];
        }else if(i<2){
            return cost[0]+cost[1];
        }
        while(i>=0){
            int sum_cost=0;
            for(int j=i;j>i-2 && j>=0;j--){
                sum_cost=sum_cost+cost[j];
            }
            min_cost=min_cost+sum_cost;
            i=i-3;
        }
        return min_cost;
    }
}
