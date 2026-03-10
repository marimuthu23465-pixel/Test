
package vehiclemanagement;

public class Vehiclemanagement 
{

    public static void main(String[] args)
    {
        Car cr = new Car("Toyoto",2022,5);
        MotorCycle mc = new MotorCycle("Yamaha",2020,"Sports");
        
        cr.display();
        System.out.println();
 
        mc.display();
        System.out.println();
    }
    
}
