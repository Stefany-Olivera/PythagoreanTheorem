import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int sideA, int sideB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
        // double hypothenuse= (Math.pow(sideA,2))+(Math.pow(sideB,2));
        double hypothenuse = (sideA)^2 + (sideB)^2;          
        double squareRoot =  Math.sqrt(hypothenuse);       
        return squareRoot;
        // return Math.sqrt(hypothenuse);
    }
}