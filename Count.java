
import java.util.*;
 class Input
{
public static void main(String[] args)

{int n,d;
int count=0;
    Scanner y=new Scanner (System.in);
System.out.println("Enter n ");
n=y.nextInt();
while(n!=0)
{
    d=n%10;
    count++;
    n=n/10;
}
System.out.println(count);}
}
