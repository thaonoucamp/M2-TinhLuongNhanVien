package management_student.behaviral;

import management_officers.creat.Person;
import management_student.creat.Student;
import management_student.my_File.FileCSV;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management implements Serializable {
    Scanner sc = new Scanner(System.in);

    FileCSV fileCSV = new FileCSV();

    String FILE_PATH = "/Users/thaodangxuan/IdeaProjects/M2-Manage-Nhanvien/src/management_student/my_File/file.csv";

    ArrayList<Student> studentList = new ArrayList<>();

    public Student input() {
        Student newStudent = new Student();

        System.out.println("Enter the name");
        newStudent.setName(sc.nextLine());

        System.out.println("Enter the class");
        newStudent.set_class(sc.nextLine());

        System.out.println("Enter the address");
        newStudent.setAddress(sc.nextLine());

        System.out.println("Enter the id");
        newStudent.setId(sc.nextLine());

        System.out.println("Enter the score");
        newStudent.setScore(Float.parseFloat(sc.nextLine()));

        return newStudent;
    }

    public void add(ArrayList<Student> list) throws IOException {

        System.out.println("Enter quantity student want to add");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter student index " + (i + 1));
            list.add(i, input());
        }
        fileCSV.csvWriter(FILE_PATH, list);

        fileCSV.cvsReader(FILE_PATH);
        show(list);
    }

    private void show(List<Student> list) {
        sort(list);

        for (Student s :
                list) {
            System.out.println(s);
        }
    }

    public void edit(ArrayList<Student> list) throws IOException {

        System.out.println("Enter code id");
        String codeId = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(codeId)) {
                list.set(i, input());
                break;
            }
        }
        fileCSV.csvWriter(FILE_PATH, list);

        fileCSV.cvsReader(FILE_PATH);

        show(list);
    }

    public void delete(ArrayList<Student> list) throws IOException {

        System.out.println("Enter code id");
        String codeId = sc.nextLine();

        for (Student s :
                list) {
            if (s.getId().equals(codeId)) {
                list.remove(s);
                break;
            }
        }
        fileCSV.csvWriter(FILE_PATH, list);

        fileCSV.cvsReader(FILE_PATH);

        show(list);
    }

    public int sort(List<Student> list) {

        list.sort(((o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else if (o1.getId().compareTo(o2.getId()) > 0) {
                return 1;
            } else if (o1.getId().compareTo(o2.getId()) < 0) {
                return -1;
            } else if (o1.getScore() - o2.getScore() > 0) {
                return 1;
            } else {
                return -1;
            }
        }));
        return 0;
    }

    public Student find(List<Student> list, int low, int high, int x) {

        if (high >= low) {
            int mid = (high + low) / 2;
            int id = Integer.parseInt(list.get(mid).getId());

            if (id == x) {
                return list.get(mid);
            }
            if (id > x) {
                return find(list, low, mid - 1, x);
            }
            if (id < x) {
                return find(list, mid + 1, high, x);
            }
        }
        return null;
    }

    public void findStudent(List<Student> list) {
        System.out.println("Enter id want to find");
        int x = Integer.parseInt(sc.nextLine());

        Student s = find(list, 0, list.size() - 1, x);
        System.out.println(s);
    }

    public void findMaxScore(List<Student> list) {
        Student max = list.get(0);
        float maxScore = list.get(0).getScore();
        for (int i = 1; i < list.size(); i++) {
            if (maxScore < list.get(i).getScore()) {
                maxScore = list.get(i).getScore();
                max = list.get(i);
            }
        }
        System.out.println(max);
    }

    public void menu() throws IOException {
        int choice;

        do {
            System.err.println("Menu." +
                    "\n1. add" +
                    "\n2. edit" +
                    "\n3. delete" +
                    "\n4. find by id" +
                    "\n5. find student has max score" +
                    "\n6. exit" +
                    "\nEnter your choice");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    add(studentList);
                    break;
                case 2:
                    edit(studentList);
                    break;
                case 3:
                    delete(studentList);
                    break;
                case 4:
                    findStudent(studentList);
                    break;
                case 5:
                    findMaxScore(studentList);
                    break;
                case 6:
                    System.exit(6);
            }
        } while (choice != 6);
    }
}