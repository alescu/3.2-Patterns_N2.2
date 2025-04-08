public class FinantialAgency implements Subscriber{
    private String name, email;

    public FinantialAgency(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void Update(String news) {
        System.out.println("    Received by " + this.getName() +" - "+ this.getEmail());
    }
}
