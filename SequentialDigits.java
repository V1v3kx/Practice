import java.util.*;

class SequentialDigits{
    public static void main(String[] args) {
        int low = 100, high = 300;
        String s="123456789";
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=s.length();i++){
            for(int j=0;i+j<s.length();j++){
                String sub=s.substring(j,j+i);
                int num=Integer.parseInt(sub);
                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        System.out.println(list);
    }
}