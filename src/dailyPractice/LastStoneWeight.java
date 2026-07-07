<<<<<<< HEAD
package dailyPractice;

import java.util.*;

public class LastStoneWeight {
	public static void main(String[] args) {
		Solution57 s=new Solution57();
		int[] stones= {2,7,4,1,8,1};
		System.out.println(s.lastStoneWeight(stones));
	}
}
class Solution57 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list=new ArrayList<>();
        for(int i:stones){
            list.add(i);
        }
        
        while(list.size()>1){
            Collections.sort(list);
            Collections.reverse(list);
            int x=list.get(0);
            int y=list.get(1);
            int smash=x-y;
            list.add(smash);
            list.remove(0);
            list.remove(0);
        }
        int num=list.get(0);
        return num;
    }
=======
package dailyPractice;

import java.util.*;

public class LastStoneWeight {
	public static void main(String[] args) {
		Solution57 s=new Solution57();
		int[] stones= {2,7,4,1,8,1};
		System.out.println(s.lastStoneWeight(stones));
	}
}
class Solution57 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list=new ArrayList<>();
        for(int i:stones){
            list.add(i);
        }
        
        while(list.size()>1){
            Collections.sort(list);
            Collections.reverse(list);
            int x=list.get(0);
            int y=list.get(1);
            int smash=x-y;
            list.add(smash);
            list.remove(0);
            list.remove(0);
        }
        int num=list.get(0);
        return num;
    }
>>>>>>> 26803db (Movezeroes)
}