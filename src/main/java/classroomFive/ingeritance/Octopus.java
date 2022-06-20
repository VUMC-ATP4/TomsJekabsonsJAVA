package classroomFive.ingeritance;

public class Octopus extends Animal {

    String waterType = "Sālsūdens";

    public Octopus(int legCount, String name) {
        super(legCount, name);
    }

    public void printWaterType (){
        System.out.println(waterType);
    }

    @Override
    public void makeSound(){
        System.out.println("Es esmu astoņkājis.....");
    }

}
