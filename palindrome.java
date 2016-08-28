import java.util.*;
class palindrome
{
public static void main(string args[])
{
int i,a,rev=0,or;
Scanner in=new Scanner(System.in);
i=in.nextInt();
or=i;
while(i!=0);
{
a=a%10;
rev=rev*10+a;
a=a/10;
}
if(or==rev)
{
System.out.println("palindram");
}
else
{
System.out.println("not palindram");
}
}
}

