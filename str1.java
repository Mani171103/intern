import java.util.*; 
class str1
{
public static void main(String args[])
{
String s1="Bhagirath"; 
System.out.println("S1="+s1); int length=s1.length();
System.out.println("S1 Length="+ length);
System.out.println("S1 Lowercase="+s1.toLowerCase()); 
System.out.println("S1 Uppercase="+s1.toUpperCase()); 
System.out.println("S1 Replace a with z="+s1.replace('a','z')); 
System.out.println("S1 LastIndexOf('e')="+s1.lastIndexOf('e')); 
String s2="view sonic";
System.out.println("S1 ="+s2);
System.out.println("S1 and S2 Trim="+s1.trim()+s2.trim());
System.out.println("S1 and S2 Equals="+s1.equals(s2));
System.out.println("S1 and S2 Equals ingnoring case="+s1.equalsIgnoreCase(s2)); 
System.out.println("S1 and S2 Compare To="+s1.compareTo(s2)); 
System.out.println("S1 and S2 Concate ="+s1.concat(s2));
System.out.println("S1 and S2 Substring(n)="+s1.substring(5)); 
System.out.println("S1 Substring(n,m)="+s1.substring(5,8)); 
System.out.println("S1 to String()="+s1.toString());
int i=100;
System.out.println("S1 valueOf(variable)="+(s1.valueOf(i)).length()); 
System.out.println("Start with"+s1.startsWith("P")); 
System.out.println("End with"+s1.endsWith("y"));
}
}
