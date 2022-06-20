package classroomFive.statika;

public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car("BMW","Melns");
        System.out.println("Auto skaits sistēmā: " + auto1.countOfCarsCreatedInSystem);

        Car auto2 = new Car("Mercedes", "Balts");
        System.out.println("Auto skaits sistēmā: " + auto2.countOfCarsCreatedInSystem);



        auto1.klasesApraksts = "  Šī ir auto klase";

        System.out.println("######################");

        System.out.println("Auto1: " + auto1.getColor() + " " + auto1.getName() + auto1.klasesApraksts);
        System.out.println("Auto2: " + auto2.getColor() + " " + auto2.getName() + auto2.klasesApraksts);

        System.out.println("######################");

        Car.makeSound();
        auto1.makeSound();
        auto2.makeSound();
    }
}
