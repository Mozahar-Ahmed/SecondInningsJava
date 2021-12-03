package methodcallfromotherclass;

public class Ipl2020 {
    public static void main(String[] args) {

        Kkr.homeCity();
        RoyalChallengers.homeCity();
        Kkr kkr = new Kkr();
        kkr.captain();
        RoyalChallengers royalChallengers = new RoyalChallengers();
        royalChallengers.captain();
        Ipl2020 ipl2020 = new Ipl2020();
        ipl2020.worldXI();

    }

    public void worldXI() {
        Kkr kkr = new Kkr();
        kkr.bestPlayer();
        RoyalChallengers royalChallengers = new RoyalChallengers();
        royalChallengers.bestPlayer();
    }
}
