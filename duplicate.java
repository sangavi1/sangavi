import java.util.*;
class duplicate
{
public static void main(String args[])
{
String s="haihello";
char a[]=s.toCharArray();
Set<Character> ch=new LinkedHashSet<Character>();
for(char c:a)
{
ch.add(c);
}
System.out.print(ch);
}
}

