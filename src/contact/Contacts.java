package contact;

public class Contacts {

    private String number;
    private String name;
    private String email;

    public Contacts() {


    }

    public String getNumber() {
        return number;
    }

    public Contacts(String number, String name, String email) {
        this.number = number;
        this.name = name;
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
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
}
