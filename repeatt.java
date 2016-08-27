import java.util.*;
class repeatt
{
public static void main(String args[])
{
int a[]={1,2,3,3};
int count=0;
for(i=0;i<a.length-1;i++)
{
for(j=i+1;j<a.length-1;j++)
{
if(a[i]==a[j])
{
count++;
}
}
if(count==2)
{
System.out.println(a[i]);
}
}
}}



