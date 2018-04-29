package mypackage;

/* Java program to demonstrate that annotations are
not barely comments (This program throws compiler
error because we have mentioned override, but not
overridden, we haver overloaded display) */
class Base
{
  public void display()
  {
      System.out.println("Base display()");
  }
}
class AnnotationsDemo extends Base
{
  //@Override
  public void display()
  {
      System.out.println("Derived display(int )");
  }

  public static void main(String args[])
  {
      AnnotationsDemo obj = new AnnotationsDemo();
      obj.display();
  }
}