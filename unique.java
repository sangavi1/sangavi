import java.util.*;
class unique
{
public static void main(String args[])
{
int a=new int[10];
Scanner in=new Scanner(System.in);
for(i=0;i<5;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(a[i]==a[j])
{
count++;
}
}
if(count===1)
{
System.out.println(a[i])
}
}
}
}

