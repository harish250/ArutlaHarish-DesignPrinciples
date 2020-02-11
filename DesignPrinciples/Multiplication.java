package DesignPrinciples;
public class Multiplication implements Calculator
{

    @Override
    public void compute(int n1, int n2) {
        int Multiplication = n1 * n2;
        System.out.println("The Multiplication of two numbers is "+Multiplication);
    }

}