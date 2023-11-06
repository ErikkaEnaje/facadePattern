package FacadePattern;

public class Cart implements HotelServe {
    private int numbCarts;

    public Cart(int numberOfCarts){
        this.numbCarts = numberOfCarts;

    }

    @Override
    public void executeService() {
        cartService(numbCarts);
    }

    public void cartService(int numberofcarts){
        System.out.println("\t\t\t\t Delivering "+numberofcarts+" carts\n");
        System.out.println("\n\t\t\t\t\t DONE SERVICE, THANK YOU FOR TRUSTING US!!");
    }
}