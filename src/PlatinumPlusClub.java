public class PlatinumPlusClub extends PlatinumClub {
    int additionalFreePassCount = 2;
    double additionalYearlyFee = 10;

    public PlatinumPlusClub(double ticketPrice) {
        super(ticketPrice);
    }

    @Override
    public double getYearlyClubFee() {
        return super.getYearlyClubFee() + additionalYearlyFee;
    }

    @Override
    public int getFreePassCount() {
        return freePassCount + additionalFreePassCount;
    }

    @Override
    public String toString() {
        super.toString();
        return null;
    }
}
