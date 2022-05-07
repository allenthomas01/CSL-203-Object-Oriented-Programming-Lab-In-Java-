import java.util.Scanner; 
import java.io.FileReader; 
import java.io.FileWriter;
import java.io.FileNotFoundException; 

class filewrre
{
public static void main(String args[])
{
 try
 {
System.out.print("--------------\n\n\n"); 
System.out.print("Enter the text to insert : "); 
 Scanner s = new Scanner(System.in);
 String str = s.nextLine();
FileWriter file = new FileWriter("sample.txt"); 
file.write(str);
file.close();
System.out.print("\nText written succesfully");
 }
catch(Exception e)
 {
System.out.print("\nError occurred"); 
e.printStackTrace();
 }
try
{
char ch[] = new char[100];
FileReaderrd = new FileReader("sample.txt"); 
rd.read(ch);
System.out.println("\n\nThe contents in the file is \n"); 
System.out.println(ch);
System.out.print("\n\n\n--------------"); 
rd.close();
}

catch(Exception e)
{
System.out.print("\nError occurred"); 
e.printStackTrace();
}
}
}
