public class EqualsIgnoreCase
{
public static void main(String [] args)
{
String s1="HELLO";
String s2="hello";
String s3="HEllO";
String s4="HELLO";
//IgnoreCase to verify the data
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s2.equalsIgnoreCase(s3));
System.out.println(s3.equalsIgnoreCase(s4));
}
}