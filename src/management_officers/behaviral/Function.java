package management_officers.behaviral;

import management_officers.creat.Person;

import java.util.List;

public interface Function {
    double WAGE_WORKER = 3.7d;
    double WAGE_ENGINEER = 5.7d;
    double WAGE_STAFF = 4.7d;

    void menu();

    void addOfficers(List<Person> list );

    void edit(List<?> list);

    void delete(List<?> list);

    void show(List<Person> list);

    void find(List<?> list);

    void sort(List<?> list);

}
