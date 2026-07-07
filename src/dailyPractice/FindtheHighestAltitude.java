<<<<<<< HEAD
package dailyPractice;

public class FindtheHighestAltitude {
	public static void main(String[] args) {
		Solution21 s=new Solution21();
		int[] gain= {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
		System.out.println(s.largestAltitude(gain));
	}
	
}

class Solution21 {
    public int largestAltitude(int[] gain) {
        int high=0;
        int f=0;
        int value=0;
        while(f<gain.length){
        		
        		value=value+gain[f];
        		if(value>high){
                    high=value;
                }
            f++;
        }
        return high;
    }
=======
package dailyPractice;

public class FindtheHighestAltitude {
	public static void main(String[] args) {
		Solution21 s=new Solution21();
		int[] gain= {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
		System.out.println(s.largestAltitude(gain));
	}
	
}

class Solution21 {
    public int largestAltitude(int[] gain) {
        int high=0;
        int f=0;
        int value=0;
        while(f<gain.length){
        		
        		value=value+gain[f];
        		if(value>high){
                    high=value;
                }
            f++;
        }
        return high;
    }
>>>>>>> 26803db (Movezeroes)
}