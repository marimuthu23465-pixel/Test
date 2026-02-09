import java.util.Scanner;
class GarmentShop
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	
		System.out.println("Welcome to Selva Garments");
		System.out.println("1.Mens Section");
		System.out.println("2. Women Section");
		System.out.println("3.Kids Section");
		System.out.print("Enter your Section : ");
		 
		 int Section = sc.nextInt();
		 
		 switch(Section)
		 {
			 case 1:
			 {
				 System.out.println("Welcome to Mens Section");
				 System.out.println("1.Shirt");
				 System.out.println("2.Pant");
				 System.out.println("3.T-Shirt");
				 
				 System.out.print("Enter your Type : ");
				 int dresstype = sc.nextInt();
				 
				 if(dresstype==1)
					 System.out.println("Shirt Rs-1200");
				 else if(dresstype==2)
					 System.out.println("Phant Rs-1500");
				 else if(dresstype==3)
					 System.out.println("T-Shirt-800");
				 else
					 System.out.println("Not Available");
				 break;
			 }
			 case 2:
			 {
				 System.out.println("Welcome to Womens Section");
				 System.out.println("1.Saree");
				 System.out.println("2.Churidar");
				 System.out.println("3.Kurti");
				 
				 System.out.print("Enter your Type : ");
				 int dresstype = sc.nextInt();
				 
				 if(dresstype==1)
					 System.out.println("Saree Rs-1500");
				 else if(dresstype==2)
					 System.out.println("Churidar Rs-1500");
				 else if(dresstype==3)
					 System.out.println("Kurti Rs-800");
				 else
					 System.out.println("Not Available");
				 break;
			 }
			 case 3:
			 {
				 System.out.println("Welcome to Kids Section");
				 System.out.println("1.frock");
				 System.out.println("2.Shorts");
				 System.out.println("3.Nightware");
				 
				 System.out.print("Enter your Type : ");
				 int dresstype = sc.nextInt();
				 
				 if(dresstype==1)
					 System.out.println("Frock Rs-1200");
				 else if(dresstype==2)
					 System.out.println("Shorts Rs-1500");
				 else if(dresstype==3)
					 System.out.println("Nightware-800");
				 else
					 System.out.println("Not Available");
				 break;
			 }
			 default:
			 System.out.println("Invalid Section");
		 }
	}
}
			 