package dailyPractice;



public class LongestCommonPrefix {
	public static void main(String[] args) {
		Solution23 s=new Solution23();
		String[] strs = {"dog","racecar","car"};
		System.out.println(s.longestCommonPrefix(strs));
	}
}
class Solution23 {
    public String longestCommonPrefix(String[] strs) {
    		String prefix=strs[0];
        	for(int i=0;i<strs.length;i++) {
        		while(!strs[i].startsWith(prefix)) {
        			prefix=prefix.substring(0,prefix.length()-1);
        			if(prefix.equals("")) {
        				return "";
        			}
        		}
        	}
        	return prefix;
    }
}