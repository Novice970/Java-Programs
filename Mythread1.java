class MyThread1 implements Runnable
{
public void run()
{
System.out.println("Hello");
}
public static void main(String args[])
{
MyThread1 th1=new MyThread1();
Thread th= new Thread(th1);
th.start();
}
}