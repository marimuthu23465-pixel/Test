
package employemanagement;


public class Manager extends Employee

{
    String Dept;
    public Manager(String Name, double Salary, String Dept)
    {
        super(Name, Salary);
        this.Dept=Dept;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("department : "+Dept);
    }
    
}

       
    
}
