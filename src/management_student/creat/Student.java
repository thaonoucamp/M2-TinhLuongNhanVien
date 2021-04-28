package management_student.creat;

import java.io.Serializable;

public class Student implements Serializable {
   private String name;
   private String _class;
   private String address;
   private String id;
   private float score;

    public Student() {
    }

    public Student(String name, String _class, String address, String id, float score) {
        this.name = name;
        this._class = _class;
        this.address = address;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", _class='" + _class + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                ", score=" + score +
                '}';
    }
}
