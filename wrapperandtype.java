#wrapper class
package myproject;

public class wrapper {
  public static void main(String args[]) {
    Integer a=564;
    Boolean b=true;
    Double d=9.876d;
    int c=10;
    System.out.println(a.toString().length());
    System.out.println(d.toString().length());
    
  }

}


#type conversions

package myproject;

public class autoboxing {
  public static void main(String args[]) {
    int a=10;
    Integer obj=a;
    System.out.println("Autoboxing"+obj);
    
    Integer ob1=20;
    int b=ob1;
    System.out.println("Unboxing "+b);
    
  }

}