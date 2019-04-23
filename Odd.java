
import java.util.*;
 class Odd
{
public static void main(String[] args)

{int n,q;
    Scanner y=new Scanner (System.in);
System.out.println("Enter n ");
n=y.nextInt();
System.out.println("Enter 2nd interval ");
q=y.nextInt();

for(int i=n;i<=q;i++)
{
 if(i%2!=0)
 {
	 System.out.println(i);
 }
}

}
}
