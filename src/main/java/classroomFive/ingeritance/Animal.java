package classroomFive.ingeritance;

public class Animal {
    int legCount;
    String name;

    public Animal(int legCount, String name){
        this.legCount = legCount;
        this.name = name;
    }


    // metode kas izprintē kāju skaitu uz ekrāna

    public void printLegCount (){
        System.out.println("Vārds: " + name + "Kāju skaits ir: " + legCount);
    }


    public void makeSound(){
        System.out.println("Es esmu dzīvnieks. Arhhgggg...");
    }

}
