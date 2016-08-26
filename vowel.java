import java.util.*;
class vowel
{
public static void main(String args[])
{
char a;
Scanner in=new Scanner(System.in);
a=in.next();
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
System.out.println("vowel");
}
else if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}
