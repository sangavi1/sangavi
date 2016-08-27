import java.util.*;
class large
{
public static void main(String args[])
{
int a,b,c;
Scanner in=new Scanner(System.in)
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b&&a>c)
{
System.out.println("a is large");
}
else if(b>c)
{
System.out.println("b is large");
}
else
{
System.out.println("c is large");
}
}
}
