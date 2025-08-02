package myproject;
import java.util.*;
public class data_example {
  public static void main(String main[]) {
    Date d=new Date();
    System.out.println("create date is"+d);
    int month=d.getMonth();
    System.out.println(month);
    int year=d.getYear();
    System.out.println(year);
    System.out.println(d.getMinutes());
    System.out.println(d.getHours());  
  }

}