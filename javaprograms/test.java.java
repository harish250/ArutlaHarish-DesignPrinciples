class Math2
{
    static int kg,pound;
    public static float convertTopound(int  kg)
    {
        return kg*2.2046f;
    }
    public static float convertTokg(int pound)
    {
        return pound*0.4535f;
    }
}
class test
{
    public static void main(String[] args) {
        float p1=Math2.convertTokg(3);
        float p2=Math2.convertTopound(2);
        System.out.println("3Pounds in kg="+p1);
        System.out.println("2kg in pounds="+p2);
    }
}