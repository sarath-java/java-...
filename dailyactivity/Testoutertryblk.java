public class Testoutertryblk {

public static void main(String[] args) {
try
{
try
{


int array[]= {10,20,40};
System.out.println(array[3]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Invalid index:");
}
System.out.println(1/0);
}

catch(ArithmeticException e)
{
System.out.println("divide by zero error");


}
}
}
