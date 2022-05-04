class parent
{
void disp()
{
System.out.println("Parent class invoked...");
}
}
class Child1 extends parent
{
void disp1()
{
System.out.println("Child1 calss invoked...");
}
}
class Child2 extends parent
{
void disp2()
{
System.out.println("Child class invoked...");
}
}
class work3
{
public static void main(String args[])
{
Child2 c=new Child2();
c.disp();
c.disp2();
Child1 c1=new Child1();
c1.disp1();
c1.disp();
}
}