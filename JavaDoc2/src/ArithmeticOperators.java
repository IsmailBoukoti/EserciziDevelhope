/**
 * This class  creates different methods for arithmetic operations
 * @author Ismail Boukoti
 */

public class ArithmeticOperators {
    /**
     * This method takes 2 integer inputs and returns the sum
     * @param num1 first integer input
     * @param num2 second integer input
     * @return returns the sum of the 2 parameters
     */
    public int sum(int num1, int num2){
        return num1 + num2;
        }

    /**
     * This method takes 2 integer inputs and returns the difference
     * @param num1 first integer input
     * @param num2 second integer input
     * @return returns the difference of the 2 parameters
     */
    public int sub(int num1, int num2){
        return num1 - num2;
        }

    /**
     * This method takes 2 integer inputs and returns the product
      * @param num1 first integer input
     * @param num2 second integer input
     * @return returns the product of the 2 parameters
     */
    public int mul(int num1, int num2){
        return num1 * num2;
    }

    /**
     * This method takes 2 double inputs and returns the quotient
     * Since the result might be a floating point number I'm using double over int for a more precise result
     * @param num1 first double input
     * @param num2 second double input
     * @return returns the quotient of the 2 parameters
     */
    public double div(double num1, double num2){
        return num1 / num2;
    }
}
