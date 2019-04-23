
import java.util.*;
 class Palindrome
{
public static void main(String[] args)

{int n,d,number;
int num=0;
    Scanner y=new Scanner (System.in);
System.out.println("Enter n ");
n=y.nextInt();
number=n;
while(n!=0)
{
    d=n%10;
    num=num*10+ d;
    n=n/10;
}
if(num==number)
{
System.out.println("yes");}
else
{
	System.out.println("no");
}
}
}
