import java.io.*;
class Vowel
{char ch;
public static void main()
{ Scanner y=new Scanner (System.in);
s=y.next();
if (s.equalsIgnoreCase(a)||s.equalsIgnoreCase(e)||s.equalsIgnoreCase(i)||s.equalsIgnoreCase(o)||s.equalsIgnoreCase(u))
{
System.out.println("Character is vowel");
}
else if(s >= 'a' && s<='z'||s >= 'A' && s<='Z')
System.out.println("Character is consonant");
else 
  System.out.println("Character is invalid");
}
}

