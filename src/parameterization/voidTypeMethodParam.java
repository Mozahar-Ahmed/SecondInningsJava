package parameterization;

public class voidTypeMethodParam {

    public static void teamBangladesh() {//non parameterized

        System.out.println("Bangladesh Cricket Team");
    }

    public static void teamBangladesh(int standbyMembers) {// parameterized method
        System.out.println(standbyMembers);
        int playingMembers = 15;
        int totalMembers = standbyMembers + playingMembers;
        System.out.println(totalMembers);
    }

    public static void teamBangladesh(int playingMembers, String captain) {
        System.out.println(playingMembers);
        System.out.println(captain);
    }

    public static void teamBangladesh(int playingMembers, String captain, String bestPlayer) {
        System.out.println(playingMembers + " " + captain + " " + bestPlayer);

    }

    public static void main(String[] args) {
        teamBangladesh();
        teamBangladesh(5);
        teamBangladesh(15, "Mashrafe");
        teamBangladesh(15, "Mashrafe", "Shakib");

    }
}
