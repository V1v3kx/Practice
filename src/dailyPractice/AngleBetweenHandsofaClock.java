package dailyPractice;

public class AngleBetweenHandsofaClock {
	public static void main(String[] args) {
		Solution33 s=new Solution33();
		int hour=12;
		int minutes=30;
		System.out.println(s.angleClock(hour,minutes));
	}
}


class Solution33 {
    public double angleClock(int hour, int minutes) {
        double hourangle=0;
        if(hour==12) {
        		hour=0;
        }
        
        if(hour>=0 && hour<12){
            double onehour=30;
            double houtminangle=0.5;
            hourangle=(hour*onehour)+(houtminangle*minutes);
        }
        double minangle=0;
        if(minutes>=0 && minutes<=60){
            int onemin=6;
            minangle=minutes*onemin;
        }
        double angle=Math.abs(hourangle-minangle);
        double final_angle=0;
        if(angle<360-angle) {
        	final_angle=angle;
        }else {
        	final_angle=360-angle;
        }
        return final_angle;
    }
}