/**
 * @author cameron shimmin
 * Members of the GoldClub enjoy benefits like free soda and popcorn refills.
 * They also receive a discount on movie ticket prices and have a yearly club fee.
 */
public class GoldClub extends MovieClub {
    private final  String additionalBenefits = "Free refills";
    private final  double ticketPriceDiscount = 0.9;
    private final  double yearlyClubFee = 15.;

    public GoldClub(double ticketPrice) {
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
        super.toString();
        System.out.println("Additional Benefits: " + getAdditionalBenefits());
        System.out.println("Yearly fee: $" + getYearlyClubFee());
        return null;
    }
}
