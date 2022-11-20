package human2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVStringConverter implements StringConverter {

    @Override
    public String toStringRepresentation(Student student) {
        return student.getName() + ","
                + student.getLastName() + ","
                + student.getGender() + ","
                + student.getId() + ","
                + student.getGroupName();
    }

    @Override
    public Student fromStringRepresentation(String str) {
        Student student = new Student();
        String[] arraySt = str.split(",");

            student.setName(arraySt[0]);
            student.setLastName(arraySt[1]);
            student.setGender(Gender.valueOf(arraySt[2]));
            student.setId(Integer.valueOf(arraySt[3]));
            //student.setGroupName(arraySt[4]);
        return student;
    }
}
