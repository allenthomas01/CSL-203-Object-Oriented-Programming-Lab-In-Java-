abstract class shape
{
abstract void numberOfSides();
}


class rectangle extends shape
{
public void numberOfSides()
{
System.out.println("Number of sides of rectangle : 4");
}
}

class triangle extends shape
{
public void numberOfSides()
{
System.out.println("Number of sides of triangle : 3");
}
}


class hexagon extends shape
{
public void numberOfSides()
{
System.out.println("Number of sides of hexagon : 6");
}
}


class abstractprogram
{
public static void main(String args[])
{
rectangle r=new rectangle(); 
triangle t=new triangle(); 
hexagon h=new hexagon(); 
System.out.print("--------------\n\n\n"); 
r.numberOfSides(); 
t.numberOfSides(); 
h.numberOfSides();
System.out.print("\n\n\n--------------"); 
}
} 
