
package vehiclemanagement;

public class Car extends Vehicle
        
{
    int Seat;

    public Car(String Brand, int Year, int Seat) 
    {
        super(Brand, Year);
        this.Seat=Seat;
    }
   @Override
    void display()
    {
        super.display();
        System.out.println("Seat : "+Seat);
    }          
}
