
import java.util.*;
 class Prime
{
public static void main(String[] args)

{int n,d,number;
int num=0;
    Scanner y=new Scanner (System.in);
System.out.println("Enter n ");
n=y.nextInt();
for(int i=2;i<=n-1;i++)
{
 if(n%i==0)
 {
	num=1;
 }
}
if (num==1)
{
	 System.out.println("no");
 }
 else
		 {
	 System.out.println("yes");}
	 
}
}
