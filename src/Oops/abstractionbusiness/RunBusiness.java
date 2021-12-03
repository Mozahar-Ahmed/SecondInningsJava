package Oops.abstractionbusiness;

public class RunBusiness extends SetUpBusiness {
    public static void main(String[] args) {
        RunBusiness runBusiness = new RunBusiness();
        runBusiness.aUniqueIdea();
        runBusiness.anotherNewIdea();
        runBusiness.implementedIdea();
        runBusiness.cost();
        runBusiness.profit();
    }

    public void cost() {
        System.out.println("Cost nothing for the participants, free for all");
    }

    public void profit() {
        System.out.println("Improved coding, presentation and communication skill-net profit for me");
    }
}
