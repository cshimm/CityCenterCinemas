public class GoldClub extends MovieClub {
    String additionalBenefits = "Free refills";
    double ticketPriceDiscount = 0.9;
    double yearlyClubFee = 15.;

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
