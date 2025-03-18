public class Main {
    public static void main(String[] args){

        Stockbroker sb_1 = new Stockbroker("David", "A",7.1, 100.00);
        Stockbroker sb_2 = new Stockbroker("Alex", "A",5.8, 50.50);
        Stockbroker sb_3 = new Stockbroker("Anna", "A",8.0, 120.00);

        FinanTialInstitution fini_1 = new FinanTialInstitution("Acme.inc", "Acme.inc@acme.com");
        FinanTialInstitution fini_2 = new FinanTialInstitution("LEX.corp", "lexcorp.inc@lexcorp.com");
        FinanTialInstitution fini_3 = new FinanTialInstitution("Stark.corp", "stark.inc@starkenterprises.com");
        FinanTialInstitution fini_4 = new FinanTialInstitution("Hammer.inc", "hammer.inc@hammer.com");

        Newsletter.addBroker(sb_1);
        Newsletter.addBroker(sb_2);
        Newsletter.addBroker(sb_3);

        Newsletter.addFinanTialInstitution(sb_1, fini_1);
        Newsletter.addFinanTialInstitution(sb_1, fini_2);
        Newsletter.addFinanTialInstitution(sb_1, fini_3);
        Newsletter.addFinanTialInstitution(sb_1, fini_4);

        Newsletter.addFinanTialInstitution(sb_1, fini_2);
        Newsletter.addFinanTialInstitution(sb_1, fini_3);
        Newsletter.addFinanTialInstitution(sb_2, fini_4);

        Newsletter.addFinanTialInstitution(sb_3, fini_2);
        Newsletter.addFinanTialInstitution(sb_3, fini_3);

        Newsletter.publishCommunicate(sb_1, "Comunication 1");
        Newsletter.publishCommunicate(sb_2, "Comunication 2");
        Newsletter.publishCommunicate(sb_3, "Comunication 3");

        Newsletter.publishCommunicate(sb_1, "Comunication 4");

    }
}
