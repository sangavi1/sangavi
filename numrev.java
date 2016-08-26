import java.util.*;
class numrev
{
public static void main(String args[])
{
int num,rev=0,a;
Scanner in=new Scanner(System.in);
num=in.nextInt();
while(num!=0)
{
a=num%10;
rev=a+rev*10;
num=num/10;
}
System.out.println(rev);
}
}
