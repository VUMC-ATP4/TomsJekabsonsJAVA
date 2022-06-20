package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Bird putns = new Bird();
//        putns.name = "Pollija"; // privāts
//        putns.colour = "Sarkana";
        putns.setColour("Sarkana");
        System.out.println(putns.getColour());
        putns.printText();
//        putns.printTextSpecial(); // privāta metode

        putns.defaultMethodExample();

        System.out.println("#################################");
        Human cilveks = new Human();

        cilveks.setAge(20);
        System.out.println(cilveks.getAge());
        cilveks.setHeight(185);
        System.out.println(cilveks.getHeight());
        cilveks.setName("Toms");
        System.out.println(cilveks.getName());
        cilveks.setSurname("Jēkabsons");
        System.out.println(cilveks.getSurname());

        System.out.println("#################################");

        Matematika matematika = new Matematika();

        System.out.println(matematika.add(30,20));
        System.out.println(matematika.add(1.3,3.5));

        matematika.paraditTekstu("Juris");
        matematika.paraditTekstu("Juris", true);
        matematika.paraditTekstu("Anna", false);
    }
}
