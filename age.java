package greater;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class age {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("enter your date: ");
 int date=s.nextInt();
 System.out.println("enter your month: ");
 int month=s.nextInt();
 System.out.println("enter your year: ");
 int year=s.nextInt();
 LocalDate now=LocalDate.now();
 System.out.println("current date: "+now);
 LocalDate dob= LocalDate.of(year, month, date);
 Period diff=Period.between(now, dob);
 System.out.println("Current age is ");
 System.out.print(diff.getYears()+"years");
 System.out.print(diff.getMonths()+"months");
 System.out.print(diff.getDays()+"days");
 
}
}
