import java.util.*;
class reverse
{
public static void main(String args[])
{
String orginal,rev,place="";
int i;
Scanner in=new Scanner(System.in);
orginal=in.nextLine();
String s[]=orginal.split(" ");
for(i=s.length-1;i>=0;i--)
{
place=place+s[i];
}
System.out.println(place);
}
}



