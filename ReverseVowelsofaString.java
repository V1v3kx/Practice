package practice;

public class ReverseVowelsofaString {
	public static void main(String[] args) {
		Solution0 s=new Solution0();
		System.out.println(s.reverseVowels("IceCreAm"));
	}
}
class Solution0 {
    public String reverseVowels(String s) {
        int first=0;
        int last=s.length()-1;
        char[] arr=s.toCharArray();
        while(first<last){
            while(first<last && (arr[first]!='A' && arr[first]!='E' && arr[first]!='I' && arr[first]!='O' && arr[first]!='U' && arr[first]!='a' && arr[first]!='e' && arr[first]!='i' && arr[first]!='o' && arr[first]!='u')){
                first++;
            }
            while(first<last && (arr[last]!='A' && arr[last]!='E' && arr[last]!='I' && arr[last]!='O' && arr[last]!='U' && arr[last]!='a' && arr[last]!='e' && arr[last]!='i' && arr[last]!='o' && arr[last]!='u')){
                last--;
            }
            char temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        return new String(arr);
    }
}