package numan;

import java.util.Arrays;

public class Group {
    private String groupName;
    private Student[] students = new Student[10];

    public Group(String groupName, Student[] students) {
        super();
        this.groupName = groupName;
        this.students = students;
    }

    public Group() {
        super();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("Add student" + students[i]);
                return;
            }
        }
        throw new GroupOverflowException();
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getLastName().equals(lastName)) {
                    System.out.println("Search student" + students[i]);
                    return students[i];
                }
            }
        }
        throw new StudentNotFoundException();
    }

    public boolean removeStudemtById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    students[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Group" + System.lineSeparator();
        for(int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                result += students[i] + System.lineSeparator();
            }
        }
        return result;
    }
}
