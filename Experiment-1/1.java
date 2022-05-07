import java.util.Scanner; 

public class palindrome{
public static void main(String[] args)
{
String str, rev = ""; 
System.out.print("--------------\n\n\n");
System.out.print("Enter a string : "); 
Scanner sc = new Scanner(System.in); 
str = sc.nextLine();
int len = str.length();
for (int i = len - 1; i>= 0; i--)
{
rev = rev + str.charAt(i);
}
if (str.equalsIgnoreCase(rev))
{
System.out.println(str + " is a palindrome string");
}
else
{
System.out.println(str + " is not a palindrome string");
}
System.out.print("\n\n\n--------------");
}
}
