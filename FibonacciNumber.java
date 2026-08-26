package practice;

public class FibonacciNumber {
	    public static int fib(int n) {
	        int first=0;
	        int second=1;
	        int fib=0;
	        if(n==0){
	            return first;
	        }else if(n==1){
	            return second;
	        }else{
	            for(int i=2;i<=n;i++){
	                fib=first+second;
	                first=second;
	                second=fib;
	            }
	        }
	        return fib;
	    }
	    public static void main(String[] args) {
			System.out.println(fib(10));
		}
}
