import java.util.*;
class fact
{
public static void main(String args[])
{
int num,i,fac=1;
Scanner in=new Scanner(System.in);
num=in.nextInt();
for(i=1;i<=num;i++)
{
fac=fac*i;
}
System.out.println("the factorial of"+num+"is"+fac);
}
}
