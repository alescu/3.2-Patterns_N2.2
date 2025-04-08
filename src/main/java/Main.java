public class Main {
    public static void main(String[] args) {

        Stockbroker broker = new Stockbroker();

        FinantialAgency fini_1 = new FinantialAgency("Acme.inc", "Acme.inc@acme.com");
        FinantialAgency fini_2 = new FinantialAgency("LEX.corp", "lexcorp.inc@lexcorp.com");
        FinantialAgency fini_3 = new FinantialAgency("Stark.corp", "stark.inc@starkenterprises.com");
        FinantialAgency fini_4 = new FinantialAgency("Hammer.inc", "hammer.inc@hammer.com");

        broker.getObservers().add(fini_1);
        broker.getObservers().add(fini_2);
        broker.getObservers().add(fini_3);
        broker.getObservers().add(fini_4);

        System.out.println("\n");
        broker.publishNewCommunicate("Microsoft (MSFT): +1,2% ^;AMD (AMD): +2,5% ^;Nvidia (NVDA): +3,0% ^;Apple (AAPL): -0,5% !");

        broker.removeObserver(fini_2);
        broker.removeObserver(fini_3);

        broker.publishNewCommunicate("Microsoft (MSFT): +1,5% ^;AMD (AMD): +2,0% ^");

    }
}
