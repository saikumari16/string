public class Comparsion1
{
public static void main(String [] args)
{
String s1="HELLO";
String s2=new String("hello");
String s3=new String("HEllO");
String s4="HELLO";
//address comparison
System.out.println(s1==s2);
System.out.println(s2==s3);
System.out.println(s3==s4);
}
}