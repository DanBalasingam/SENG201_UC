package lab2;

/* 
This class will be used to implement methods that test expressions. Implement the following methods (remember to first sketch a UML class diagram and implementing/testing and running your solution in IntelliJ before submitting your answer):

float addition(float f1, float f2), a method which add two floats together.
float subtraction(float f1, float f2), a method which subtracts two floats from each other.
float multiplication(float f1, float f2), a method which multiplies two floats with each other.
int intDivision(int i1, int i2), a method which performs integer division.
float floatDivision(float f1, float f2), a method which performs float division.
double circumference(double radius), a method which computes the circumference from a radius. For reference the formula for circumference is: 2 π r
double toAU(double metres), a method which converts a given length in metres to astronomical units. The conversion units: 149597870700.0 or 6.684587122268445468305e-12 may help, depending on whether you are dividing or multiplying the length. Check the example test cases given.
Note, you will need to use the PI constant from the Math class for circumference. Look it up in Java API. Also, priorities of arithmetic operators in Java are like in most other programming languages, 
i.e., multiplication/division have higher priority than addition/subtraction, but parentheses can be used to override priority rules. 
Also, there is a "left to right" association (e.g., 3 * 6 / 2 = 9; 12 / 2 / 3 = 2; 2 * 6 % 2 = 0; 6 % 4 / 2 = 1).
*/

public class SpaceCalculations {

    public float addition(float f1, float f2) {
        return f1 + f2;
    }

    public float subtraction(float f1, float f2) {
        return f1 - f2;
    }

    public float multiplication(float f1, float f2) {
        return f1 * f2;
    }

    public int intDivision(int i1, int i2) {
        return i1 / i2;
    }

    public float floatDivision(float f1, float f2) {
        return f1 / f2;
    }

    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double toAU(double metres) {
        return 6.684587122268445468305e-12 * metres;
    }
}
