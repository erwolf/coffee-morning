/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeric;

/**
* This class implements the GCD and Factorial classes, providing support for manipulation
* of numbers.
*
* @author Emily Wolf
* @version 1.0
* File: GCDandFactorial.java
* Created: Sept 2015
* Summary of Modifications:
* 17 Sept 2015 – ERW – fixed clearing of error messages
*
* Description: This class provides the method for implementing the factorial class.
*/
public class  Factorial { 
      public static double factor(double factorInt) {
    //special case
    double f = factorInt;
    if (f == 0) {
      return 1.0;
    }

    //regular case
    for (double i = f - 1 ; i > 1; i--) {
      f *= i;
    }
    return f;
  }

}
