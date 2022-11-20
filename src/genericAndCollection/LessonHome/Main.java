package genericAndCollection.LessonHome;

public class Main {
    public static void main(String[] args) {
        ListElement listElement = new ListElement();
        listElement.addMetod("Olga");
        listElement.addMetod("Tom");
        listElement.addMetod("Mark");
        listElement.addMetod("Tyna");
        listElement.addMetod("Suzan");
        listElement.addMetod("Didjo");
        listElement.addMetod("Milena");
        listElement.addMetod("Katya");
        listElement.addMetod("Stiven");
        listElement.addMetod("Liza");

        System.out.println(listElement.list);

        listElement.remoteElement(listElement.list.toString());

        System.out.println();
        System.out.println(listElement.list);
    }
}
