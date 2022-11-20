package human2;

import human2.Student;

public interface StringConverter {
    public String toStringRepresentation(Student student);
    public Student fromStringRepresentation(String str);
}
