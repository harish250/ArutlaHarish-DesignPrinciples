package DesignPrinciples;
public class Substract implements Calculator
{

    @Override
    public void compute(int n1, int n2) {
        int substract = n1 - n2;
        System.out.println("The Substract of two numbers is "+substract);
    }

}