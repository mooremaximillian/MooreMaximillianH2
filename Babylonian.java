//imports the scanner class from API
import java.util.Scanner;
// Class that calculates the Babylonian method
public class Babylonian
{
  // creates instance of Scanner
  Scanner scanner = new Scanner(System.in);
  
  // constructor method 
  public Babylonian()
  {
    
  }
  
  public void calculate()
  {
    System.out.println("Please enter the number, and I'll calculate the square root");
    double number = scanner.nextDouble();
    double sqrtNumber = Math.sqrt(number);
    double guess = number/2;
    if((guess-number)>=-.20 && (guess-number)<=.20)
      System.out.println(guess);
    else
    {
     double nextGuess = 0.5*(guess + (number/guess));
     System.out.println(nextGuess);
           }

   
  }
  
}
   
 