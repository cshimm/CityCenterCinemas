/**
 * @author cameron shimmin
 * The base MoveClub class that all movie clubs inherit from
 */
public abstract class MovieClub {
    private String benefits = "online ticketing";
    private double ticketPrice;

    public MovieClub(double ticketPrice) {
        setTicketPrice(ticketPrice);
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String toString() {
        System.out.println();
        System.out.println(getClass().getSimpleName());
        System.out.println("Ticket price: $" + getTicketPrice());
        System.out.println("Benefits: " + getBenefits());
        return null;
    }

}
