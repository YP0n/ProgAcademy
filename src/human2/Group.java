package human2;

import java.util.*;

public class Group {
    private String groupName;
    private List<Student> students = new ArrayList<>(10);

    public Group(String groupName, List<Student> students) {
        super();
        this.groupName = groupName;
        this.students = students;
    }

    public Group() {
        super();
    }

    public Group(String substring) {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        if (students.size() < 10) {
            students.add(student);
            return;
        }
        throw new GroupOverflowException();
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for(Student student : students) {
            if(student.getLastName().equals(lastName)) {
                System.out.println("Search student " + student);
                return student;
            }
        }
        throw new StudentNotFoundException();
    }

    public boolean removeStudemtById(int id) {
        for(Student student : students) {
            if(student.getId() == id) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public void sortStudentsByLastName(List<Student> students) {
            Collections.sort(students, new StudentsLastNameComparator());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (groupName != null ? !groupName.equals(group.groupName) : group.groupName != null) return false;
        if (students != null ? !students.equals(group.students) : group.students != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupName != null ? groupName.hashCode() : 0;
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }

    public boolean studentGroupEquals(List<Student> students) {
        for (int i = 0; i < this.students.size(); i++) {
                for (int j = i + 1; j < this.students.size(); j++) {
                    if (this.students.get(i).equals(this.students.get(j)))
                        return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + students +
                '}';
    }
}
