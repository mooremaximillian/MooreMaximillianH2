//imports the scanner class from API
import java.util.Scanner;
// Class that calculates the Babylonian method
public class Babylonian
{
  // creates an instance of Scanner
  Scanner scanner = new Scanner(System.in);
  double number;
  
  // constructor method 
  public Babylonian()
  {
    
  }
  /**
  public void prompt(double x)
  {
     System.out.println("Please enter the number, and I'll calculate the square root");
    double number = scanner.nextDouble();
    number = x;
  }
  **/
  
  /**Method to calculate square root
    * @return void
    * 
    * */
  
  public double squareRoot(double x, double acceptableError)
  { 
    double guess = x/2;
     double error = (guess * guess) -x ;
    if(error <= acceptableError)
    {
      return guess;
    }
    else
    {
     double  newGuess = (0.5*(guess + (x/guess)));
     System.out.println(newGuess);
      squareRoot(newGuess, acceptableError);
    }
     return guess;
  }
      
   
  /**  
  public void calculate()
  {
    
    double sqrtNumber = Math.sqrt(number);
    double guess = number/2;
    if((guess-number)>=-.20 && (guess-number)<=.20)
      System.out.println(guess);
    else
    {
     double nextGuess = 0.5*(guess + (number/guess));
     System.out.println(nextGuess);
     calculate();
           }

   
  }
  **/
  
}
   
 