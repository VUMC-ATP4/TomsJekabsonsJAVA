package classroomFive.statika;

public class Car {
    private String name;
    private String color;
    public static String klasesApraksts;
    public static int countOfCarsCreatedInSystem;





    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        countOfCarsCreatedInSystem++;
    }

    public static void makeSound(){
        System.out.println("Honk Honk");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
