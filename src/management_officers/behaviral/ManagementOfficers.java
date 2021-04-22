package management_officers.behaviral;

import management_officers.creat.Engineer;
import management_officers.creat.Person;
import management_officers.creat.Staff;
import management_officers.creat.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementOfficers implements Function {
    Scanner sc = new Scanner(System.in);

    List<Person> listOfficers = new ArrayList<>();


    @Override
    public void edit(List<?> list) {

    }

    @Override
    public void delete(List<?> list) {

    }

    @Override
    public void show(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).toString();
        }
    }

    @Override
    public void find(List<?> list) {

    }

    @Override
    public void sort(List<?> list) {

    }

    @Override
    public void menu() {
        int choice;

        do {
            System.out.println("menu :" +
                    "\n1. add" +
                    "\n2. edit" +
                    "\n3. delete" +
                    "\n4. sort" +
                    "\n5. find" +
                    "\n6. exit");

            System.out.println("Enter your choice");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addOfficers(listOfficers);
                    break;
                case 2:
                    edit(listOfficers);
                    break;
                case 3:
                    delete(listOfficers);
                    break;
                case 4:
                    sort(listOfficers);
                    break;
                case 5:
                    find(listOfficers);
                    break;
                case 6:
                    System.err.println("SEE YOU !");
                    System.exit(6);
            }
        } while (choice != 6);
    }

    @Override
    public void addOfficers(List<Person> list) {
        list.add((Person) addEngineer());
        list.add((Person) addWorker());
        list.add((Person) addStaff());

        show(list);
    }

    public List<Engineer> addEngineer() {
        List<Engineer> list = new ArrayList<>();
        System.out.println("Enter quantity want to add");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter index engineer " + (i + 1));
            list.add(inputEngineer());
        }
        return list;
    }

    public List<Staff> addStaff() {
        List<Staff> list = new ArrayList<>();
        System.out.println("Enter quantity want to add");
        int quantity = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter index staff " + (i + 1));
            list.add(inputStaff());
        }
        return list;
    }

    public List<Worker> addWorker() {
        List<Worker> list = new ArrayList<>();
        System.out.println("Enter quantity want to add");
        int quantity = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter index worker " + (i + 1));
            list.add(inputWorker());
        }
        return list;
    }

    public Staff inputStaff() {
        Staff staff = new Staff();

        System.out.println("Enter the name");
        staff.setName(sc.nextLine());

        System.out.println("Enter the gender");
        staff.setGender(sc.nextLine());

        System.out.println("Enter the birthday");
        staff.setBirthday(sc.nextLine());

        System.out.println("Enter the address");
        staff.setAddress(sc.nextLine());

        System.out.println("Enter the wage");
        staff.setWage(sc.nextLine());

        return staff;
    }

    public Worker inputWorker() {
        Worker worker = new Worker();

        System.out.println("Enter the name");
        worker.setName(sc.nextLine());

        System.out.println("Enter the gender");
        worker.setGender(sc.nextLine());

        System.out.println("Enter the birthday");
        worker.setBirthday(sc.nextLine());

        System.out.println("Enter the address");
        worker.setAddress(sc.nextLine());

        System.out.println("Enter the work");
        worker.setWork(sc.nextLine());

        return worker;
    }

    public Engineer inputEngineer() {
        Engineer e = new Engineer();

        System.out.println("Enter the name");
        e.setName(sc.nextLine());

        System.out.println("Enter the gender");
        e.setGender(sc.nextLine());

        System.out.println("Enter the birthday");
        e.setBirthday(sc.nextLine());

        System.out.println("Enter the address");
        e.setAddress(sc.nextLine());

        System.out.println("Enter the educate");
        e.setEducate(sc.nextLine());

        return e;
    }
}
