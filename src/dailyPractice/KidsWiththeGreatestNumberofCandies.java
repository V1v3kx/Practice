package dailyPractice;
import java.util.*;

public class KidsWiththeGreatestNumberofCandies {
	public static void main(String[] args) {
		Solution16 s=new Solution16();
		int[] candies= {2,3,5,1,3};
		int extraCandies=3;
		System.out.println(s.kidsWithCandies(candies,extraCandies));
	}
}
class Solution16 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int great=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>great){
                great=candies[i];
            }
        }
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=great){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}