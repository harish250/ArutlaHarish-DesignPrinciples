package DesignPrinciples;
public class Division implements Calculator
{

    @Override
    public void compute(int n1, int n2) {
        int div = n1/n2;
        System.out.println("The Divison of two numbers is "+div);
    }

}