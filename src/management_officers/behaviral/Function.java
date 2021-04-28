package management_officers.behaviral;

import management_officers.creat.Person;

import java.util.List;

public interface Function<T> {
    double WAGE_WORKER = 3.7d;
    double WAGE_ENGINEER = 5.7d;
    double WAGE_STAFF = 4.7d;

    void menu();

    void addOfficers(List<T> list ) throws Exception;

    void edit(List<T> list);

    void delete(List<T> list);

    void show(List<T> list);

    void find(List<T> list);

    void sort(List<T> list);

}
