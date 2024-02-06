import java.util.*;

public class Conversion {
    public static void main(String[] args) throws Exception {
      System.out.println("Please enter a temperature in Celsius ");
      
      Scanner input = new Scanner(System.in);

      // retrieve Celsius from input
      double celsius = input.nextDouble();

      // convert Celsius to Fahrenheit
      double fahrenheit = (9.0/5) * celsius + 32;

      System.out.println("The value in Fahrenheit is " + fahrenheit);
    }
}
