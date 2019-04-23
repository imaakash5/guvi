
import java.util.*;
 class Arms
{
public static void main(String[] args)

{int n,sum,number,num,d;
 sum=0;
    Scanner y=new Scanner (System.in);
System.out.println("Enter n ");
n=y.nextInt();
number=n;
if (n<=100000)
{
while(n!=0)
{
d=n%10;
num=d*d*d;
sum=sum+num;
n=n/10;
}
 }
if (sum==number)
{
System.out.println("yes");
}
else
{System.out.println("no");}
}

}
