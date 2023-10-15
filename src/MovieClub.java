/**
 * @author cameron shimmin
 * <p>
 * The MovieClub class is an abstract base class that represents a generic movie club membership.
 * All movie clubs share common features, such as online ticketing, but they can have varying
 * benefits and ticket prices depending on the specific type of club.
 * This class serves as a template for creating different movie club types with customized benefits
 * and ticket prices.
 * </p>
 */
public abstract class MovieClub {
    /**
     * The base benefits for all Movie Clubs
     */
    private String benefits = "online ticketing";

    /**
     * The base ticket price for all MovieClubs
     */
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
