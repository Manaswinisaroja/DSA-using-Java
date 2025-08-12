package Arrays;
public class SimpleArray {
    public static void main(String[] args) {
        String week[];
        week = new String[7];
        week[0] = "Sunday";
        week[1] = "Monday";
        week[2] = "Tuesday";
        week[3] = "Wednesday";
        week[4] = "Thursday";
        week[5] = "Friday";
        week[6] = "Saturday";
        System.out.println("Days in Week are : ");
        for(int i = 0;i<7;i++){
            System.out.print(week[i]+" ; ");
        }
    }
}
