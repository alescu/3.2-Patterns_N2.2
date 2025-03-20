public class Main {
    public static void main(String[] args){

        Stockbroker sb_1 = new Stockbroker("David", "A",7.1, 100.00);
        Stockbroker sb_2 = new Stockbroker("Alex", "A",5.8, 50.50);
        Stockbroker sb_3 = new Stockbroker("Anna", "A",8.0, 120.00);

        FinanTialInstitution fini_1 = new FinanTialInstitution("Acme.inc", "Acme.inc@acme.com");
        FinanTialInstitution fini_2 = new FinanTialInstitution("LEX.corp", "lexcorp.inc@lexcorp.com");
        FinanTialInstitution fini_3 = new FinanTialInstitution("Stark.corp", "stark.inc@starkenterprises.com");
        FinanTialInstitution fini_4 = new FinanTialInstitution("Hammer.inc", "hammer.inc@hammer.com");

        sb_1.getObservers().add(fini_1);
        sb_1.getObservers().add(fini_2);
        sb_1.getObservers().add(fini_3);
        sb_1.getObservers().add(fini_4);

        sb_2.getObservers().add(fini_1);

        sb_3.getObservers().add(fini_1);
        sb_3.getObservers().add(fini_4);

        System.out.println("\n");
        sb_1.publishNewCommunicate(sb_1, "Microsoft (MSFT): +1,2% ^;AMD (AMD): +2,5% ^;Nvidia (NVDA): +3,0% ^;Apple (AAPL): -0,5% !");
        sb_2.publishNewCommunicate(sb_2, "Microsoft (MSFT): +1,2% ^;AMD (AMD): +2,5% =;Nvidia (NVDA): +3,0% ^;Apple (AAPL): -0,5% =");
        sb_3.publishNewCommunicate(sb_3, "Microsoft (MSFT): +1,2% ^;AMD (AMD): +2,5% ^;Nvidia (NVDA): +3,0% ^^;Apple (AAPL): -0,5% !!");

    }
}
