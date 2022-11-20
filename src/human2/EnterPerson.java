package human2;

import java.util.Scanner;

public class EnterPerson {

    Scanner sc = new Scanner(System.in);

    public Student createForEnter() {
            String name;
            String lastName;
            String gender;
            String groupName;
            int id;

            Student studentEnter = new Student();

            System.out.println("Enter you name ");
            name = sc.nextLine();

            System.out.println("Enter you lastName ");
            lastName = sc.nextLine();

            System.out.println("Gender is (MALE or FEMALE)");
            gender = sc.nextLine();

            System.out.println("Enter you groupName ");
            groupName = sc.nextLine();

            System.out.println("Enter you Id ");
            id = sc.nextInt();

            return new Student(name, lastName, Gender.valueOf(gender), id, groupName);
        }
    }
