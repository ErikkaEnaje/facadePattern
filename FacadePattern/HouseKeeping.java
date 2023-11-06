package FacadePattern;

public class HouseKeeping implements HotelServe {
    private String roomnumber;
    public HouseKeeping(String roomNumber){
        this.roomnumber = roomNumber;
    }

    @Override
    public void executeService() {
        valetService(roomnumber);
    }

    public void valetService(String roomnumber){
        System.out.println("\t\t\t\t Requesting the Room Number to Housekeeping: "+roomnumber+"\n");
        System.out.println("\n\t\t\t\t\t DONE SERVICE, THANK YOU FOR TRUSTING US!!");
    }
}