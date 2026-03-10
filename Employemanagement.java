
package employemanagement;

public class Employemanagement 
{

    public static void main(String[] args)
    {
      
        System.out.println("Employee Management System");
        System.out.println("--------------------------");

        Employee em = new Employee("Selva", 50000);
        Manager mr = new Manager("Mahendra", 80000, "IT");

        em.display();
        System.out.println();

        mr.display();
        System.out.println();
        
    }
    
}
