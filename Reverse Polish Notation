package rpn;
import java.util.Scanner;
import java.util.Stack;
/**
* This class implements the Reverse Polish Notation ADT, providing support for manipulation
* of numbers.

* Description: This class provides an method for RPN strings. Users of this class are
* provided methods to manipulate numbers in an counterintuitive manner. For example,
* arithmetic (+, -, *, /) operators and doubles are valid inputs, others are not.
* RPN does not inherit from other classes, and is not anticipated to
* be a base class for other classes.
*/
public class RPN {

    public static void main(String[] args) throws InvalidRPNString {
        }
    
    public static Double findRPN(String input)  throws InvalidRPNString {
        
        Scanner toParse = new Scanner( input );
        Stack calculate = new Stack();
        //Doubles declared to interact with operators
        Double a = 0.0;
        Double b = 0.0;
        
        while (toParse.hasNext()){
           //accepting doubles, otherwise checking for operator
           if (toParse.hasNextDouble()) {
            calculate.push(Double.parseDouble(toParse.next()));
           }
           
           //now checking for operators
           else {
               //if an operator doesn't have two numbers in front, exception
               if (calculate.size() >= 2) {
                
                //pushing result of operators onto the stack after popping
                switch (toParse.next()) {
                   case "+":
                       a = (Double) calculate.pop();
                       b = (Double) calculate.pop();
                       calculate.push(a + b);
                       break;
                   case "-":
                       a = (Double) calculate.pop();
                       b = (Double) calculate.pop();
                       calculate.push(b - a);
                       break;
                   case "/":
                       a = (Double) calculate.pop();
                       b = (Double) calculate.pop();
                       if (a == 0.0) {
                           throw new InvalidRPNString();
                       }
                       calculate.push(b/a);
                       break;
                   case "*":
                       a = (Double) calculate.pop();
                       b = (Double) calculate.pop();
                       calculate.push(a*b);
                       break;
                   default:
                       //not an operator means exception
                       throw new InvalidRPNString();
               }
              }
               
               else {
                   //too few operands
                   throw new InvalidRPNString();
               }
        }    
    }
    //too many operands is also no good
    if (calculate.size() != 1) {
        throw new InvalidRPNString();
    }
        //everything worked as it should
        return (Double) calculate.pop();  
    }
}
    

