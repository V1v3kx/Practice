package dailyPractice;

public class CanPlaceFlowers {
	public static void main(String[] args) {
		Solution80 s=new Solution80();
		int[] flowerbed= {1,0,0,0,1};
		int n=1;
		System.out.println(s.canPlaceFlowers(flowerbed,n));
	}
}
class Solution80 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plant=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean left=(i==0 || flowerbed[i-1]==0);
                boolean right=(i==flowerbed.length-1 || flowerbed[i+1]==0);

                if(left && right){
                    flowerbed[i]=1;
                    plant++;
                }
            }
        }
        if(plant>=n){
            return true;
        }else{
            return false;
        }
    }
}