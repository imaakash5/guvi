import java.util.*;
 class Input
{
public static void main(String[] args)

{int n,k;
int sum=0;
int a[]=new int[20];

    Scanner y=new Scanner (System.in);
System.out.println("Enter n and k");
System.out.println("Enter an array of n integers");
n=y.nextInt();
k=y.nextInt();

for(int i=0;i<n;i++)
{
    a[i]=y.nextInt();
}
for(int i=0;i<k;i++)
{
    sum=sum+a[i];
}

System.out.println("sum of--"+ k+ " numbers--"+sum);}

}
