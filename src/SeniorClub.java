/**
 * @author cameron shimmin
 * <p>
 * Members of the SeniorClub enjoy benefits like free child-size popcorn and soda.
 * They also receive a discount on movie ticket prices and have a yearly club fee.
 * </p>
 */
public class SeniorClub extends MovieClub {
    private final String additionalBenefits = "Free child-sized popcorn & soda";
    private final double ticketPriceDiscount = 0.5;
    private final  double yearlyClubFee = 5.;

    public SeniorClub(double ticketPrice) {
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

    @Override
    public String toString() {
        return super.toString() +
                "\n* Additional Benefits: " + getAdditionalBenefits() +
                "\n* Yearly fee: $" + getYearlyClubFee();
    }
}
