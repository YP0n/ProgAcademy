package human2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, GroupOverflowException {
        Group group = new Group("Java");
        group.setGroupName("Groups student");

        Student student1 = new Student("Mark", "Tetcher", Gender.MALE, 3, "");
        Student student2 = new Student("Liza", "Joun", Gender.FEMALE, 2, "");
        Student student3 = new Student("Lilu", "Faight", Gender.FEMALE, 1, "");
        Student student4 = new Student("Mark", "Repko", Gender.MALE, 5, "");
        Student student5 = new Student("Liza", "Kalm", Gender.FEMALE, 4, "");
        Student student6 = new Student("Tom", "Tuider", Gender.FEMALE, 6, "");
        Student student7 = new Student("Stiven", "Retsam", Gender.MALE, 8, "");
        Student student8 = new Student("Olga", "Vander", Gender.FEMALE, 7, "");
        Student student9 = new Student("Zet", "Gastion", Gender.MALE, 9, "");
        Student student10 = new Student("Kira", "Bush", Gender.FEMALE, 11, "");
        Student student11 = new Student("Ostin", "Tramp", Gender.MALE, 10, "");

try {
    group.addStudent(student1);
    group.addStudent(student2);
    group.addStudent(student3);
    group.addStudent(student4);
    group.addStudent(student5);
    group.addStudent(student6);
    group.addStudent(student7);
    group.addStudent(student8);
    group.addStudent(student9);
    group.addStudent(student10);
    group.addStudent(student11);
            } catch(GroupOverflowException e){
    System.out.println("*******!!!where presh-filled!!!********");
            }



        group.sortStudentsByLastName(group.getStudents());
        for (Student student : group.getStudents()) {
            System.out.println("Sort => " + student);
        }
        System.out.println();


//        EnterPerson enterPerson = new EnterPerson();
//        enterPerson.createForEnter();
//        group.addStudent(enterPerson.createForEnter());

        try {
            group.searchStudentByLastName("Vander");
        } catch (StudentNotFoundException e) {
            System.out.println("Dont lastName in the group");
        }
        System.out.println();

        System.out.println(group.removeStudemtById(7));

        Student student12 = new Student("Karp", "Forten", Gender.MALE, 14, "PR");
        CSVStringConverter converter = new CSVStringConverter();
        System.out.println(converter.toStringRepresentation(student12));
        System.out.println(converter.fromStringRepresentation(converter.toStringRepresentation(student2)));


        //запис групи в файл
        GroupFileStorage.saveGroupToCSV(group);
        System.out.println(group);

        //Віднімання та повертання групи з файлу
        File fileGroups = new File("C:\\Group student\\Groups student.csv");
        Group group1 = new Group();
        group1 = GroupFileStorage.loadGroupFromCSV(fileGroups);
            System.out.println(group1);
            //Пошук фала в workFolder
            File fileFolder = new File("C:\\Group student\\");
            File fileOut = null;
            fileOut = GroupFileStorage.findFileByGroupName("Groups student", fileFolder);
            System.out.println(fileOut);


            System.out.println(group.studentGroupEquals(group.getStudents()));
    }
}
