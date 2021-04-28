package management_student.my_File;

import management_student.creat.Student;

import java.io.*;
import java.util.ArrayList;

public class FileCSV {

    public void cvsReader(String filePath) {
        try {
            FileReader frd = new FileReader(filePath);
            String line = "";
            BufferedReader bfr = new BufferedReader(frd);
            line = bfr.readLine();
            while ((line = bfr.readLine()) != null && !line.isEmpty()) {
                String arr[] = line.split(",");
                System.out.println("name " + arr[0] + "\t" + "class " + arr[1] + "\t" + "address " + arr[2] + "\t" + "id " + arr[3] + "\t" + "score " + arr[4]);
            }
            bfr.close();
            frd.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void csvWriter(String filePath, ArrayList<Student> list){
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            for (Student s :
                    list) {
                fileWriter.write(s.toString());
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
