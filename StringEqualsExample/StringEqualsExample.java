public class StringEqualsExample
{
public static void main(String [] args)
{
String s1="HELLO";
String s2=new String("hello");
String s3=new String("HEllO");
String s4="HELLO";
//data comparison
System.out.println(s1.equals(s2));
System.out.println(s2.equals(s3));
System.out.println(s3.equals(s4));
}
}