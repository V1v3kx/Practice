package dailyPractice;

public class MaximumBuildingHeight {
	public static void main(String[] args) {
		Solution94 s=new Solution94();
		int n=10;
		int[][]restrictions= {{5,3},{2,5},{7,4},{10,3}};
		System.out.println(s.maxBuilding(n,restrictions));
	}
}

class Solution94 {
    public int maxBuilding(int n, int[][] restrictions) {
        int temp_output=0;
        int[] limit=new int[n+1];
        int rl=restrictions.length;
        int cl=restrictions[0].length;
        for(int i=0;i<rl;i++) {
        		int id=restrictions[i][0];
        		for(int j=0;j<cl;j++) {
        			int height=restrictions[1][j];
        			if(limit[i]==restrictions[1][i]) {
        				limit[i]=restrictions[id][height];
        			}else {
        				limit[i]=10;
        			}
        		}
        }
        for(int i=0;i<limit.length;i++) {
        		System.out.print(limit[i]+" ");
        }
    		return temp_output;
    }
}