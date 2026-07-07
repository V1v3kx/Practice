<<<<<<< HEAD
package dailyPractice;


public class NumberofStringsThatAppearasSubstringsinWord {
	public static void main(String[] args) {
		Solution51 s=new Solution51();
		String[] patterns= {"a","b","c"};
		String word="aaaaabbbbb";
		System.out.println(s.numOfStrings(patterns,word));
	}
}
class Solution51 {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String pattern:patterns) {
        		if(word.contains(pattern)) {
        			count++;
        		}
        }
        return count;
    }
=======
package dailyPractice;


public class NumberofStringsThatAppearasSubstringsinWord {
	public static void main(String[] args) {
		Solution51 s=new Solution51();
		String[] patterns= {"a","b","c"};
		String word="aaaaabbbbb";
		System.out.println(s.numOfStrings(patterns,word));
	}
}
class Solution51 {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String pattern:patterns) {
        		if(word.contains(pattern)) {
        			count++;
        		}
        }
        return count;
    }
>>>>>>> 26803db (Movezeroes)
}