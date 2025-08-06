package greater;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class ofhrrs {
	public static void main(String[] args) {

        LocalTime os = LocalTime.of(9, 0);
        LocalTime oe = LocalTime.of(18, 0);
        LocalTime li = LocalTime.of(9, 15);
        LocalTime lo = LocalTime.of(17, 45);
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("Current Time: " + currentTime.format(formatter));

      
        if (!li.isBefore(os) && !li.isAfter(oe)) {
            System.out.println("Login is in  office hours");
        } else {
            System.out.println("Login is out in office hours");
        }

        if (!lo.isBefore(os) && !lo.isAfter(oe)) {
            System.out.println("Logout is in office hours");
        } else {
            System.out.println("Logout is out in  office hours");
        }


        Duration wd = Duration.between(li,lo);
        long hours = wd.toHours();
        long minutes = wd.toMinutes() % 60;

        System.out.println("Total Working Time: " + hours + " hours and " + minutes + " minutes");
    }

}
