import java.util.*;
 class Sum
{
public static void main(String[] args)

{int n;
    Scanner y=new Scanner (System.in);
System.out.println("Enter n");
n=y.nextInt();
for(int i=1;i<=n;i++)
{
    sum=sum+i;
}
System.out.println("sum of"+ n+ "natural numbers"+sum);}
}
