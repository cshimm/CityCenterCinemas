public class PlatinumClub extends MovieClub {
    String additionalBenefits = "Free soda and popcorn refill, buddy passes";
    double ticketPriceDiscount = 0.8;
    double yearlyClubFee = 30.;
    int freePassCount = 1;

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
        super.toString();
        System.out.println("Additional Benefits: " + getAdditionalBenefits());
        System.out.println("Yearly fee: $" + getYearlyClubFee());
        System.out.println("Monthly free passes: " + getFreePassCount());
        return null;
    }
}
