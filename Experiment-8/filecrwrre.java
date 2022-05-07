
import java.util.Scanner; 
import java.io.File; 
import java.io.FileReader; 
import java.io.FileWriter;
import java.io.FileNotFoundException;

class filecrwrre
{
  public static void main(String args[])
   { 
    Scanner s = new Scanner(System.in);
      try
       {

System.out.print("--------------\n\n\n"); 
System.out.print("Enter file Name : "); 
        String filename = s.nextLine(); 
        File create = new File(filename); 
         if(create.createNewFile())
            {
System.out.println("File created succesfully "+create.getName());
            }
         else
            {
System.out.println("File already Exist");
            }
       }

     catch (Exception e)
       {
System.out.println("An error occurred."); 
e.printStackTrace();
       }
          try
            {
System.out.print("\nEnter the text to insert : "); 
            String str = s.nextLine();
FileWriter file = new FileWriter("filename"); 
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
FileReaderrd = new FileReader("filename"); 
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

