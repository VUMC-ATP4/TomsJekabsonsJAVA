package classroomFive.ingeritance;

public class Example {
    public static void main(String[] args) {
        Dog dog1 = new Dog(4, "Reksis");
        Animal dog2 = new Dog(4, "Reksis");

        Octopus octopus1 = new Octopus(8, "Astoņkājis");
        Chicken chicken1 = new Chicken(2, "Fredis");
        Chicken vistaArVienuKaju = new Chicken(1, "Melnā vista");

        // no new + animal public voida
        dog1.printLegCount();
        octopus1.printLegCount();
        chicken1.printLegCount();
        vistaArVienuKaju.printLegCount();

        System.out.println("##########################\n");

//        System.out.println(octopus1.waterType); // definēts tikai vienā klasē un citās nav!
//        System.out.println(dog1.waterType); // Nav definēts konkrētajā klasē!
//        octopus1.printWaterType(); // tikai no vienas klases ņem info!


        Fox lapsa = new Fox("Kūmiņš", 4);
//        int[] ieluNumuri = {1,2,3,4,5,6}; // Piemērs masīviem
        Animal [] dzivnieki = {dog1, octopus1, vistaArVienuKaju, chicken1};

        //Cikls for
        for (int i = 0; i < dzivnieki.length; i++) {
            dzivnieki[i].printLegCount();
        }
        System.out.println("##########################\n");

        dog1.makeSound();
        chicken1.makeSound();
        octopus1.makeSound();



    }
}
