package enumpractice;

public class Week {
    private final Days days;

    public Week(Days days) {
        this.days = days;
    }

    public void whatToDo() {
        switch (days) {
            case Sunday:
                System.out.println("Cycling");
                break;
            case Saturday:
                System.out.println("hangout with friends");
                break;
            case Thursday:
                System.out.println("Busy schedule");
            case Tuesday:
            case Wednesday:
                System.out.println("Virtual training class");
                break;
            default:
                System.out.println("Office work");
        }
    }
}
