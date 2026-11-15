class Solution {
    public int numOfSubarrays(int[] arr) {
        int prefixSum=0;
        int oddCount=0;
        int evenCount=1;
        long result=0;
        for(int i=0;i<arr.length;i++){
            prefixSum=prefixSum+arr[i];
            if(prefixSum%2!=0){
                result=(result+evenCount) % 1000000007;
                oddCount++;
            }else{
                result=(result+oddCount) % 1000000007;
                evenCount++;
            }
        }
        return (int) result;
    }
}