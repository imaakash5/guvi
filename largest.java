import java.util.*;
class Largest
{
public  static  void main()
{int a,b,c;
Scanner y =new Scanner(System.in);
System.out.println("Enter three numbers");
a=y.nextInt();
b=y.nextInt();
c=y.nextInt();
if (a>b && a>c)
{
System.out.println(a+" is largest");
else if(b>c && b>a)
{
System.out.println(b+" is largest");
}
else
System.out.println(c+" is largest");
}
}
}
