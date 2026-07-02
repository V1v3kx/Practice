package dailyPractice;

public class MergeStringsAlternately {
	
	public static void main(String[] args) {
		Solution56 s=new Solution56();
		String word1="abcd";
		String word2="pq";
		System.out.println(s.mergeAlternately(word1,word2));
	}
}
class Solution56 {
    public String mergeAlternately(String word1, String word2) {
        int first=0;
        int second=0;
        StringBuilder sb=new StringBuilder();
        while(first<word1.length() || second<word2.length()){
            if(first<word1.length()){
                sb.append(word1.charAt(first));
                first++;
            }
            if(second<word2.length()){
                sb.append(word2.charAt(second));
                second++;
            }
            
        }
        return sb.toString();
    }
}