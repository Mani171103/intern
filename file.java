import java.io.File;
import java.io.*;
import java.io.IOException;
import java.lang.*;
import java.util.*;
class file
{
public static void main(String[] arg) throws IOException
{

System.out.println("FILE OPERATION");
System.out.println("1.Creating a new file");
System.out.println("2.Last Modified");
System.out.println("3.Create a file Specified Directory");
System.out.println("4.Check a file Exit or Not");
System.out.println("5.Make a file Read-only");
System.out.println("Enter your choice:");
try
{
BufferedReader objBuffReader = new BufferedReader(new InputStreamReader(System.in));
String strLine = objBuffReader.readLine();
int ch = Integer.parseInt(strLine);
switch(ch)
{
case 1:
try
{
File file = new File("D:/JAVA");
if(file.createNewFile());
System.out.println("Success");
}
catch (IOException e)
{
e.printStackTrace();
}
break;
case 2:
{
File file = new File("D:/JAVA");
Long lastmodified = file.lastModified();
Date date = new Date(lastmodified);
System.out.println(date);
}
break;
case 3:
{
File file = null;
File dir = new File("D:/JAVA");
file = File.createTempFile("javaTemp",".javatemp", dir);
System.out.println(file.getPath());
}
break;
case 4:
{
File file = new File("D:/JAVA");
System.out.println(file.exists());
}
break;
case 5:
{
File file = new File("D:/JAVA");
System.out.println(file.setReadOnly());
System.out.println(file.canWrite());
}
break;
}
}
catch (IOException e)
{
System.out.println("Error: Invalid IO Operation.");
}
}
}

