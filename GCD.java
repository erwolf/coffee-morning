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
*
* Description: This class provides the method for implementing the GCD class.
*/
public class GCD {
     public static double GCD(int a, int b) {
        if (b == 0) {
       if (a < 0) {
         a = -a;
       }
        return a;
    }
    //no real GCD
    if (b == 1) {
      return 1;
    }
    //calling function recursively
    else {
      return GCD(b, a%b);
    }

  }

}
