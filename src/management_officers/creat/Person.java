package management_officers.creat;

public class Person {
    private String name;
    private String gender;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\''
                ;
    }
}
