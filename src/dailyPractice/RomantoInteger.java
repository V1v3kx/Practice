<<<<<<< HEAD
package dailyPractice;

import java.util.Stack;

public class RomantoInteger {
	public static void main(String[] args) {
		Solution1 s=new Solution1();
		String si="MCMXCIV";
		System.out.println(s.romanToInt(si));
	}
}
class Solution1 {
    public int romanToInt(String s) {
        char[] arr=s.toCharArray();
        int number=0;
        Stack<Character> stack=new Stack<>();
        stack.push('N');
        for(int i=arr.length-1;i>=0;i--){
            char ch=arr[i];
            if(ch=='I'){
                if(stack.peek()=='V'||stack.peek()=='X'){
                    number=number-1;
                }else{
                    number++;
                }
            }else if(ch=='V'){
                number=number+5;
            }else if(ch=='X'){
                if(stack.peek()=='L'||stack.peek()=='C'){
                    number=number-10;
                }else{
                    number=number+10;;
                }
            }else if(ch=='L'){
                number=number+50;
            }else if(ch=='C'){
                if(stack.peek()=='D'||stack.peek()=='M'){
                    number=number-100;
                }else{
                    number=number+100;
                }
            }else if(ch=='D'){
                number=number+500;
            }else if(ch=='M'){
                number=number+1000;
            }
             stack.push(ch);
        }
        return number;
    }
=======
package dailyPractice;

import java.util.Stack;

public class RomantoInteger {
	public static void main(String[] args) {
		Solution1 s=new Solution1();
		String si="MCMXCIV";
		System.out.println(s.romanToInt(si));
	}
}
class Solution1 {
    public int romanToInt(String s) {
        char[] arr=s.toCharArray();
        int number=0;
        Stack<Character> stack=new Stack<>();
        stack.push('N');
        for(int i=arr.length-1;i>=0;i--){
            char ch=arr[i];
            if(ch=='I'){
                if(stack.peek()=='V'||stack.peek()=='X'){
                    number=number-1;
                }else{
                    number++;
                }
            }else if(ch=='V'){
                number=number+5;
            }else if(ch=='X'){
                if(stack.peek()=='L'||stack.peek()=='C'){
                    number=number-10;
                }else{
                    number=number+10;;
                }
            }else if(ch=='L'){
                number=number+50;
            }else if(ch=='C'){
                if(stack.peek()=='D'||stack.peek()=='M'){
                    number=number-100;
                }else{
                    number=number+100;
                }
            }else if(ch=='D'){
                number=number+500;
            }else if(ch=='M'){
                number=number+1000;
            }
             stack.push(ch);
        }
        return number;
    }
>>>>>>> 26803db (Movezeroes)
}