import java.util.Scanner;

class Spotify
{
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Spotify Music App");
        System.out.println("Select Music Director:");
        System.out.println("1. A R Rahman");
        System.out.println("2. Anirudh");
        System.out.println("3. Yuvan Shankar Raja");

        System.out.print("Enter your choice: ");
        int director = sc.nextInt();

        switch (director)
		{

            case 1:
                System.out.println("Selected: A R Rahman");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                System.out.print("Select music type: ");
                int type1 = sc.nextInt();

                if (type1 == 1)
				{
                    System.out.println("1. Munbe Vaa");
                    System.out.println("2. Vellai Pookal");
                    System.out.print("Select song: ");
                    int song1 = sc.nextInt();

                    if (song1 == 1)
                        System.out.println("Now Playing : Munbe Vaa");
                    else if (song1 == 2)
                        System.out.println("Now Playing : Vellai Pookal");
                    else
                        System.out.println("Invalid song selection");

                }
				else if (type1 == 2)
				{
                    System.out.println("1. Chinna Chinna Aasai");
                    System.out.println("2. Thai Mannai Vanakkam");
                    System.out.print("Select song: ");
                    int song2 = sc.nextInt();

                    if (song2 == 1)
                        System.out.println("Now Playing : Chinna Chinna Aasai");
                    else if (song2 == 2)
                        System.out.println("Now Playing : Thai Mannai Vanakkam");
                    else
                        System.out.println("Invalid song selection");

                }
				else
				{
                    System.out.println("Invalid music type");
                }
				break;

            case 2:
                System.out.println("Selected: Anirudh");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                System.out.print("Select music type: ");
                int type2 = sc.nextInt();

                if (type2 == 1)
				{
                    System.out.println("1. Why This Kolaveri");
                    System.out.println("2. Neeyum Naanum");
                    System.out.print("Select song: ");
                    int song3 = sc.nextInt();

                    if (song3 == 1)
                        System.out.println("Now Playing : Why This Kolaveri");
                    else if (song3 == 2)
                        System.out.println("Now Playing : Neeyum Naanum");
                    else
                        System.out.println("Invalid song selection");

                }
				else if (type2 == 2)
				{
                    System.out.println("1. Aaluma Doluma");
                    System.out.println("2. Don'u Don'u");
                    System.out.print("Select song: ");
                    int song4 = sc.nextInt();

                    if (song4 == 1)
                        System.out.println("Now Playing : Aaluma Doluma");
                    else if (song4 == 2)
                        System.out.println("Now Playing : Don'u Don'u");
                    else
                        System.out.println("Invalid song selection");

                }
				else
				{
                    System.out.println("Invalid music type");
                }
				break;

            case 3:
                System.out.println("Selected: Yuvan Shankar Raja");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                System.out.print("Select music type: ");
                int type3 = sc.nextInt();

                if (type3 == 1)
				{
                    System.out.println("1. Kadhal Valarthen");
                    System.out.println("2. En Kadhal Solla");
                    System.out.print("Select song: ");
                    int song5 = sc.nextInt();

                    if (song5 == 1)
                        System.out.println("Now Playing : Kadhal Valarthen");
                    else if (song5 == 2)
                        System.out.println("Now Playing : En Kadhal Solla");
                    else
                        System.out.println("Invalid song selection");

                }
				else if (type3 == 2)
				{
                    System.out.println("1. Oru Naalil");
                    System.out.println("2. Machi Open The Bottle");
                    System.out.print("Select song: ");
                    int song6 = sc.nextInt();

                    if (song6 == 1)
                        System.out.println("Now Playing : Oru Naalil");
                    else if (song6 == 2)
                        System.out.println("Now Playing : Machi Open The Bottle");
                    else
                        System.out.println("Invalid song selection");

                }
				else
				{
                    System.out.println("Invalid music type");
                }
				break;
               
            default:
                System.out.println("Invalid music director");
        }
    }
}
