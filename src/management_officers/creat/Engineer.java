package management_officers.creat;

public class Engineer extends Person {
    private String educate;

    public Engineer() {
    }

    public Engineer(String educate) {
        this.educate = educate;
    }

    public Engineer(String name, String gender, String birthday, String address, String educate) {
        super(name, gender, birthday, address);
        this.educate = educate;
    }

    public String getEducate() {
        return educate;
    }

    public void setEducate(String educate) {
        this.educate = educate;
    }

    @Override
    public String toString() {
        return "Engineer{" + super.toString() +
                "educate='" + educate + '\'' +
                '}';
    }
}
