
// Class that calculates the Babylonian method
public class Babylonian
{
 
  
  /**
  public void prompt(double x)
  {
     System.out.println("Please enter the number, and I'll calculate the square root");
    double number = scanner.nextDouble();
    number = x;
  }
  **/
  
  /**Method to calculate square root
    * @return double
    * 
    * */
  
/**  System.out.println("Please enter the number, and I'll calculate the square root");
    double number = scanner.nextDouble(); **/
  

  

    
  /** Square Root method calculates the Square root
    * @param - the initial number and the acceptable Error
    **/
  
  public void squareRoot(double x, double acceptableError)
  { 
    
    double guess = x/2;
    System.out.println(" This is the guess "  + guess);
     double error =  Math.abs((guess * guess) - x);
     System.out.println("The error is " + error);
    if(error <= acceptableError)
    {
      
      System.out.println("This is the final " + guess);
    }
    else
    {
     double newGuess = ((guess + (x/guess)));
     System.out.println(" This is the new guess " + newGuess);
      squareRoot(newGuess, acceptableError);
    }
    
     System.out.println("The square root is " + guess);
     
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
   
 