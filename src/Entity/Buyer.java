
package Entity;

public class Buyer {
    private String firstname;
    private String lastname;
    private int phone;

    public Buyer() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Reader{"
                + "firstname=" + firstname
                + ", lastname=" + lastname
                + ", phone=" + phone
                + '}';
    }

}