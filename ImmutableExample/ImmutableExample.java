public class ImmutableExample
{
public static void main(String [] args)
{
String s1="hello";
String s2=s1+"world";
System.out.println("concatenated string:"+s2);
s1=s1+"java";
System.out.println("updated original string:"+s1);
}
}