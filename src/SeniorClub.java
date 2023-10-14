public class SeniorClub extends MovieClub {
    String additionalBenefits = "Free child-sized popcorn & soda";
    double ticketPriceDiscount = 0.5;
    double yearlyClubFee = 5.;

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
        super.toString();
        System.out.println("Additional Benefits: " + getAdditionalBenefits());
        System.out.println("Yearly fee: $" + getYearlyClubFee());
        return null;
    }
}
