import java.io.*;
class Even
{
public static void main()
{int number;
Scanner y=new Scanner(System.in);
System.out.println("Enter a number to check whether it is odd or even");
if(number % 2==0)
{
System.out.println("Number is even");
}
else if(number <=0)
{
System.out.println("Number is unvalid");
}

else
{
System.out.println("Number is odd");
}
}
}

