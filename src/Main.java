public class Main {
    public static void main(String[] args) {
        MovieClub[] movieClubs = new MovieClub[4];
        double stdTicketPrice = 10.0;

        SeniorClub sc = new SeniorClub(stdTicketPrice);
        GoldClub gc = new GoldClub(stdTicketPrice);
        PlatinumClub pc = new PlatinumClub(stdTicketPrice);
        PlatinumPlusClub ppc = new PlatinumPlusClub(stdTicketPrice);

        movieClubs[0] = sc;
        movieClubs[1] = gc;
        movieClubs[2] = pc;
        movieClubs[3] = ppc;

        for (var club: movieClubs)
            club.toString();
    }
}
