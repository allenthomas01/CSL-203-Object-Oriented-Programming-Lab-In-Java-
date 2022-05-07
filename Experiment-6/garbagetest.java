public class garbagetest
{
public void finalize()
{
System.out.println("Garbage collected");
}
public static void main(String args[])
{ 


garbagetest t1 = new garbagetest(); 
garbagetest t2 = new garbagetest(); 
    t1 = null;
    t2 = null; 
System.gc();

}
}


