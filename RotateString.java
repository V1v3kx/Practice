package dailyPractice;

public class RotateString {
	
	public static void main(String[] args) {
		String s = "abcde", goal = "deabc";
		System.out.println(rotateString(s,goal));
	}
	    public static boolean rotateString(String s, String goal) {
	        boolean correct=false;
	        char[] arr=s.toCharArray();
	        if(s.length()!=goal.length()){
	            correct=false;
	            return false;
	        }
	        for(int i=0;i<arr.length;i++){
	            char first=arr[0];
	            for(int j=0;j<arr.length-1;j++) {
	            		arr[j]=arr[j+1];
	            }
	            arr[arr.length-1]=first;
	            if(new String(arr).equals(goal)) {
	            		correct=true;
	            		return correct;
	            }
	        }
	        return correct;
	    }
	}

