
package employemanagement;


public class Employee 
{
    String Name;
    double Salary;

    public Employee(String Name, double Salary) 
    {
        this.Name = Name;
        this.Salary = Salary;
    }
    
     void display() 
    {
        System.out.println("Employee Name: " + Name);
        System.out.println("Salary: Rs. " + Salary);
    }
}
