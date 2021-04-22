package management_officers.creat;

public class Worker extends Person {
    private String work;

    public Worker() {
    }

    public Worker(String work) {
        this.work = work;
    }

    public Worker(String name, String gender, String birthday, String address, String work) {
        super(name, gender, birthday, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                "work='" + work + '\'' +
                '}';
    }
}
