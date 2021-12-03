package enumpractice;

public class Year {
    private final Months months;

    public Year(Months months) {
        this.months = months;

    }

    public void monthPlanner() {
        switch (months) {
            case May:
                System.out.println("Spring time-cherry blossom");
                break;
            case July:
                System.out.println("Hot summer time");
                break;
            case June:
                System.out.println("Summer Vacation");
                break;
            case August:
            case September:
            case October:
                System.out.println("Be attentive to class");
                break;
            default:
                System.out.println("As usual");
        }
    }
}
