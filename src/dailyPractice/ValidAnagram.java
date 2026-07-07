<<<<<<< HEAD
package dailyPractice;

import java.util.Arrays;

public class ValidAnagram {
	
	public static void main(String[] args) {
		ValidAnagram a=new ValidAnagram();
		System.out.println(a.isAnagram("anagram", "naagram"));
		System.out.println(a.isAnagram("rat", "tar"));
	}
	
	
	
	public boolean isAnagram(String s, String t) {
        boolean anagram=true;
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl){
            anagram=false;
            return anagram;
        }
        char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        for(int i=0;i<sarr.length;i++){
            if(sarr[i]!=tarr[i]){
                anagram=false;
                return anagram;
            }
        }
        return anagram;
    }
}
=======
package dailyPractice;

import java.util.Arrays;

public class ValidAnagram {
	
	public static void main(String[] args) {
		ValidAnagram a=new ValidAnagram();
		System.out.println(a.isAnagram("anagram", "naagram"));
		System.out.println(a.isAnagram("rat", "tar"));
	}
	
	
	
	public boolean isAnagram(String s, String t) {
        boolean anagram=true;
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl){
            anagram=false;
            return anagram;
        }
        char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        for(int i=0;i<sarr.length;i++){
            if(sarr[i]!=tarr[i]){
                anagram=false;
                return anagram;
            }
        }
        return anagram;
    }
}
>>>>>>> 26803db (Movezeroes)
