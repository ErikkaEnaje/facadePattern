package FacadePattern;

public class Valet implements HotelServe {
    private String theplateNumber;
    private String serve;

    public Valet(String plateNumber) {
        this.theplateNumber = plateNumber;
        this.serve = String.valueOf(serve);
    }

    @Override
    public void executeService() {valetService(theplateNumber, serve);}

    public void valetService(String plateNumber,String service){
        System.out.println("\t\t\t\t On the way to pick-up Vehicle with the Plate Number: "+plateNumber+"\n");
        System.out.println("\n\t\t\t\t\t DONE SERVICE, THANK YOU FOR TRUSTING US!!");
    }
}