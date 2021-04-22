package management_officers.creat;

public class Staff extends Person {
    private String wage;

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public Staff() {
    }

    public Staff(String wage) {
        this.wage = wage;
    }

    public Staff(String name, String gender, String birthday, String address, String wage) {
        super(name, gender, birthday, address);
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                "wage='" + wage + '\'' +
                '}';
    }
}
