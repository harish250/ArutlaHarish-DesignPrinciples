class Anonymus
{
    public static void main(String[] args) {
        Runnable r= new Runnable()
        {
           public void run()
           {
               System.out.println("Anonymus");
           }
        };
        Thread t=new Thread(r);
        t.start();
    }
}
