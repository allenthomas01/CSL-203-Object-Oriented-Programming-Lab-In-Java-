import java.util.Scanner; 

class Employee
{
public String name; 
public String address; 
public int age;
public String mob; 
public float salary; 
  public void printsalary()
  {
System.out.print("\nSalary of the employee is "+salary);
  }
}

class Officer extends Employee
{
public String specialization;
}


class Manager extends Employee
{
public String department;
}


class Empinheritance{
public static void main(String args[])
{
Officer of = new Officer(); 
Manager mn = new Manager();
Scanner in = new Scanner(System.in); 
Scanner sc = new Scanner(System.in);
System.out.print("--------------\n\n\n"); 
System.out.print("\n\n\tEnter the details of officer\n"); 
System.out.print("Enter the name : ");

of.name = sc.nextLine(); 
System.out.print("Enter the address : "); 
of.address = sc.nextLine(); 
System.out.print("Enter mobile number : "); 
of.mob = sc.nextLine(); 
System.out.print("Enter age : " );
of.age = in.nextInt(); 
System.out.print("Enter specialization : "); 
of.specialization = sc.nextLine(); 
System.out.print("Enter salary : "); 
of.salary = in.nextFloat();
System.out.print("\n\n\tEnter the details of manager\n");
System.out.print("Enter the name : ");
mn.name = sc.nextLine(); 
System.out.print("Enter the address : ");
mn.address = sc.nextLine(); 
System.out.print("Enter mobile number : "); 
mn.mob = sc.nextLine(); 
System.out.print("Enter age : " );
mn.age = in.nextInt(); 
System.out.print("Enter department : "); 
mn.department = sc.nextLine(); 
System.out.print("Enter salary : "); 
mn.salary = in.nextFloat();
System.out.print("\n\t\t---  Printing the details ---"); 
System.out.print("\n\n\t The details of the officer \n\n");
System.out.print("Name : "+of.name); 
System.out.print("\nAddress : "+of.address);
System.out.print("\nMobilenumber : "+of.mob); 
System.out.print("\nspecialization : "+of.specialization); 
of.printsalary();
System.out.print("\n\n\t The details of the manager \n\n");
System.out.print("Name : "+mn.name); 
System.out.print("\nAddress : "+mn.address); 
System.out.print("\nMobilenumber : "+mn.mob); 
System.out.print("\nDepartment : "+mn.department); 
mn.printsalary(); 
System.out.print("\n\n\n--------------"); 

}
}


