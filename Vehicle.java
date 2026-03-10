
package vehiclemanagement;

public class Vehicle 
{
    String Brand;
    int Year;

    public Vehicle(String Brand, int Year) 
    {
        this.Brand = Brand;
        this.Year = Year;
    }
    void display()
    {
        System.out.println("Brand :" + Brand );
        System.out.println("Year :" + Year );
    }
    
    
}
