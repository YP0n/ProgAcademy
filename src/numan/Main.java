package numan;

public class Main {
    public static void main(String[] args) throws GroupOverflowException {

        Student student1 = new Student("Mark", "Tetcher", Gender.MALE, 3, "PR");
        Student student2 = new Student("Liza", "Joun", Gender.FEMALE, 2, "HR");
        Student student3 = new Student("Lilu", "Faight", Gender.FEMALE, 1, "PR");
        Student student4 = new Student("Mark", "Repko", Gender.MALE, 5, "PR");
        Student student5 = new Student("Liza", "Kalm", Gender.FEMALE, 4, "HR");
        Student student6 = new Student("Tom", "Tuider", Gender.FEMALE, 6, "PR");
        Student student7 = new Student("Stiven", "Retsam", Gender.MALE, 8, "PR");
        Student student8 = new Student("Olga", "Vander", Gender.FEMALE, 7, "HR");
        Student student9 = new Student("Zet", "Gastion", Gender.MALE, 9, "PR");
        Student student10 = new Student("Kira", "Bush", Gender.FEMALE, 11, "PR");
        Student student11 = new Student("Ostin", "Tramp", Gender.MALE, 10, "HR");

        Group group = new Group();
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
} catch (GroupOverflowException e) {
    System.out.println();
    System.out.println("In group 10 student. Addition is not possible");
}


        System.out.println();

        try {
            group.searchStudentByLastName("Fedotov");
        } catch (StudentNotFoundException e) {
            System.out.println("Dont lastName in the group");
        }
        System.out.println();

        System.out.println(group.removeStudemtById(4));

        System.out.println(group);
    }
}
