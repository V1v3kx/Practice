package dailyPractice;

public class ProcessStringwithSpecialOperationsII {
	public static void main(String[] args) {
		Solution sol=new Solution();
		String s="%#bz%xum##i##vzo#pwc*#dkwbh####%uf%s*%cgppqhqa%h#l##o%ij%%cz%iga##e###u%#e####jfwx##%%*x%m*%#";
		int k=6523;
		System.out.println(sol.processStr(s,k));
	}
}
class Solution {
    public char processStr(String s, long k) {
        long[] len=new long[s.length()];
        long curlen=0;
        for(int i=0;i<s.length();i++) {
        		char ch=s.charAt(i);
        		if(ch>='a' && ch<='z') {
        			curlen++;
        		}else if(ch=='*') {
        			if(curlen>0) curlen--;
        		}else if(ch=='#') {
        			curlen=curlen*2;
        		}else if(ch=='%') {
        			
        		}
        		len[i]=curlen;
        }
        
        if(k>= len[s.length()-1]) {
        		return '.';
        }else {
        		for(int i=s.length()-1;i>=0;i--) {
        			char ch=s.charAt(i);
        			if(ch>='a' && ch<='z') {
        				long oldlen=len[i]-1;
        				if(k== oldlen) {
        					return ch;
        				}
        			}else if(ch=='#') {
        				long oldlen=len[i]/2;
        				k=k%oldlen;
        			}else if(ch=='%') {
        				k=len[i]-1-k;
        			}
        			else if(ch=='*') {
        				
        			}
        		}
        		return '.';
        }
    }
}