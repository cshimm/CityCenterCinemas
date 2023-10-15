/**
 * @author cameron shimmin
 * <p>
 * The PlatinumClub class represents a special movie club membership with additional benefits.
 * Members of the PlatinumClub enjoy benefits like free soda and popcorn refills, and buddy passes.
 * They also receive a discount on movie ticket prices and have a yearly club fee.
 * Additionally, they are entitled to a certain number of free passes each month.
 * </p>
 */
public class PlatinumClub extends MovieClub {
    private final String additionalBenefits = "Free soda and popcorn refill, buddy passes";
    private final double ticketPriceDiscount = 0.8;
    private final double yearlyClubFee = 30.;
    private final int freePassCount = 1;

    public PlatinumClub(double ticketPrice) {
        super(ticketPrice);
    }

    public String getAdditionalBenefits() {
        return additionalBenefits;
    }

    @Override
    public double getTicketPrice() {
        return super.getTicketPrice() * ticketPriceDiscount;
    }

    public double getYearlyClubFee() {
        return yearlyClubFee;
    }

    public int getFreePassCount() {
        return freePassCount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n* Additional Benefits: " + getAdditionalBenefits() +
                "\n* Yearly fee: $" + getYearlyClubFee() +
                "\n* Monthly free passes: " + getFreePassCount();
    }
}
