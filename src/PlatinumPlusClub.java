/**
 * @author Cameron Shimmin
 * <p>
 * The PlatinumPlusClub class extends the PlatinumClub and represents a premium movie club membership
 * with additional benefits and privileges. Members of the PlatinumPlusClub enjoy all the benefits of
 * the PlatinumClub, such as free soda and popcorn refills, buddy passes, and discounted ticket prices.
 * In addition, they receive extra free passes and pay an increased yearly club fee.
 * </p>
 */
public class PlatinumPlusClub extends PlatinumClub {
    private final int additionalFreePassCount = 2;
    private final double additionalYearlyFee = 10;

    public PlatinumPlusClub(double ticketPrice) {
        super(ticketPrice);
    }

    @Override
    public double getYearlyClubFee() {
        return super.getYearlyClubFee() + additionalYearlyFee;
    }

    @Override
    public int getFreePassCount() {
        return super.getFreePassCount() + additionalFreePassCount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
