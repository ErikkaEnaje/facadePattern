package FacadePattern;
import java.util.*;

public class HotelApp {
    public static void main(String[] args) {

        Scanner serving = new Scanner(System.in);
        System.out.println("\n\t\t > WELCOME TO HOTEL APPLICATION SERVICE <\t\t");

        while (true) {
            System.out.println("\n\t\t ˜”*°• Services that we provide •°*”˜\"");
            System.out.println("\n\t\t01. Cart");
            System.out.println("\t\t02. Housekeeping");
            System.out.println("\t\t03. Valet Parking");
            System.out.println("\t\t04. Exit");
            System.out.print("\n\t\t\t\tEnter the hotel service you want: ");

            int req = serving.nextInt();
            if (req == 1 | req == 2 | req == 3) {
                services(req);
            } else if (req == 4) {
                System.out.println("\n\t\t\t\tWe hope our services are helping:)");
                System.out.println("\nProgrammed by: Erikka Marielle M. Enaje | 3BSCS-1");
                System.exit(0);
            } else {
                System.out.println("\n\t INCORRECT NUMBER!! PLEASE SELECT THE CORRECT NUMBER WE HAVE!!\n");
            }
        }

    }
    public static void services(int req){
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        switch (req){

            case 1:
               try {
                System.out.println("\n\t\t\t\t *° CART °*");
                System.out.print("\t\t\t\t Kindly enter the number of Carts you want to have:");
                int numbsOfCart = scan.nextInt();
                HotelServe serviceCartHotel = new Cart(numbsOfCart);
                FrontDesk.Servicehotel(serviceCartHotel);
               }
               catch (Exception i){
                System.out.println("\t OVER/INCORRECT AMOUNT OF CARTS\n");
               }
            break;


            case 2:
                System.out.println("\n\t\t\t\t *° HOUSE KEEPING °*");
                System.out.print("\t\t\t\t Kindly enter the Room Number you have:");
                String numbsOfRoom = scan.nextLine();
                HotelServe serviceHouseKeeping = new HouseKeeping(numbsOfRoom);
                FrontDesk.Servicehotel(serviceHouseKeeping);
                break;


            case 3:
                Scanner valet = new Scanner(System.in);
                System.out.println("\n\t\t\t\t *° VALET PARKING °*");
                System.out.print("\t\t\t\t Please put your Licence Plate number in here: ");
                String theplateNumber = valet.nextLine();
                HotelServe valetService = new Valet(theplateNumber);
                FrontDesk.Servicehotel(valetService);

                break;
            default:
        }

    }

}






