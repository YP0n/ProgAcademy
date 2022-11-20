package human2;

import java.util.List;

public class Student extends Human {
    private int id;
    private String groupName;

    public Student(String name, String lastName, Gender gender, int id, String groupName) {
        super(name, lastName, gender);
        this.id = id;
        this.groupName = groupName;
    }

    public Student() {
    }

    public Student(String s, String s1, Gender valueOf, int parseInt) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (!groupName.equals(student.groupName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + groupName.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Student{" + "Name-" + getName() +
                ", LastName-" + getLastName() +
                ", gender=" + gender +
                ", id=" + id +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
