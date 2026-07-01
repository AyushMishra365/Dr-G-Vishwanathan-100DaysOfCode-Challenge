public class AngleBetweenHandsOfAClock {
    public static double angleClock(int hour, int minutes) {
        hour%=12;
        double angle_minutes=6*minutes;
        double angle_hours=(hour*30)+(0.5*minutes);
        double difference=Math.abs(angle_hours-angle_minutes);
        return Math.min(difference,360-difference);
    }
    public static void main(String[] args) {
        int hour = 12;
        int minutes = 30;
        System.out.println(angleClock(hour, minutes));
    }
}

