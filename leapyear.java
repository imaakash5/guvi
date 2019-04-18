import java.util.*;
class Leap
{
public static void main()
{ Scanner y=new Scanner (System.in);
System.out.println("Enter a year to check whether it is leap or not");
year=y.nextInt();
if (year%4==0)
{
if (year%100==0 && year%400==0)
System.out.println(year+"is a leap year");
}
else
{
System.out.println(year+"is not a leap year");
}
}
}
