class Solution {
    public int minChanges(String s) {
        int even=0;
        int odd=1;
        int change=0;
        while(odd<s.length()){
            if(s.charAt(even)!=s.charAt(odd)){
                change++;
            }
            even=even+2;
            odd=odd+2;
        }
        return change;
    }
}