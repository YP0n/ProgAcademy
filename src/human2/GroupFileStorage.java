package human2;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class GroupFileStorage {

    public static void saveGroupToCSV(Group gr) {//як ми отримуємо gr.getGroupName(), а потім getName()...?

        try(PrintWriter writer = new PrintWriter(new File("C:\\Group student\\" + gr.getGroupName() + ".csv"))) {
            for(int i = 0; i < gr.getStudents().size(); i++) {
                if(gr.getStudents().get(i) != null) {
                    writer.println((gr.getStudents().get(i).getName() + "," + (gr.getStudents().get(i).getLastName() + "," +
                            (gr.getStudents().get(i).getGender() + "," + (gr.getStudents().get(i).getId() + "," + (gr.getStudents().get(i).getGroupName()))))));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Group loadGroupFromCSV(File file) throws IOException {
        Group gr = new Group();
        String temp = "";
        gr.setGroupName(file.getName().substring(0, file.getName().lastIndexOf(".")));
        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine();) {
                temp += sc.nextLine() + System.lineSeparator();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] allStudent = temp.split(System.lineSeparator());
        for(int i = 0; i < allStudent.length; i++) {
            String first = allStudent[i];
            String[] firstStudent = first.split("[,]");
            Student student = new Student(firstStudent[0], firstStudent[1], Gender.valueOf(firstStudent[2]),
                    Integer.parseInt(firstStudent[3]));
            try {
                Group group = new Group();
                group.addStudent(student);
            } catch (GroupOverflowException e) {
                e.printStackTrace();
            }
        }
        return gr;
    }

    public static File findFileByGroupName(String groupName, File workFolder) {
        File[] files = workFolder.listFiles();
        if(files != null) {
            for(int i = 0; i < files.length; i++) {
                if(files[i].isFile() && files[i].getName().equals(groupName + ".csv")) {
                    System.out.println("File " + groupName + ".csv was found in " + workFolder);
                    return files[i];
                }
            }
        }
        System.out.println("File " + groupName + ".csv wasn't found in " + workFolder);
        return null;
    }
}