
package vehiclemanagement;

public class MotorCycle extends Vehicle
        
{
    String Type;

   public MotorCycle(String Brand, int Year,String Type) 
    {
        super(Brand, Year);
        this.Type=Type;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Type: " + Type);
    }
}
